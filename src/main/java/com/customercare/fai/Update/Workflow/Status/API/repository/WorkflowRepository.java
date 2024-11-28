package com.customercare.fai.Update.Workflow.Status.API.repository;

import com.customercare.fai.Update.Workflow.Status.API.entity.WorkflowStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface WorkflowRepository extends JpaRepository<WorkflowStatus, String> {

    @Modifying
    @Transactional
    @Query("update WorkflowStatus w set w.status = ?1 where w.bookingRef = ?3 and w.countryCode = ?2")
    int updateBookingStatus(String status, String countryCode, long bookingRef);

}
