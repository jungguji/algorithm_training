package algorithm.baekjoon.class2.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ACM호텔 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int amount = Integer.parseInt(br.readLine());

            for (int i = 0; i < amount; i++) {
                int[] intArray = convertStringArrayToIntegerArray(br.readLine().split(" "));

                double layer = intArray[0];
                double client = intArray[2];

                int clientLayer = (int) (((client % layer) == 0) ? layer : client % layer);
                int clientRoom = (int) Math.ceil(client / layer);

                System.out.println(clientLayer + "" + (clientRoom > 9 ? clientRoom : "0" + clientRoom));
            }
        }
    }

    private static int[] convertStringArrayToIntegerArray(String[] args) {
        int[] array = new int[args.length];
        int i = 0;

        for (String str : args) {
            array[i++] = Integer.parseInt(str);
        }

        return array;
    }
}
