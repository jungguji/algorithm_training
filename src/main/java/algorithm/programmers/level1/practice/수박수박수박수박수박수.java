package algorithm.programmers.level1.practice;

public class 수박수박수박수박수박수 {

    public String solution(int n) {
        String[] a = new String[]{"수", "박"};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(a[i % 2]);
        }
        return sb.toString();
    }
}
