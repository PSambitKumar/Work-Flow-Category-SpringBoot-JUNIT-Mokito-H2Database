package com.customercare.fai.Update.Workflow.Status.API.exception;

/**
 * @Project : Update-Workflow-Status-API
 * @Author : sambitkumar.pradhan (1361629)
 * @Created On : 11/28/2024 4:20 PM
 */
public class BadRequestException extends RuntimeException {
    private final String errorCode;
    private final String errorDescription;

    public BadRequestException(String errorCode, String errorDescription) {
        super("Bad Request: " + errorDescription);
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorDescription() {
        return errorDescription;
    }
}
