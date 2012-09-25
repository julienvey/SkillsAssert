package com.julienvey.skillsassert.assertions;

import com.julienvey.skillsassert.Candidate;

public class Assertions {

    public static CandidateAssert assertThat(Candidate candidate){
        return new CandidateAssert(candidate);
    }
}
