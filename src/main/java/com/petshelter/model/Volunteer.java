package com.petshelter.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Volunteeres")
public class Volunteer {
    @Id
    private String nid;
    private String fullName;
    private String phone;
    private String email;
    private String levelOfCommitment;

    public Volunteer() {
    }

    public Volunteer(String nid, String fullName, String phone, String email, String levelOfCommitment) {
        this.nid = nid;
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.levelOfCommitment = levelOfCommitment;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevelOfCommitment() {
        return levelOfCommitment;
    }

    public void setLevelOfCommitment(String levelOfCommitment) {
        this.levelOfCommitment = levelOfCommitment;
    }
}
