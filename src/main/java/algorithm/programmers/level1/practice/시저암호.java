package algorithm.programmers.level1.practice;

public class 시저암호 {

    public String solution(String s, int n) {
        char[] smalls = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] capitals = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        
        char[] ch = s.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        for (char c : ch) {
            if (c < 91) {
                c = push(capitals, c, n);
            } else {
                c = push(smalls, c, n);
            }
            
            sb.append(c);
        }
        
        System.out.println(sb.toString());
        return sb.toString();
    }
    
    private char push(char[] array, char ch, int n) {
        char result = 0;
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            
            if (ch == c) {
                result = array[(i+n)%26];
                break;
            }
        }
        
        return result;
    }
}
