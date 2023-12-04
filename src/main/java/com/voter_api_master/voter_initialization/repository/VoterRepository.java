package com.voter_api_master.voter_initialization.repository;


import com.voter_api_master.voter_initialization.model.VoterModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoterRepository extends CrudRepository<VoterModel,Long> {
}