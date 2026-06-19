class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int s : stones) pq.offer(s);
        while (pq.size() > 1) {
            int diff = pq.poll() - pq.poll();
            if (diff > 0) pq.offer(diff);
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
