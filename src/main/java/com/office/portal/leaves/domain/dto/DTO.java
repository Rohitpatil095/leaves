package com.office.portal.leaves.domain.dto;

import com.office.portal.leaves.domain.entity.ApplyLeave;
import com.office.portal.leaves.domain.entity.Leaves;
import com.office.portal.leaves.infra.request.ApplyLeaveRequest;
import com.office.portal.leaves.infra.request.Status;
import com.office.portal.leaves.infra.response.ApplyLeaveResponse;
import com.office.portal.leaves.infra.response.FetchPendingStatusResponseList;

public class DTO {
    private ApplyLeaveResponse applyLeaveResponse;
    private ApplyLeaveRequest applyLeaveRequest;
    private ApplyLeave applyLeave;
    private Leaves leaves;
    private Status status;
    private FetchPendingStatusResponseList fetchPendingStatusResponseList;
//    private String leaveId;
    
    
    public ApplyLeave getApplyLeave() {
        return applyLeave;
    }
    
    

    public FetchPendingStatusResponseList getFetchPendingStatusResponseList() {
		return fetchPendingStatusResponseList;
	}



	public void setFetchPendingStatusResponseList(FetchPendingStatusResponseList fetchPendingStatusResponseList) {
		this.fetchPendingStatusResponseList = fetchPendingStatusResponseList;
	}



	public Status getStatus() {
		return status;
	}



	public void setStatus(Status status) {
		this.status = status;
	}



	public void setApplyLeave(ApplyLeave applyLeave) {
        this.applyLeave = applyLeave;
    }

    public Leaves getLeaves() {
        return leaves;
    }

    public void setLeaves(Leaves leaves) {
        this.leaves = leaves;
    }

    public ApplyLeaveResponse getApplyLeaveResponse() {
        return applyLeaveResponse;
    }

    public void setApplyLeaveResponse(ApplyLeaveResponse applyLeaveResponse) {
        this.applyLeaveResponse = applyLeaveResponse;
    }

    public ApplyLeaveRequest getApplyLeaveRequest() {
        return applyLeaveRequest;
    }

    public void setApplyLeaveRequest(ApplyLeaveRequest applyLeaveRequest) {
        this.applyLeaveRequest = applyLeaveRequest;
    }
}
