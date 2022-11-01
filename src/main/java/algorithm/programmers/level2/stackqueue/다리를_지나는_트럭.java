package algorithm.programmers.level2.stackqueue;

import java.util.LinkedList;

public class 다리를_지나는_트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        LinkedList<Truck> queue = new LinkedList<Truck>();

        for (int i = 0; i < truck_weights.length; i++) {
            queue.offer(new Truck(bridge_length, truck_weights[i]));
        }

        int answer = 1;
        int bridgeOnTruck = 0;
        while (!queue.isEmpty()) {

            int totalWeight = 0;
            for (int i = 0; i < bridgeOnTruck; i++) {
                totalWeight += queue.get(i).weight;
            }

            int nextWeight = 0;
            if (queue.size() > bridgeOnTruck) {
                nextWeight = queue.get(bridgeOnTruck).weight;
            }

            if (totalWeight + nextWeight <= weight) {
                if (queue.size() > bridgeOnTruck) {
                    ++bridgeOnTruck;
                }
            }

            for (int i = 0; i < bridgeOnTruck; i++) {
                Truck truck = queue.get(i);
                truck.position = truck.position - 1;
            }

            if (queue.peek().position == 0) {
                queue.poll();
                --bridgeOnTruck;
            }

            ++answer;
        }

        return answer;
    }

    class Truck {
        public int position;
        public int weight;

        public Truck(int position, int weight) {
            this.position = position;
            this.weight = weight;
        }
    }
}
