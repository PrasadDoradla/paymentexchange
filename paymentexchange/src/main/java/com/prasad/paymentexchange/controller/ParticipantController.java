package com.prasad.paymentexchange.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prasad.paymentexchange.request.CreateParticipantRequest;
import com.prasad.paymentexchange.request.UpdateParticipantRequest;
import com.prasad.paymentexchange.response.ParticipantResponse;
import com.prasad.paymentexchange.service.ParticipantService;

@RestController
@RequestMapping("/participant")
public class ParticipantController {
	
	private ParticipantService participantService;
	
	public ParticipantController(ParticipantService participantService) {
		this.participantService = participantService;
	}

	/**
	 * Returns participant of given participant id
	 * 
	 * @param participantId
	 * @return ResponseEntity<ParticipantResponse>
	 */
	@GetMapping(value = "/{participantId}")
	public ResponseEntity<ParticipantResponse> getParticipantById(@PathVariable String participantId) {
		ParticipantResponse participant = participantService.getParticipantById(participantId);
		return ResponseEntity.ok(participant);
	}
	
	/**
	 * Creates new participant
	 * 
	 * @param participant
	 * @return ResponseEntity<ParticipantResponse>
	 */
	@PostMapping
	public ResponseEntity<ParticipantResponse> createParticipant(@RequestBody CreateParticipantRequest participant) {
		ParticipantResponse participantResponse = participantService.createParticipant(participant);
		return ResponseEntity.ok(participantResponse);
	}
	
	/**
	 * Updates participant
	 * 
	 * @param participant
	 * @return ResponseEntity<ParticipantResponse>
	 */
	@PatchMapping(value = "/{participantId}")
	public ResponseEntity<ParticipantResponse> updateParticipant(@PathVariable String participantId, @RequestBody UpdateParticipantRequest participant) {
		ParticipantResponse participantResponse = participantService.updateParticipant(participantId, participant);
		return ResponseEntity.ok(participantResponse);
	}
	
	/**
	 * Deletes existing participant based on the given id
	 * @param participantId
	 * @return ResponseEntity<Boolean>
	 */
	@DeleteMapping(value = "/{participantId}")
	public ResponseEntity<Boolean> deleteParticipantById(@PathVariable String participantId) {
		participantService.deleteParticipantById(participantId);
		return ResponseEntity.ok(true);
	}
	
}
