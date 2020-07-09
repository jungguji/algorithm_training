package algorithm.programmers.level2.practice;

import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {
    public int solution(int[] nums) {
        int selectPokemon = nums.length / 2;

        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        int answer = selectPokemon < set.size() ? selectPokemon : set.size();
        return answer;
    }
}
