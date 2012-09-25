package com.julienvey.skillsassert.assertions;

import com.julienvey.skillsassert.Candidate;
import com.julienvey.skillsassert.exception.CandidateAssertionError;

import java.util.Set;

public class CandidateAssert {

    private Candidate candidate;

    public CandidateAssert(Candidate candidate) {
        this.candidate = candidate;
    }

    public CandidateAssert knows(String... tech) {
        assertIsInSet("Candidate doesn't know", tech, candidate.getKnownTechs(), candidate.getExpertTechs());
        return this;
    }

    public CandidateAssert isExpertIn(String... tech) {
        assertIsInSet("Candidate is not expert in", tech, candidate.getExpertTechs());
        return this;
    }

    public CandidateAssert yearsOfExperienceMin(int years) {
        if (candidate.getYearsOfExperience() < years) {
            throw new CandidateAssertionError("Candidate has not " + years + " of Experience");
        }
        return this;
    }

    public CandidateAssert speaks(String... languages){
        assertIsInSet("Candidate doesn't speak", languages, candidate.getSpokenLanguages(), candidate.getFluentLanguages());
        return this;
    }

    public CandidateAssert isFluentIn(String languages){
        assertIsInSet("Candidate is not fluent in", languages, candidate.getFluentLanguages());
        return this;
    }

    private void assertIsInSet(String msg, String[] values, Set<String>... sets) {
        for (String value : values) {
            assertIsInSet(msg, value, sets);
        }
    }

    private void assertIsInSet(String msg, String value, Set<String>... sets) {
        boolean found = false;
        for (Set<String> set : sets) {
            if (set.contains(value)) {
                found = true;
            }
        }
        if (!found) throw new CandidateAssertionError(msg + " " + value);
    }


}
