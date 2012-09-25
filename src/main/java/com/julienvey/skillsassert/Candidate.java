package com.julienvey.skillsassert;

import java.util.Set;

public class Candidate {

    private String firstName;
    private String lastName;
    private int yearsOfExperience;
    private Set<String> spokenLanguages;
    private Set<String> fluentLanguages;
    private Set<String> knownTechs;
    private Set<String> expertTechs;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Set<String> getKnownTechs() {
        return knownTechs;
    }

    public void setKnownTechs(Set<String> knownTechs) {
        this.knownTechs = knownTechs;
    }

    public Set<String> getExpertTechs() {
        return expertTechs;
    }

    public void setExpertTechs(Set<String> expertTechs) {
        this.expertTechs = expertTechs;
    }

    public Set<String> getSpokenLanguages() {
        return spokenLanguages;
    }

    public void setSpokenLanguages(Set<String> spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
    }

    public Set<String> getFluentLanguages() {
        return fluentLanguages;
    }

    public void setFluentLanguages(Set<String> fluentLanguages) {
        this.fluentLanguages = fluentLanguages;
    }

}
