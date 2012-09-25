package com.julienvey.skillsassert.assertions;

import static com.julienvey.skillsassert.assertions.Assertions.*;

import com.google.common.collect.Sets;
import com.julienvey.skillsassert.Candidate;
import com.julienvey.skillsassert.exception.CandidateAssertionError;
import org.junit.Before;
import org.junit.Test;

public class CandidateAssertionTest {

    private Candidate julienVey;

    @Before
    public void setUp() {
        julienVey = new Candidate();
        julienVey.setExpertTechs(Sets.newHashSet("GWT", "Java"));
        julienVey.setKnownTechs(Sets.newHashSet("Spring", "Hibernate", "Dart"));
        julienVey.setSpokenLanguages(Sets.newHashSet("German"));
        julienVey.setFluentLanguages(Sets.newHashSet("English"));
        julienVey.setFirstName("Julien");
        julienVey.setLastName("Vey");
        julienVey.setYearsOfExperience(2);
    }

    @Test
    public void julienTest() {
        assertThat(julienVey)
                .isExpertIn("GWT", "Java")
                .knows("Spring", "Hibernate", "Dart")
                .speaks("German")
                .isFluentIn("English")
                .yearsOfExperienceMin(2);
    }

    @Test(expected = CandidateAssertionError.class)
    public void julienTestFail1(){
        assertThat(julienVey).isExpertIn("Spring");
    }

    @Test(expected = CandidateAssertionError.class)
    public void julienTestFail2(){
        assertThat(julienVey).knows("Scala");
    }

    @Test(expected = CandidateAssertionError.class)
    public void julienTestFail3(){
        assertThat(julienVey).yearsOfExperienceMin(4);
    }

    @Test(expected = CandidateAssertionError.class)
    public void julienTestFail4(){
        assertThat(julienVey).speaks("Spanish");
    }

    @Test(expected = CandidateAssertionError.class)
    public void julienTestFail5(){
        assertThat(julienVey).isFluentIn("Spanish");
    }
}
