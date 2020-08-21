package algorithm.baekjoon.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 왜맞틀 {
    private static final String ACCEPT = "Accepted";
    private static final String WRONG_ANSWER = "Wrong Answer";
    private static final String WHY_WRONG = "Why Wrong!!!";

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            long[] sampleAndSystemCase = convertStringArrayToIntegerArray(br.readLine().split(" "));
            long sampleCase = sampleAndSystemCase[0];
            long systemCase = sampleAndSystemCase[1];

            String answer = solution(sampleCase, systemCase, br);
            System.out.println(answer);
        }
    }

    private static long[] convertStringArrayToIntegerArray(String[] args) {
        long[] array = new long[args.length];
        int i = 0;
        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }

    public static String solution(long sampleCase, long systemCase, BufferedReader br) throws IOException {
        if (isTestCaseWrong(sampleCase, br)) {
            return WRONG_ANSWER;
        }

        if (isTestCaseWrong(systemCase, br)) {
            return WHY_WRONG;
        }

        return ACCEPT;
    }

    private static boolean isTestCaseWrong(long sampleCase, BufferedReader br) throws IOException {
        boolean result = false;
        for (int i = 0; i < sampleCase; i++) {
            long[] values = convertStringArrayToIntegerArray(br.readLine().split(" "));

            if (values[0] != values[1]) {
                result = true;
            }
        }

        return result;
    }
}