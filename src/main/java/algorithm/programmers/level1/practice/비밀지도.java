package algorithm.programmers.level1.practice;

public class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] binary = getBinary(n, arr1, arr2);
        
        String[] answer = new String[n];
        int i = 0;
        for (String str : binary) {
            str = str.replaceAll("0", " ");
            str = str.replaceAll("1", "#");
            answer[i++] = str;
        }
        return answer;
    }
    
    private String[] getBinary(int length, int[] arr1, int[] arr2) {
        String[] binary = new String[length];
        
        for (int i = 0; i < arr1.length; i++) {
            String str = Integer.toBinaryString(arr1[i] | arr2[i]);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < length - str.length(); j++) {
                sb.append("0");
            }
            
            binary[i] = sb.append(str).toString();
        }
        
        return binary;
    }
}
