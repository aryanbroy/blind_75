import java.util.*;

public class q347 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        topKFrequent(nums, k);
    }

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> freqs = new HashMap<>();

        for (int num : nums) {
            freqs.put(num, freqs.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> freqs.get(a) - freqs.get(b));
        int[] result = new int[k];

        for (int freq : freqs.keySet()) {
            pq.offer(freq);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }

        return result;
    }
}
