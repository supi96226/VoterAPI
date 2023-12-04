package com.voter_api_master.voter_initialization.service_interface;

import java.util.Optional;
import com.voter_api_master.voter_initialization.model.VoterModel;

import java.util.List;

public interface VoterInterface {

    public VoterModel saveVoter(VoterModel voterModel);

    public VoterModel updateVoter(VoterModel voterModel);

    public List<VoterModel> findAllVoter();

    public Optional<VoterModel> getVoterData(long id);

    public void deleteVoter(long id);
}