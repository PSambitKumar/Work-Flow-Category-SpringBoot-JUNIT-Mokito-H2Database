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
 * WorkflowStatusUpdateRequest
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-11-28T14:55:11.969142400+05:30[Asia/Calcutta]")


public class WorkflowStatusUpdateRequest  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("bookingRef")
  private String bookingRef = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  public WorkflowStatusUpdateRequest bookingRef(String bookingRef) {
    this.bookingRef = bookingRef;
    return this;
  }

  /**
   * Reason for the RFI.
   * @return bookingRef
   **/
  @Schema(example = "bookingRef1", required = true, description = "Reason for the RFI.")
      @NotNull

    public String getBookingRef() {
    return bookingRef;
  }

  public void setBookingRef(String bookingRef) {
    this.bookingRef = bookingRef;
  }

  public WorkflowStatusUpdateRequest status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status for the booking ref.
   * @return status
   **/
  @Schema(example = "Processing", required = true, description = "Status for the booking ref.")
      @NotNull

    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public WorkflowStatusUpdateRequest countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Country Code for the booking ref.
   * @return countryCode
   **/
  @Schema(example = "US", required = true, description = "Country Code for the booking ref.")
      @NotNull

    public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowStatusUpdateRequest workflowStatusUpdateRequest = (WorkflowStatusUpdateRequest) o;
    return Objects.equals(this.bookingRef, workflowStatusUpdateRequest.bookingRef) &&
        Objects.equals(this.status, workflowStatusUpdateRequest.status) &&
        Objects.equals(this.countryCode, workflowStatusUpdateRequest.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingRef, status, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowStatusUpdateRequest {\n");
    
    sb.append("    bookingRef: ").append(toIndentedString(bookingRef)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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
