package com.customercare.fai.Update.Workflow.Status.API.service;

import com.customercare.fai.Update.Workflow.Status.API.model.WorkflowStatusUpdateRequest;

public interface WorkflowService {
    Object updateBookingStatus(WorkflowStatusUpdateRequest request);
}
