package org.openmrs.module.mycarehub.model;

import org.openmrs.BaseOpenmrsData;

import java.util.Date;

/**
 * A red flag is created when someone selects MEH, SAD and VERY_SAD as their mood in their @see
 * HealthDiary A red flag is automatically created based on a user's mood
 */
public class RedFlags extends BaseOpenmrsData {
	
	private Integer id;
	
	private String mycarehubId;
	
	private String request;
	
	private String requestType;
	
	private String screeningTool;
	
	private String screeningScore;
	
	private String status;
	
	private Date progressDate;
	
	private String progressBy;
	
	private Date dateResolved;
	
	// The person that resolved the service request
	private String resolvedBy;
	
	// The name of the patient
	private String clientName;
	
	// The contact information of the patient
	private String clientContact;
	
	/**
	 * The patient's Comprehensive Care Clinic(CCC) number
	 */
	private String cccNumber;
	
	// The facility code for this hospital
	private String mflCode;
	
	public RedFlags() {
	}
	
	@Override
	public Integer getId() {
		return id;
	}
	
	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getMycarehubId() {
		return mycarehubId;
	}
	
	public void setMycarehubId(String mycarehubId) {
		this.mycarehubId = mycarehubId;
	}
	
	public String getRequest() {
		return request;
	}
	
	public void setRequest(String request) {
		this.request = request;
	}
	
	public String getRequestType() {
		return requestType;
	}
	
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	
	public String getScreeningTool() {
		return screeningTool;
	}
	
	public void setScreeningTool(String screeningTool) {
		this.screeningTool = screeningTool;
	}
	
	public String getScreeningScore() {
		return screeningScore;
	}
	
	public void setScreeningScore(String screeningScore) {
		this.screeningScore = screeningScore;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Date getProgressDate() {
		return progressDate;
	}
	
	public void setProgressDate(Date progressDate) {
		this.progressDate = progressDate;
	}
	
	public String getProgressBy() {
		return progressBy;
	}
	
	public void setProgressBy(String progressBy) {
		this.progressBy = progressBy;
	}
	
	public Date getDateResolved() {
		return dateResolved;
	}
	
	public void setDateResolved(Date dateResolved) {
		this.dateResolved = dateResolved;
	}
	
	public String getResolvedBy() {
		return resolvedBy;
	}
	
	public void setResolvedBy(String resolvedBy) {
		this.resolvedBy = resolvedBy;
	}
	
	public String getClientName() {
		return clientName;
	}
	
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	public String getClientContact() {
		return clientContact;
	}
	
	public void setClientContact(String clientContact) {
		this.clientContact = clientContact;
	}
	
	public String getCccNumber() {
		return cccNumber;
	}
	
	public void setCccNumber(String cccNumber) {
		this.cccNumber = cccNumber;
	}
	
	public String getMflCode() {
		return mflCode;
	}
	
	public void setMflCode(String mflCode) {
		this.mflCode = mflCode;
	}
}
