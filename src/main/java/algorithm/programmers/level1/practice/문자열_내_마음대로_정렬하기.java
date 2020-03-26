package algorithm.programmers.level1.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class 문자열_내_마음대로_정렬하기 {
    
    public String[] solution(String[] strings, int n) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        Map<String, List<String>> duplicateMap = new HashMap<String, List<String>>();
        
        for (int i = 0; i < strings.length; i++) {
            String ch = String.valueOf(strings[i].charAt(n));
            if (map.containsKey(ch)) {
                if (duplicateMap.containsKey(ch)) {
                    List<String> list = duplicateMap.get(ch);
                    list.add(strings[i]);
                } else {
                    List<String> list = new ArrayList<String>();
                    list.add(strings[i]);
                    
                    duplicateMap.put(ch, list);
                }
            } else {
                map.put(ch, i);
            }
        }
        
        Map<String, Integer> tree = new TreeMap<String, Integer>(map);
        
        String[] answer = new String[strings.length];
        
        int i = 0;
        Iterator<String> it = tree.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            if (duplicateMap.containsKey(key)) {
                List<String> list = duplicateMap.get(key);
                list.add(strings[tree.get(key)]);
                
                list.sort(null);
                
                for (String str : list) {
                    answer[i++] = str;
                }
            } else {
                answer[i++] = strings[tree.get(key)];
            }
            
        }
        
        return answer;
    }
}
