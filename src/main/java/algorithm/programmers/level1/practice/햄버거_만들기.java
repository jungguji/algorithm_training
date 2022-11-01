package algorithm.programmers.level1.practice;

import java.util.Stack;

public class 햄버거_만들기 {

    /** 배열에 1,2,3,1,2,3, ...
     * 이런 순서로 넘어오는데
     * 1,2,3,1 연속적으로 담겨 있을 때 마다
     * 카운트 1 증가 시키고
     * 그 값을 return
     *
     * 상세
     * 돌아
     * 이번 수가 빵(1) 인지 확인
     * 빵이면 지금 top이 고기(3)인지 확인
     * 고기면 야채(2)인지 확인
     * 야채면 빵(1)인지 확인
     * 다 맞으면 1 증가
     * 한번이라도 틀리면 그냥 push
     *
     *
    */

    public int solution(int[] ingredient) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i : ingredient) {
            try {
                if (Ingredient.BREAD.getNumber().equals(i)) {
                    if (isBerger(stack)) {
                        answer = generateBerger(answer, stack);

                        continue;
                    }
                }

                stack.push(i);
            } catch (ArrayIndexOutOfBoundsException e) {
                stack.push(i);
            }
        }

        return answer;
    }

    private boolean isBerger(Stack<Integer> stack) {

        int length = stack.size();
        return (stack.get(length - 1) == Ingredient.MEAT.getNumber()
                && stack.get(length - 2) == Ingredient.VEGETABLE.getNumber()
                && stack.get(length - 3) == Ingredient.BREAD.getNumber());
    }

    private int generateBerger(int answer, Stack<Integer> stack) {
        stack.pop();
        stack.pop();
        stack.pop();

        return ++answer;
    }

    private enum Ingredient {

        BREAD(1)
        , VEGETABLE(2)
        , MEAT(3);

        private final Integer number;

        Ingredient(Integer number) {
            this.number = number;
        }

        public Integer getNumber() {
            return this.number;
        }
    }
}
