package algorithm.programmers.level3.recursion;

import java.util.*;

public class 다단계칫솔 {

    private Map<String, Integer> money = new HashMap<>();
    private Map<String, String> tree = new HashMap<>();

    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        money.put("-", 0);

        for (String name : enroll) {
            money.put(name, 0);
        }

        for (int i = 0; i < enroll.length; i++) {
            tree.put(enroll[i], referral[i]);
        }

        // 판매금액을 한번에 계산하지 않고 건별로 계산하면서 부모에게 넘김
        // 판매한것들 . 모아서. 계산하면 원단위 절사때문에 금액이 달라짐
        for (int i = 0; i < seller.length; i++) {
            calc(seller[i], amount[i] * 100);
        }

        int[] answer = new int[enroll.length];
        for (int i = 0; i < enroll.length; i++) {
            answer[i] = money.get(enroll[i]);
        }

        return answer;
    }

    private void calc(String name, int price) {
        // 10% 계산 (정수 절사)
        int price10 = (int)(price * 0.1);

        // 현재 사람이 90% 가져감
        money.put(name, money.get(name) + price - price10);

        // 1원 미만이면 상납 중단
        // 없으면 트리가 높을떄 계속 올라가서 시간초과 발생
        if (price10 == 0) {
            return;
        }

        // 루트가 아니면 부모에게 상납
        if (!name.equals("-")) {
            calc(tree.get(name), price10);
        }
    }
}
