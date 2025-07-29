package algorithm.programmers.level1.avatar;

public class 택배_상자_거내기 {
    public int solution(int n, int w, int num) {

        int row = (int) Math.ceil(((double)n / (double)w));
        int[][] arr = new int[row][w];

        int number = 0;
        for (int i = 0; i < row; ++i) {
            if (i % 2 == 0) {
                for (int ii = 0; ii < w; ++ii) {
                    arr[i][ii] = ++number;
                    if (number == n) {
                        break;
                    }
                }
            } else {
                for (int ii = w-1; ii >= 0; --ii) {
                    arr[i][ii] = ++number;
                    if (number == n) {
                        break;
                    }
                }
            }
        }

        int x = 0;
        int y = 0;
        boolean good = false;
        for (int i = 0; i < arr.length; ++i) {
            if (good) {
                break;
            }
            for (int ii = 0; ii < arr[0].length; ++ii) {
                if (num == arr[i][ii]) {
                    y = i;
                    x = ii;
                    good = true;
                    break;
                }
            }
        }

        int answer = 0;
        for (int i = y; i < arr.length; ++i) {
            if (arr[i][x] != 0) {
                ++answer;
            } else {
                break;
            }
        }

        return answer;
    }
}
