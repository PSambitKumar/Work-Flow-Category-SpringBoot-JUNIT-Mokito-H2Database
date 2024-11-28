package com.customercare.fai.Update.Workflow.Status.API.controller;


import com.customercare.fai.Update.Workflow.Status.API.model.WorkflowStatusUpdateRequest;
import com.customercare.fai.Update.Workflow.Status.API.model.WorkflowStatusUpdateResponse;
import com.customercare.fai.Update.Workflow.Status.API.service.WorkflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/gbsera/customercare/fai/v1")
public class WorkflowController implements WorkflowStatusUpdateApi {

    @Autowired
    private WorkflowService workflowService;

    @PutMapping("/updateStatus")
    public ResponseEntity<Object> updateStatus(@RequestBody WorkflowStatusUpdateRequest body) {
        return new ResponseEntity<>(workflowService.updateBookingStatus(body), HttpStatus.OK);
    }
}
