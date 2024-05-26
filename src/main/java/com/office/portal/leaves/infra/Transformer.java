package com.office.portal.leaves.infra;

import com.office.portal.leaves.domain.dto.DTO;
import com.office.portal.leaves.domain.entity.ApplyLeave;
import com.office.portal.leaves.infra.response.ApplyLeaveResponse;
import com.office.portal.leaves.infra.response.FetchPendingStatusResponse;
import com.office.portal.leaves.infra.response.FetchPendingStatusResponseList;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class Transformer {
    public DTO transformDtoToApplyLeave(DTO dto) {
        ApplyLeave applyLeave = new ApplyLeave();
        dto.setApplyLeave(applyLeave);
        dto.getApplyLeave().setNumberOfLeaves( dto.getApplyLeaveRequest().getNumberOfLeaves());
        dto.getApplyLeave().setLeaveType(dto.getApplyLeaveRequest().getLeaveType());
        dto.getApplyLeave().setStatus("Pending");
        dto.getApplyLeave().setFromDate(dto.getApplyLeaveRequest().getFromDate());
        dto.getApplyLeave().setToDate(dto.getApplyLeaveRequest().getToDate());
        dto.getApplyLeave().setEmployeeReference(dto.getApplyLeaveRequest().getEmployeeRef());
        
        //custome lgoic to form leavvre id
        
		LocalDateTime now = LocalDateTime.now(); 
//			Date temp=null;
//			temp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSS").parse(now.toString());
		dto.getApplyLeave().setLeaveId(dto.getApplyLeaveRequest().getEmployeeRef() + "-"+now.toString().replace("-", "")
				.replace(":", ""));
        
        return dto;
    }

    public DTO transformDtoToApplyLeaveResponse(DTO dto, ArrayList<ApplyLeave> leaveRecord) {
        ApplyLeaveResponse applyLeaveResponse = new ApplyLeaveResponse();
        String LevId = leaveRecord.get(0).getId() + leaveRecord.get(0).getEmployeeReference();
        applyLeaveResponse.setStatus("Pending");
        applyLeaveResponse.setAcknowledgement("Success");
        applyLeaveResponse.setLeaveId(LevId);
        dto.setApplyLeaveResponse(applyLeaveResponse);
        return dto;
    }

	public DTO transformfetchPendingRecordToList(
			ArrayList<FetchPendingStatusResponse> fetchPendingStatusResponseList,DTO dto) {
		FetchPendingStatusResponseList fetchPendingStatusResponseList2 = new FetchPendingStatusResponseList();
		fetchPendingStatusResponseList2.setFetchPendingStatusResponseList(fetchPendingStatusResponseList);
		dto.setFetchPendingStatusResponseList(fetchPendingStatusResponseList2);
		return dto;
	}
}
