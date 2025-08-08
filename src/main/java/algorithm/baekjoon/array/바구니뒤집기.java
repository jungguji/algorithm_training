package algorithm.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class 바구니뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NM = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] arr = new int[NM[0] + 1];
        IntStream.range(1, NM[0]+1)
                .forEach(i -> arr[i] = i);

        while (NM[1]-- > 0) {
            int[] IJ = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int I = IJ[0];
            int J = IJ[1];

            // J-I 한 수치 만큼 루프 돌면서
            // 양끝에 포인터두고
            // 한쪽에 있는거 temp에 저장해놓고
            // 옮기면 될듯

            int count = ((J-I)/2)+1;
            for (int i = 0; i < count; ++i) {
                int temp = arr[I];
                arr[I] = arr[J];
                arr[J] = temp;

                ++I;
                --J;
            }
        }

        Arrays.stream(arr, 1, arr.length)
                .forEach(i -> System.out.printf(i + " "));
    }
}

