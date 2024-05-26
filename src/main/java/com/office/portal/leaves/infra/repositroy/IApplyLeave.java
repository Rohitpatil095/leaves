package com.office.portal.leaves.infra.repositroy;

import com.office.portal.leaves.domain.entity.ApplyLeave;
import com.office.portal.leaves.infra.response.FetchPendingStatusResponse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;

@Repository
public interface IApplyLeave extends JpaRepository<ApplyLeave,Long> {
    ArrayList<ApplyLeave> findByEmployeeReference(String employeeReference);
    
   @Query("SELECT new com.office.portal.leaves.infra.response.FetchPendingStatusResponse"
    		+ "(e.employeeReference, e.leaveId,e.status, e.fromDate,e.toDate) "
    		+ "FROM ApplyLeave e WHERE e.status = :status")
    ArrayList<FetchPendingStatusResponse> fetchRecordsPendingStatus(@Param("status") String status);
}

//String employeeReference;
//String leaveId; 
//String status;
//LocalDate fromDate;
//LocalDate toDate;
