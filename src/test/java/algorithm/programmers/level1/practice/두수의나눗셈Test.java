package algorithm.programmers.level1.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 두수의나눗셈Test {

    @Test
    void solution() {
        두수의나눗셈 sut = new 두수의나눗셈();
        int solution = sut.solution(7, 3);
        System.out.println("solution = " + solution);
    }
}