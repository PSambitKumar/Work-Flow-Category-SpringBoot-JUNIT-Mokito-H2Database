package com.customercare.fai.Update.Workflow.Status.API.entity;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "JOB_HEADERS")
public class WorkflowStatus {

    @Id
    @NotNull
    @Size(max = 20, message = "booking Ref")
    @Column(name = "BOOKING_REFERENCE", unique = true, nullable = false, length = 20)
    @JsonProperty("BOOKING_REFERENCE")
    private long bookingRef;
    @Size(message = "status")
    @Column(name = "STATUS", nullable = false)
    @JsonProperty("STATUS")
    private String status;
    @Size(message = "country Code")
    @Column(name = "COUNTRY_CODE", nullable = false)
    @JsonProperty("COUNTRY_CODE")
    private String countryCode;

    public long getBookingRef() {
        return bookingRef;
    }

    public void setBookingRef(long bookingRef) {
        this.bookingRef = bookingRef;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "Workflow{" +
                "bookingRef=" + bookingRef +
                ", status='" + status + '\'' +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }
}
