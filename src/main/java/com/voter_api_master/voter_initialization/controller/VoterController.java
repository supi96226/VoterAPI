package com.voter_api_master.voter_initialization.controller;

import java.util.Optional;

import com.voter_api_master.voter_initialization.model.VoterModel;
import com.voter_api_master.voter_initialization.service_implementation.VoterImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin("*")
public class VoterController {

    @Autowired
    private VoterImplementation voterImplementation;

    @PostMapping(value = "saveVoter")
    public VoterModel saveVoter(@RequestBody VoterModel voterModel){
        System.out.println("Voter added successfully");
        voterImplementation.saveVoter((voterModel));
        return voterModel;
    }

    @GetMapping(value = "getAllVoter")
    public List<VoterModel> findAllVoter(){
        return  voterImplementation.findAllVoter();
    }

    @GetMapping(value = "getVoterData/{id}")
    public VoterModel getVoterData(@PathVariable ("id") Long id){
        Optional<VoterModel> dataRow = voterImplementation.getVoterData(id);
        if(dataRow.isPresent()){
            return dataRow.get();
        }
        return null;
    }

    @PutMapping("updateVoter")
    public VoterModel updateVoter(@RequestBody VoterModel voterModel){
        return voterImplementation.updateVoter(voterModel);
    }

    @DeleteMapping("deleteVoter")
    public String deleteVoter(@RequestParam long id){
        voterImplementation.deleteVoter(id);
        return "Voter deleted!";
    }

}

