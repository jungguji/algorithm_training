package algorithm.programmers.level1.practice;

public class 핸드폰_번호_가리기 {
    public String solution(String phone_number) {
        int numberLength = phone_number.length();
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < (numberLength-4); i++) {
            sb.append("*");
        }
        sb.append(phone_number.substring(phone_number.length()-4, phone_number.length()));
        return sb.toString();
    }
}
