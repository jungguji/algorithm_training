
public class test {
    
    public String vvv(String args) {
        char[] charArray = args.toCharArray();
        int stringLength = charArray.length;
        char[] answer = new char[stringLength];
        
        for (char element : charArray) {
            for (int i = 0; i < stringLength; i++) {
                char ch = answer[i];
                if (0 == ch) {
                    answer[i] = element;
                    break;
                }
                if (ch >= element) {
                    for (int j = stringLength-1; j > i; j--) {
                        answer[j] = answer[j-1];
                    }
                    
                    answer[i] = element;
                    break;
                }
            }
        }
        
        return new String(answer);
    }
}
