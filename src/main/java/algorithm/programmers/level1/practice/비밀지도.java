package algorithm.programmers.level1.practice;

public class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] binary1 = getBinary(n, arr1);
        String[] binary2 = getBinary(n, arr2);
        
        
        String[] answer = {};
        return answer;
    }
    
    private String[] getBinary(int length, int[] arr) {
        String[] binary = new String[length];
        
        for (int i = 0; i < arr.length; i++) {
            binary[i] = Integer.toBinaryString(arr[i]);
        }
        
        return binary;
    }
}
