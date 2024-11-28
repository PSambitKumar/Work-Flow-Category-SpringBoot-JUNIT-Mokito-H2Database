package com.customercare.fai.Update.Workflow.Status.API.exception;

import com.customercare.fai.Update.Workflow.Status.API.model.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Project : Update-Workflow-Status-API
 * @Author : sambitkumar.pradhan (1361629)
 * @Created On : 11/28/2024 4:23 PM
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ErrorDetails> handleBadRequestException(BadRequestException ex) {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setCode(ex.getErrorCode());
        errorDetails.setReason("Bad request");
        errorDetails.setDescription(ex.getErrorDescription());

        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InternalServerErrorException.class)
    public ResponseEntity<ErrorDetails> handleInternalServerErrorException(InternalServerErrorException ex) {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setCode(ex.getErrorCode());
        errorDetails.setReason("Internal Server Error");
        errorDetails.setDescription(ex.getErrorDescription());

        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

