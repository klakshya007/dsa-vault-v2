class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        if(n<=1)return true;
        int pair_count=0;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1])pair_count++;
        }
        if(nums[0]<nums[n-1])pair_count++;
        return pair_count<=1;
    }
}