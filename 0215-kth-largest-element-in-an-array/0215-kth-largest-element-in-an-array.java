class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for(int i = 0;i < nums.length;i++) {
            maxHeap.add(nums[i]);
        }
        for(int i = 0; i < k - 1; i++) {
            maxHeap.poll();
        }
        return maxHeap.poll();
    }
}
