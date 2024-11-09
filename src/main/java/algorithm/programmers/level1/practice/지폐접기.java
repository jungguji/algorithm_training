package algorithm.programmers.level1.practice;

public class 지폐접기 {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        while (true) {
            if (isOk(wallet, bill)) {
                break;
            }

            fold(bill);

            ++answer;
        }

        return answer;
    }

    private boolean isOk(int[] wallet, int[] bill) {
        return (bill[0] <= wallet[0] && bill[1] <= wallet[1])
                || (bill[0] <= wallet[1] && bill[1] <= wallet[0]);
    }

    private void fold(int[] bill) {
        if (bill[0] > bill[1]) {
            bill[0] /= 2;
        } else {
            bill[1] /= 2;
        }
    }
}
