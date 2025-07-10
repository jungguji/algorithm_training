package algorithm.programmers.level2.avatar;

import java.util.ArrayList;
import java.util.List;

public class 이진변환반복하기 {
    private int 영제거갯수 = 0;
    private int 변환횟수 = 0;

    public int[] solution(String s) {

        test(s);
        return new int[]{변환횟수, 영제거갯수};
    }

    private void test(String s) {
        if ("1".equals(s)) {
            return;
        }
        ++변환횟수;

        char[] charArray = s.toCharArray();

        List<Integer> 영제거 = new ArrayList<>();
        for (char c : charArray) {
            if (c == '0') {
                ++영제거갯수;
            } else {
                영제거.add(1);
            }
        }

        int c = 영제거.size();

        List<Integer> list = new ArrayList<>();

        while (c > 0) {
            list.add(c % 2);
            c /= 2;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = list.size()-1; i >= 0; --i) {
            stringBuilder.append(list.get(i));
        }

        test(stringBuilder.toString());
    }
}
