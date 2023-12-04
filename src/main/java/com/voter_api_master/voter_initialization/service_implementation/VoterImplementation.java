package com.voter_api_master.voter_initialization.service_implementation;

import java.util.Optional;
import com.voter_api_master.voter_initialization.model.VoterModel;
import com.voter_api_master.voter_initialization.repository.VoterRepository;
import com.voter_api_master.voter_initialization.service_interface.VoterInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoterImplementation implements VoterInterface {

    @Autowired
    private VoterRepository voterRepository;
    @Override
    public VoterModel saveVoter(VoterModel voterModel) {
        return voterRepository.save(voterModel);
    }

    @Override
    public VoterModel updateVoter(VoterModel voterModel) {
        VoterModel existingVoterModel = voterRepository.findById(voterModel.getVoterId()).orElse(null);
        existingVoterModel.setVoterName(voterModel.getVoterName());
        existingVoterModel.setCity(voterModel.getCity());
        existingVoterModel.setAddress(voterModel.getAddress());
        existingVoterModel.setState(voterModel.getState());
        existingVoterModel.setAddedDate(voterModel.getAddedDate());
        return voterRepository.save(existingVoterModel);
    }

    @Override
    public List<VoterModel> findAllVoter() {
        return (List<VoterModel>) voterRepository.findAll();
    }

    @Override
    public Optional<VoterModel> getVoterData(long id) {
        return (Optional<VoterModel>) voterRepository.findById(id);
    }

    @Override
    public void deleteVoter(long id) {
        voterRepository.deleteById(id);

    }
}
