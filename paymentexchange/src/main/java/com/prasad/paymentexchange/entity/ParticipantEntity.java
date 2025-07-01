package com.prasad.paymentexchange.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "ENTITY_PARTICIPANT", schema = "REGISTRY")
@Getter
@Setter
@ToString
public class ParticipantEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(name = "PARTICIPANT_ID")
	private String participantId;
	
	@Column(name = "NAME_EN")
	private String nameEn;
	
	@Column(name = "NAME_FR")
	private String nameFr;
	
	@Column(name = "SHORT_NAME_EN")
	private String shortNameEn;
	
	@Column(name = "SHORT_NAME_FR")
	private String shortNameFr;
	
	@Column(name = "EP_TYPE")
	private String epType;
	
	@Column(name = "REASON")
	private String reason;
	
	@Column(name = "SA_FLAG")
	private boolean saFlag;
	
	@Column(name = "P2P_FLAG")
	private boolean p2pFlag;
	
	@Column(name = "START_TIME")
	private LocalDateTime startTime;
	
	@Column(name = "END_TIME")
	private LocalDateTime endTime;
	
	@Column(name = "CREATED_BY")
	private String createdBy;
	
	@Column(name = "CREATED_ON")
	private LocalDateTime createdOn;
	
	@Column(name = "STATUS")
	private String status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
