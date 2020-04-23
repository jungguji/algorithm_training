package algorithm.programmers.level2.stackqueue;

import java.util.LinkedList;

public class 프린터 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        LinkedList<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(priorities[i]);
        }
        
        while (queue.size() != 0) {
            for (int i = 1; i < queue.size(); i++) {
                if (queue.peek() < queue.get(i)) {
                    queue.offer(queue.poll());
                    
                    if (location == 0) {
                        location = queue.size() - 1;
                    } else {
                        --location;
                    }
                    
                    i = 0;
                }
            }
            
            answer++;
            if (location == 0) {
                break;
            }
            
            --location;
            queue.poll();
        }
        
        return answer;
        
//        while (true) {
//            int temp = 0;
//            for (int i = 1; i < size; i++) {
//                if (priorities[i] > priorities[0]) {
//                    temp = priorities[0];
//                    
//                    for (int j = 1; j < size; j++) {
//                        priorities[j-1] = priorities[j];
//                    }
//                    
//                    priorities[size-1] = temp;
//                    break;
//                }
//            }
//        }
        
//        Queue<Map<Double,Integer>> queue = new LinkedBlockingQueue<Map<Double,Integer>>();
//        for (int i = 0; i < size; i++) {
//            Map<Double, Integer> map = new HashMap<Double,Integer>();
//            map.put((Math.random()), priorities[i]);
//            queue.offer(map);
//        }
//        
//        for (int i = 0; i < size; i++) {
//            System.out.println(queue.poll());
//        }
        
//        int answer = 0;
//        return answer;
    }
}
