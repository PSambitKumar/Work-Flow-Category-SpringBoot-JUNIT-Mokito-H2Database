package com.customercare.fai.Update.Workflow.Status.API.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * ErrorDetails
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-11-28T14:55:11.969142400+05:30[Asia/Calcutta]")


public class ErrorDetails  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  public ErrorDetails reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * HTTP error or Free text such as  Database Not Available , Invalid Credential, Mandatory, Invalid Format,  Invalid Length, ForbiddenValue, Invalid Data,...
   * @return reason
   **/
  @Schema(example = "500 Internal server error", description = "HTTP error or Free text such as  Database Not Available , Invalid Credential, Mandatory, Invalid Format,  Invalid Length, ForbiddenValue, Invalid Data,...")
  
    public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ErrorDetails code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Error Id, Application error ID, ....
   * @return code
   **/
  @Schema(example = "503", description = "Error Id, Application error ID, ....")
  
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ErrorDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Human-readable error description including Data and Value
   * @return description
   **/
  @Schema(example = "Cannot update workflow status", description = "Human-readable error description including Data and Value")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDetails errorDetails = (ErrorDetails) o;
    return Objects.equals(this.reason, errorDetails.reason) &&
        Objects.equals(this.code, errorDetails.code) &&
        Objects.equals(this.description, errorDetails.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetails {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
