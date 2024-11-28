package com.customercare.fai.Update.Workflow.Status.API.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * WorkflowStatusUpdateResponse
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-11-28T14:55:11.969142400+05:30[Asia/Calcutta]")


public class WorkflowStatusUpdateResponse  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("bookingRef")
  private String bookingRef = null;

  @JsonProperty("success")
  private Boolean success = null;

  @JsonProperty("errors")
  @Valid
  private List<String> errors = null;

  public WorkflowStatusUpdateResponse bookingRef(String bookingRef) {
    this.bookingRef = bookingRef;
    return this;
  }

  /**
   * Reference of the booking in the CMA CGM system
   * @return bookingRef
   **/
  @Schema(example = "bookingRef1", description = "Reference of the booking in the CMA CGM system")
  
    public String getBookingRef() {
    return bookingRef;
  }

  public void setBookingRef(String bookingRef) {
    this.bookingRef = bookingRef;
  }

  public WorkflowStatusUpdateResponse success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Will return true if status updated successfully
   * @return success
   **/
  @Schema(example = "true", description = "Will return true if status updated successfully")
  
    public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public WorkflowStatusUpdateResponse errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public WorkflowStatusUpdateResponse addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<String>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Returns the errors if any issues
   * @return errors
   **/
  @Schema(example = "[]", description = "Returns the errors if any issues")
  
    public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowStatusUpdateResponse workflowStatusUpdateResponse = (WorkflowStatusUpdateResponse) o;
    return Objects.equals(this.bookingRef, workflowStatusUpdateResponse.bookingRef) &&
        Objects.equals(this.success, workflowStatusUpdateResponse.success) &&
        Objects.equals(this.errors, workflowStatusUpdateResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingRef, success, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowStatusUpdateResponse {\n");
    
    sb.append("    bookingRef: ").append(toIndentedString(bookingRef)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
