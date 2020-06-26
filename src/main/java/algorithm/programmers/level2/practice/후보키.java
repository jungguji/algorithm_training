package algorithm.programmers.level2.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class 후보키 {
    public int solution(String[][] relation) {

        int columnCount = relation[0].length;
        int rowCount = relation.length;

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < (1 << columnCount); i++) {
            if (!isUniqueness(relation, i, columnCount, rowCount)) {
                continue;
            }

            if (!isMinimality(i, list)) {
                continue;
            }

            list.add(i);
        }

        return list.size();
    }

    private boolean isUniqueness(String[][] relation, int set, int columnCount, int rowCount) {
        ArrayList<Integer> columnIndexList = getColumnIndex(set, columnCount);

        HashSet<String> hashSet = new HashSet<>();
        for (int row = 0; row < rowCount; row++) {
            StringBuilder sb = new StringBuilder();

            for (int column : columnIndexList) {
                sb.append(relation[row][column]);
            }

            hashSet.add(sb.toString());
        }

        return hashSet.size() == rowCount;
    }

    private ArrayList<Integer> getColumnIndex(int set, int colSize) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < colSize; i++) {
            if (((set >> i) & 1) == 1) {
                result.add(i);
            }
        }

        return result;
    }

    private boolean isMinimality(int set, List<Integer> list) {
        boolean isMinimality = true;

        for (int i : list) {
            if ((set & i) == i) {
                isMinimality = false;
                break;
            }
        }

        return isMinimality;
    }
}
