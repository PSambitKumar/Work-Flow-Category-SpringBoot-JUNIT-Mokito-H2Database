package com.customercare.fai.Update.Workflow.Status.API.service.impl;

import com.customercare.fai.Update.Workflow.Status.API.exception.BadRequestException;
import com.customercare.fai.Update.Workflow.Status.API.exception.InternalServerErrorException;
import com.customercare.fai.Update.Workflow.Status.API.model.WorkflowStatusUpdateRequest;
import com.customercare.fai.Update.Workflow.Status.API.repository.WorkflowRepository;
import com.customercare.fai.Update.Workflow.Status.API.service.WorkflowService;
import com.customercare.fai.Update.Workflow.Status.API.util.StringUtils;
import com.customercare.fai.Update.Workflow.Status.API.util.WorkFlowUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkflowServiceimpl implements WorkflowService {

    private final WorkflowRepository workflowRepository;

    @Autowired
    WorkflowServiceimpl(WorkflowRepository workflowRepository) {
        this.workflowRepository = workflowRepository;
    }

    @Override
    public Object updateBookingStatus(WorkflowStatusUpdateRequest workflow) {
        if (StringUtils.isNullOrEmpty(workflow.getStatus()) || StringUtils.isNullOrEmpty(workflow.getCountryCode())) {
            throw new BadRequestException("400", "Status and Country Code cannot be null or empty.");
        }

        long bookingRef;
        try {
            bookingRef = Long.parseLong(workflow.getBookingRef());
        } catch (NumberFormatException e) {
            throw new BadRequestException("400", "Invalid booking reference format.");
        }

        // Perform the status update operation
        int updateBookingStatus = workflowRepository.updateBookingStatus(workflow.getStatus(), workflow.getCountryCode(), bookingRef);

        // Check result and return appropriate response
        if (updateBookingStatus == 1) {
            return WorkFlowUtils.createSuccessResponse(workflow.getBookingRef());
        } else {
            throw new InternalServerErrorException("500", "Something went wrong during the update process.");
        }
    }
}
