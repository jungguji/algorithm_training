package algorithm.programmers.level2.hash;

public class 전화번호_목록 {
    public boolean solution(String[] phone_book) {
        int length = phone_book.length;
        
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j) {
                    continue;
                }
                
                if (phone_book[j].startsWith(phone_book[i])) {
                    return false;
                }
            }
        }
        boolean answer = true;
        return answer;
    }
}
