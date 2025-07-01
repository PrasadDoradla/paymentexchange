package com.prasad.paymentexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prasad.paymentexchange.entity.ParticipantEntity;

import jakarta.transaction.Transactional;

@Repository
public interface ParticipantRepository extends JpaRepository<ParticipantEntity, String> {
	
	@Query(nativeQuery = true, value = "select rp.* from registry.entity_participant rp where rp.participant_id = :participantId")
	public ParticipantEntity getParticipantByParticipantId(String participantId);
	
	@Transactional
	@Modifying
	@Query(nativeQuery = true, value = "delete from registry.entity_participant rp where rp.participant_id = :participantId")
	public void deleteParticipantByParticipantId(String participantId);

}
