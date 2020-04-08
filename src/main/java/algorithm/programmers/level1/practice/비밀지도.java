package algorithm.programmers.level1.practice;

public class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] binary1 = getBinary(n, arr1);
        String[] binary2 = getBinary(n, arr2);
        
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            char[] ch1 = binary1[i].toCharArray();
            char[] ch2 = binary2[i].toCharArray();
            StringBuilder sb = new StringBuilder();
            
            for (int j = 0; j < ch1.length; j++) {
                if ((ch1[j] == '0') && (ch2[j] == '0')) {
                    sb.append(" ");
                } else {
                    sb.append("#");
                }
            }
            
            answer[i] = sb.toString();
        }
        
        return answer;
    }
    
    private String[] getBinary(int length, int[] arr) {
        String[] binary = new String[length];
        
        for (int i = 0; i < arr.length; i++) {
            String str = Integer.toBinaryString(arr[i]);
            String s = "";
            for (int j = 0; j < length - str.length(); j++) {
                s += "0";
            }
            
            binary[i] = s + str;
        }
        
        return binary;
    }
}
