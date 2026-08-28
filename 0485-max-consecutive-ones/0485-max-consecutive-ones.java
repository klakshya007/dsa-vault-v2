class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curr_count=0;int max_count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)curr_count++;
            else {
                max_count=Math.max(curr_count, max_count);
                curr_count=0;
            }
                max_count=Math.max(curr_count, max_count);
        }
        return max_count;
    }
}