/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.51).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.customercare.fai.Update.Workflow.Status.API.controller;

import com.customercare.fai.Update.Workflow.Status.API.model.ErrorDetails;
import com.customercare.fai.Update.Workflow.Status.API.model.WorkflowStatusUpdateRequest;
import com.customercare.fai.Update.Workflow.Status.API.model.WorkflowStatusUpdateResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-11-28T14:55:11.969142400+05:30[Asia/Calcutta]")
@Validated
public interface WorkflowStatusUpdateApi {

    @Operation(summary = "This method allows to update workflow status based on country code.", description = "This API is dedicated to update the workflow status in any one of applications (FIRA, CIRA, LTK, LARA) system based on country.", security = {
        @SecurityRequirement(name = "oAuthBE", scopes = {
            "updatestatus:write:be"        }),
@SecurityRequirement(name = "oAuthFE", scopes = {
            "updatestatus:write:fe"        })    }, tags={ "Workflow Status Update" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful Operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = WorkflowStatusUpdateResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad request (invalid or missing required fields)", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDetails.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDetails.class))) })
    @RequestMapping(value = "/updateStatus",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Object> updateStatus(@Parameter(in = ParameterIn.DEFAULT, description = "<p> Workflow Status Update Request", required=true, schema=@Schema()) @Valid @RequestBody WorkflowStatusUpdateRequest body
);

}

