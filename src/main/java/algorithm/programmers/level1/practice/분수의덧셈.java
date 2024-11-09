package algorithm.programmers.level1.practice;

public class 분수의덧셈 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denomLcm = getLcm(denom1, denom2);
        int sumNumer = getSumNumer(numer1, denom1, numer2, denom2, denomLcm);

        int gcd = euclidean(sumNumer, denomLcm);

        return new int[] {(sumNumer / gcd), denomLcm / gcd};
    }

    private int getLcm(int a, int b) {
        return a * (b / euclidean(a,b));
    }

    public int euclidean(int a, int b) {
        if (b == 0) {
            return a;
        }

        return euclidean(b, a % b);
    }

    private int getSumNumer(int numer1, int denom1, int numer2, int denom2, int denomLcm) {
        return (numer1 * (denomLcm / denom1)) + (numer2 * (denomLcm / denom2));
    }
}
