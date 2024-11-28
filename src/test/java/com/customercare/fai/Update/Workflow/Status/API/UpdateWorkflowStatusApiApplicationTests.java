package com.customercare.fai.Update.Workflow.Status.API;

import com.customercare.fai.Update.Workflow.Status.API.exception.BadRequestException;
import com.customercare.fai.Update.Workflow.Status.API.exception.InternalServerErrorException;
import org.junit.jupiter.api.Test;
import com.customercare.fai.Update.Workflow.Status.API.controller.WorkflowController;
import com.customercare.fai.Update.Workflow.Status.API.model.WorkflowStatusUpdateRequest;
import com.customercare.fai.Update.Workflow.Status.API.model.WorkflowStatusUpdateResponse;
import com.customercare.fai.Update.Workflow.Status.API.service.impl.WorkflowServiceimpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UpdateWorkflowStatusApiApplicationTests {

    @InjectMocks
    private WorkflowController workflowController;

    @Mock
    private WorkflowServiceimpl workflowService;

    private WorkflowStatusUpdateRequest request;

    @BeforeEach
    void setUp() {
        request = new WorkflowStatusUpdateRequest();
        request.setBookingRef("123456");
        request.setStatus("COMPLETED");
        request.setCountryCode("IN");
    }

    @Test
    void testUpdateStatus_Success() {
        WorkflowStatusUpdateResponse expectedResponse = new WorkflowStatusUpdateResponse();
        expectedResponse.setBookingRef("123456");
        expectedResponse.setSuccess(true);
        expectedResponse.setErrors(new ArrayList<>());

        when(workflowService.updateBookingStatus(any(WorkflowStatusUpdateRequest.class)))
                .thenReturn(expectedResponse);  // Mock the service method

        ResponseEntity<Object> response = workflowController.updateStatus(request);
        System.out.println(response);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());

        WorkflowStatusUpdateResponse responseBody = (WorkflowStatusUpdateResponse) response.getBody();
        assertEquals("123456", responseBody.getBookingRef());
        assertTrue(responseBody.isSuccess());

        verify(workflowService).updateBookingStatus(any(WorkflowStatusUpdateRequest.class));
    }

    @Test
    void testUpdateStatus_BadRequest_MissingFields() {
        request.setStatus(null);
        request.setCountryCode(null);

        when(workflowService.updateBookingStatus(any(WorkflowStatusUpdateRequest.class)))
                .thenThrow(new BadRequestException("400", "Status and Country Code cannot be null or empty."));

        BadRequestException exception = assertThrows(BadRequestException.class, () -> {
            workflowController.updateStatus(request);
        });
        System.out.println(exception.toString());

        assertEquals("400", exception.getErrorCode());
        assertEquals("Status and Country Code cannot be null or empty.", exception.getErrorDescription());

        verify(workflowService, times(1)).updateBookingStatus(any(WorkflowStatusUpdateRequest.class));
    }

    @Test
    void testUpdateStatus_InvalidBookingRef() {
        request.setBookingRef("invalid");

        when(workflowService.updateBookingStatus(any(WorkflowStatusUpdateRequest.class)))
                .thenThrow(new BadRequestException("400", "Invalid booking reference format."));

        BadRequestException exception = assertThrows(BadRequestException.class, () -> {
            workflowController.updateStatus(request);
        });

        assertEquals("400", exception.getErrorCode());
        assertEquals("Invalid booking reference format.", exception.getErrorDescription());

        verify(workflowService).updateBookingStatus(any(WorkflowStatusUpdateRequest.class));
    }

    @Test
    void testUpdateStatus_InternalServerError() {
        when(workflowService.updateBookingStatus(any(WorkflowStatusUpdateRequest.class)))
                .thenThrow(new InternalServerErrorException("500", "Something went wrong during the update process."));

        InternalServerErrorException exception = assertThrows(InternalServerErrorException.class, () -> {
            workflowController.updateStatus(request);
        });

        assertEquals("500", exception.getErrorCode());
        assertEquals("Something went wrong during the update process.", exception.getErrorDescription());

        verify(workflowService).updateBookingStatus(any(WorkflowStatusUpdateRequest.class));
    }
}
