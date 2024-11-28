package com.customercare.fai.Update.Workflow.Status.API.util;

import com.customercare.fai.Update.Workflow.Status.API.model.ErrorDetails;
import com.customercare.fai.Update.Workflow.Status.API.model.WorkflowStatusUpdateResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project : Update-Workflow-Status-API
 * @Author : sambitkumar.pradhan (1361629)
 * @Created On : 11/28/2024 2:10 PM
 */
public class WorkFlowUtils {
    WorkFlowUtils() {}

    // Utility method to create a success response
    public static WorkflowStatusUpdateResponse createSuccessResponse(String bookingRef) {
        WorkflowStatusUpdateResponse response = new WorkflowStatusUpdateResponse();
        response.setBookingRef(bookingRef);
        response.setSuccess(true);
        response.setErrors(new ArrayList<>());
        return response;
    }

    // Utility method to create an error response
    public static ErrorDetails createErrorResponse(String errorMessage, String errorCode, String errorDesc) {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setCode(errorCode);
        errorDetails.setReason(errorMessage);
        errorDetails.setDescription(errorDesc);
        return errorDetails;
    }
}
