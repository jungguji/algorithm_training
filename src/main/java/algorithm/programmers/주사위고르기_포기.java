package algorithm.programmers;

import java.util.*;

public class 주사위고르기_포기 {
    public static final int 주사위_면의_수 = 6;
    private int n = 0;
    private int c = 0;
    private List<int[]> 주사위조합 = new ArrayList<>();
    private int[][] DICE;

    public int[] solution(int[][] dice) {
        // 1. 주사위 갯수별 경우의 수 구하기
        DICE = dice;
        n = dice.length;
        c = n / 2;

        nCr(0, c);

        // 2. 주사위 조합별 합계
        int maxWins = -1;
        int[] answer = new int[c];

        // 2. 각 조합을 순회하며 대결 시작
        for (int[] aCombination : 주사위조합) {

            // 3. 대결 준비: 각 팀의 점수 리스트 생성
            List<Integer> sums_A = new ArrayList<>();
            List<Integer> sums_B = new ArrayList<>();

            // B팀의 조합 구하기
            int[] bCombination = getBCombination(aCombination);

            // 4. 각 팀의 모든 점수 합 구하기 (DFS 호출)
            dfs(aCombination, 0, 0, sums_A);
            dfs(bCombination, 0, 0, sums_B);

            // 5. 승패 결정
            Collections.sort(sums_B); // B의 점수 리스트 정렬

            int currentWins = 0;
            for (int aScore : sums_A) {
                // 이분 탐색으로 aScore보다 작은 점수의 개수를 찾아 더함
                currentWins += binarySearchLowerBound(sums_B, aScore);
            }

            // 6. 결과 업데이트
            if (currentWins > maxWins) {
                maxWins = currentWins;
                answer = aCombination;
            }
        }

        return answer;
    }

    private Stack<Integer> stack = new Stack<>();

    private void nCr(int start, int r) {
        // base case
        if (stack.size() == r) {
            int[] ints = new int[r];
            for (int i = 0; i < r; ++i) {
                ints[i] = stack.get(i)+1;
            }

            주사위조합.add(ints);
            return;
        }

        for (int i = start; i < n; ++i) {
            stack.push(i);

            nCr(i+1, r);

            stack.pop();
        }
    }

    // 주사위 조합 하나를 선택했을때 ..
    // a와 b가 얻읈 ㅜ있는 합

    private void dfs(int[] 조합, int currentSum, int depth, List<Integer> scoresList) {
        if (depth == c) {
            scoresList.add(currentSum);
            return;
        }
        int 지금_주사위_번호 = 조합[depth] - 1;
        for (int i = 0; i < 6; i++) {
            int 굴린_주사위_값 = DICE[지금_주사위_번호][i];
            dfs(조합, currentSum + 굴린_주사위_값, depth + 1, scoresList);
        }
    }

    private int[] getBCombination(int[] aCombination) {

        // 1. 체크리스트 만들기
        // 주사위 번호가 1~n이므로, n+1 크기로 만들어 인덱스 1~n을 사용합니다.
        boolean[] isTakenByA = new boolean[n + 1];

        // 2. A가 가져간 주사위들을 체크리스트에 표시
        for (int aDiceNumber : aCombination) {
            isTakenByA[aDiceNumber] = true;
        }

        // 3. B의 조합을 담을 배열 준비
        int[] bCombination = new int[c]; // c는 n/2
        int bIndex = 0; // bCombination 배열에 값을 채워넣기 위한 인덱스

        // 4. 전체 주사위(1~n)를 확인하면서, A가 가져가지 않은(false) 것을 B의 조합에 추가
        for (int i = 1; i <= n; i++) {
            if (!isTakenByA[i]) { // A가 가져가지 않았다면?
                bCombination[bIndex] = i; // B의 조합에 추가
                bIndex++; // 다음 칸으로 이동
            }
        }

        return bCombination;
    }
    // 이 함수를 클래스에 추가해주세요.
    private int binarySearchLowerBound(List<Integer> list, int target) {
        int left = 0;
        int right = list.size(); // 끝 인덱스가 아니라 리스트의 크기

        // left와 right가 만나는 지점이 바로 target이 삽입될 위치(lower bound)
        while (left < right) {
            int mid = left + (right - left) / 2;

            // 중간값이 타겟보다 작으면, 탐색 범위를 오른쪽으로 좁힌다.
            if (list.get(mid) < target) {
                left = mid + 1;
            }
            // 중간값이 타겟보다 크거나 같으면, 탐색 범위를 왼쪽으로 좁힌다.
            else {
                right = mid;
            }
        }
        // 최종적으로 left (또는 right)가 target보다 작은 원소의 개수가 된다.
        return left;
    }
}
