package com.voter_api_master.voter_initialization.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "voter_table",catalog = "voter_db")
public class VoterModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long voterId;
    private String voterName;
    private String address;
    private String city;
    private String state;
    private Date addedDate = new Date();
    public VoterModel(){
        super();
    }

    public VoterModel(long voterId, String voterName, String address, String city,
                      String state, Date addedDate) {
        this.voterId = voterId;
        this.voterName = voterName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.addedDate = addedDate;
    }

    public long getVoterId() {
        return voterId;
    }

    public void setVoterId(long voterId) {
        this.voterId = voterId;
    }

    public String getVoterName() {
        return voterName;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }



}
