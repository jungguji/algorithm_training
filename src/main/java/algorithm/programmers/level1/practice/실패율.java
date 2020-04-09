package algorithm.programmers.level1.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 실패율 {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Integer> map = getStageMap(N, stages);
        
        List<Integer> keysetList = reverseSortMap(map);
        
        int[] answer = keysetList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
    
    public Map<Integer, Integer> getStageMap(int n, int[] stages) {
        
        int userCount = stages.length;
        int failUser = 0;
        int successStage = 0;
        int preStage = 1;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        Arrays.sort(stages);
        
        for (int i = 0; i < stages.length; i++) {
            int stage = stages[i];
            
            if (preStage == stage) {
                failUser++;
            } else {
                --i;
                
                setFailurerate(map, failUser, userCount, preStage);
                
                if (stage - preStage > 1) {
                    setSuccessStage(map, preStage, stage);
                }
                
                userCount -= failUser;
                failUser = 0;
                successStage = stage;
            }
            
            preStage = stage;
        }
        
        if (failUser == userCount && map.size() != n) {
            setFailStage(map, n, successStage);
        }
        
        return map;
    }
    
    private void setFailurerate(Map<Integer, Integer> map, int failUser, int userCount, int key) {
        int value = (userCount == 0) ? 0 : (int) (((double) failUser / userCount) * 100);
        map.put(key, value);
    }
    
    private void setSuccessStage(Map<Integer, Integer> map, int preStage, int stage) {
        for (int j = preStage + 1; j < stage; j++) {
            map.put(j, 0);
        }
    }
    
    private void setFailStage(Map<Integer, Integer> map, int stageQuantity, int successStage) {
        map.put(successStage, 1);
        
        for (int i = successStage+1; i <= stageQuantity; i++) {
            map.put(i, 0);
        }
    }
    
    private List<Integer> reverseSortMap(Map<Integer, Integer> map) {
        List<Integer> keysetList = new ArrayList<Integer>(map.keySet());
        Collections.sort(keysetList, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2).compareTo(map.get(o1));
            }
        });
        
        return keysetList;
    }
    
}
