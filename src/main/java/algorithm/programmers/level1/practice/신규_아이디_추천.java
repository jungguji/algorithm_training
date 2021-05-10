package algorithm.programmers.level1.practice;

import java.util.ArrayList;
import java.util.List;

public class 신규_아이디_추천 {
    public String solution(String new_id) {
        String changeId = new_id.toLowerCase();

        changeId = removeSpecialCharacters(changeId);
//        changeId = changeId.replaceAll("[^-_.a-z0-9]", "");
//        changeId = removeContinuousDot(changeId);
        changeId = changeId.replaceAll("[.]{2,}", ".");
        changeId = removeStartAndEndDot(changeId);
        changeId = changeId.isEmpty() ? "a" : changeId;
        changeId = changeId.length() > 15 ? new String(changeId.toCharArray(), 0, 15) : changeId;
        changeId = removeStartAndEndDot(changeId);
        changeId = addChar(changeId);

        return changeId;
    }

    private String removeSpecialCharacters(String id) {
        StringBuilder changeId = new StringBuilder();

        char[] array = id.toCharArray();
        for (char ch : array) {
            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')
            || ch == '-' || ch == '_' || ch == '.') {
                changeId.append(ch);
            }
        }

        return changeId.toString();
    }

    private String removeStartAndEndDot(String id) {
        boolean start = false;
        boolean end = false;

        if (id.startsWith(".")) {
            start = true;
        }

        if (id.endsWith(".")) {
            end = true;
        }

        int startIndex = start ? 1 : 0;
        int endIndex = end ? id.length()-1 : id.length();

        char[] array = id.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = startIndex; i < endIndex; i++) {
            sb.append(array[i]);
        }

        return sb.toString();
    }

    private String addChar(String id) {
        if (id.isEmpty()) {
            id = "a";
        }

        char endChar = id.charAt(id.length()-1);

        while (id.length() <= 2) {
            id += endChar;
        }

        return id;
    }
}
