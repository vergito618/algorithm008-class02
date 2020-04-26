package week2;

import java.util.*;

/**
 * 347. 前 K 个高频元素
 */
public class TopK {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        //优先级队列
        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1) - map.get(o2);
            }
        });
        //维持一个优先级队列
        for (int key : map.keySet()) {
            if (heap.size() < k) {
                heap.add(k);
            } else if (map.get(key) > heap.peek()){
                heap.poll();
                heap.add(k);
            }
        }
        //
        List<Integer> list = new LinkedList<>();
        while (!heap.isEmpty()) {
            list.add(heap.poll());
        }
        return list;
    }
}
