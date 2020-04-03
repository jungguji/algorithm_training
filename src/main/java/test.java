
public class test {
    
    public String vvv(String args) {
        char[] charArray = args.toCharArray();
        int stringLength = charArray.length;
        char[] answer = new char[stringLength];
        
        for (char element : charArray) {
            
            for (int i = 0; i < stringLength; i++) {
                char ch = charArray[i];
                if (ch >= element) {
                    for (int k = stringLength-1; k > i; k--) {
                        answer[k] = answer[k-1];
                    }
                    
                    answer[i] = element;
                    break;
                }
            }
        }
        
        return new String(answer);
    }
}
