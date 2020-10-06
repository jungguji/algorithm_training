package algorithm.baekjoon.bruteforce.bronze;

public class 완전_세제곱 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int a = 2; a <= 100; a++) {
            for (int b = 2; b <= 100; b++) {
                for (int c = b + 1; c <= 100; c++) {
                    for (int d = c + 1; d <= 100; d++) {
                        if (cube(a) == (cube(b)) + (cube(c) + cube(d))) {
                            sb.append("Cube = ").append(a).append(", ")
                                    .append("Triple = (")
                                    .append(b).append(",")
                                    .append(c).append(",")
                                    .append(d).append(")")
                                    .append("\n");
                        }
                    }
                }
            }
        }

        System.out.println(sb);
    }

    private static long cube(int n) {
        return n * n * n;
    }
}
