package algorithm.programmers.level1.practice;

public class 부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        int answer = (count * (price + (price * count))) / 2;
        return Math.max(0, money - answer);
    }
}
