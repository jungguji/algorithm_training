package algorithm.baekjoon.avatar.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 너의평점은 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int subject = 20;
        double 학점x과목평점 = 0;
        double 학점의총합 = 0;

        while (subject-- > 0) {
            String[] split = br.readLine().split(" ");

            double 학점 = Double.parseDouble(split[1]);

            if ("P".equals(split[2])) {
                continue;
            }

            학점의총합 += 학점;
            switch (split[2]) {
                case "A+":
                    학점x과목평점 += 4.5 * 학점;
                    break;
                case "A0":
                    학점x과목평점 += 4.0 * 학점;
                    break;
                case "B+":
                    학점x과목평점 += 3.5 * 학점;
                    break;
                case "B0":
                    학점x과목평점 += 3.0 * 학점;
                    break;
                case "C+":
                    학점x과목평점 += 2.5 * 학점;
                    break;
                case "C0":
                    학점x과목평점 += 2.0 * 학점;
                    break;
                case "D+":
                    학점x과목평점 += 1.5 * 학점;
                    break;
                case "D0":
                    학점x과목평점 += 1.0 * 학점;
                    break;
                case "F":
                    학점x과목평점 += 0.0 * 학점;
                    break;
                default:
                    break;
            }
        }

        System.out.println(학점x과목평점/학점의총합);
    }
}
