package algorithm.programmers.level2.stackqueue;

import java.util.LinkedList;

public class 다리를_지나는_트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        LinkedList<Truck> queue = new LinkedList<Truck>();
        
        for (int i = 0; i < truck_weights.length; i++) {
            queue.offer(new Truck(bridge_length, truck_weights[i]));
        }
        
        int answer = 1;
        int truckAmount = 0;
        while (!queue.isEmpty()) {
            
            int totalWeight = 0;
            for (int i = 0; i < truckAmount; i++) {
                totalWeight += queue.get(i).getWeight();
            }
            
            int nextWeight = 0;
            if (queue.size() > truckAmount) {
                nextWeight = queue.get(truckAmount).getWeight();
            }
            
            if (totalWeight + nextWeight <= weight) {
                if (queue.size() > truckAmount) {
                    ++truckAmount;
                }
            }
            
            for (int i = 0; i < truckAmount; i++) {
                Truck truck = queue.get(i);
                truck.setPosition(truck.getPosition() - 1);
            }
            
            if (queue.peek().getPosition() == 0) {
                queue.poll();
                --truckAmount;
            }
            
            ++answer;
        }
        
        return answer;
    }
    
    class Truck {
        private int position;
        private int weight;
        
        public Truck(int position, int weight) {
            this.position = position;
            this.weight = weight;
        }
        
        public int getPosition() {
            return position;
        }
        public void setPosition(int position) {
            this.position = position;
        }
        public int getWeight() {
            return weight;
        }
        public void setWeight(int weight) {
            this.weight = weight;
        }
    }
}
