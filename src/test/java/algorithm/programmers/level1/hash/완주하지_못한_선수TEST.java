package algorithm.programmers.level1.hash;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class 완주하지_못한_선수TEST {

    private 완주하지_못한_선수 test; 
    
    @BeforeEach
    public void setup() {
        test = new 완주하지_못한_선수();
    }
    
    @Test
    public void solutionTest() {
        String[] participant = new String[5];
        participant[0] = "marina";
        participant[1] = "josipa";
        participant[2] = "nikola";
        participant[3] = "nikola";
        participant[4] = "filipa";
        
        
        String[] completion = new String[participant.length-1];
        completion[0] = "josipa";
        completion[1] = "filipa";
        completion[2] = "marina";
        completion[3] = "nikola";
        
        assertThat(test.solution(participant, completion), is("nikola"));
    }
}
