package com.prasad.paymentexchange.service;

import java.util.Objects;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prasad.paymentexchange.entity.ParticipantEntity;
import com.prasad.paymentexchange.repository.ParticipantRepository;
import com.prasad.paymentexchange.request.CreateParticipantRequest;
import com.prasad.paymentexchange.request.UpdateParticipantRequest;
import com.prasad.paymentexchange.response.ParticipantResponse;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ParticipantService {

	@Autowired
	private ParticipantRepository participantRepository;

	public ParticipantResponse getParticipantById(String participantId) {
		ParticipantResponse participant = new ParticipantResponse();
		ParticipantEntity participantEntity = participantRepository.getParticipantByParticipantId(participantId);
		if (Objects.nonNull(participantEntity)) {
			BeanUtils.copyProperties(participantEntity, participant);
		}
		return participant;
	}

	public ParticipantResponse createParticipant(CreateParticipantRequest participant) {
		ParticipantEntity participantEntity = new ParticipantEntity();
		BeanUtils.copyProperties(participant, participantEntity);
		participantEntity = participantRepository.save(participantEntity);
		ParticipantResponse participantResponse = new ParticipantResponse();
		BeanUtils.copyProperties(participantEntity, participantResponse);
		return participantResponse;
	}

	public ParticipantResponse updateParticipant(String participantId, UpdateParticipantRequest participant) {
		ParticipantResponse participantResponse = new ParticipantResponse();
		ParticipantEntity participantEntity = participantRepository.getParticipantByParticipantId(participantId);
		if (Objects.isNull(participantEntity)) {
			throw new EntityNotFoundException("Participant not found for participant id: " + participantId);
		}
		BeanUtils.copyProperties(participant, participantEntity);
		ParticipantEntity updatedParticipantEntity = participantRepository.save(participantEntity);
		if (Objects.nonNull(updatedParticipantEntity)) {
			BeanUtils.copyProperties(updatedParticipantEntity, participantResponse);
		}
		return participantResponse;
	}

	public void deleteParticipantById(String participantId) {
		ParticipantEntity participantEntity = participantRepository.getParticipantByParticipantId(participantId);
		if (Objects.isNull(participantEntity)) {
			throw new EntityNotFoundException("Participant not found for participant id: " + participantId);
		}
		participantRepository.deleteParticipantByParticipantId(participantId);
	}

}
