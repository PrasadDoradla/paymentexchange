package com.prasad.paymentexchange.request;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UpdateParticipantRequest {

	private String participantId;
	private String nameEn;
	private String nameFr;
	private String shortNameEn;
	private String shortNameFr;
	private String epType;
	private String reason;
	private boolean saFlag;
	private boolean p2pFlag;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private String updatedBy;
	private LocalDateTime updatedOn;
	private String status;
	
	public String getParticipantId() {
		return participantId;
	}
	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}
	public String getNameEn() {
		return nameEn;
	}
	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}
	public String getNameFr() {
		return nameFr;
	}
	public void setNameFr(String nameFr) {
		this.nameFr = nameFr;
	}
	public String getShortNameEn() {
		return shortNameEn;
	}
	public void setShortNameEn(String shortNameEn) {
		this.shortNameEn = shortNameEn;
	}
	public String getShortNameFr() {
		return shortNameFr;
	}
	public void setShortNameFr(String shortNameFr) {
		this.shortNameFr = shortNameFr;
	}
	public String getEpType() {
		return epType;
	}
	public void setEpType(String epType) {
		this.epType = epType;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public boolean isSaFlag() {
		return saFlag;
	}
	public void setSaFlag(boolean saFlag) {
		this.saFlag = saFlag;
	}
	public boolean isP2pFlag() {
		return p2pFlag;
	}
	public void setP2pFlag(boolean p2pFlag) {
		this.p2pFlag = p2pFlag;
	}
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public LocalDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
