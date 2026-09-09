class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int closest_sum=nums[0]+nums[1]+nums[n-1];
        int max_diff=Math.abs(target-closest_sum);
        for(int i=0;i<n;i++){
            int j=i+1;int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                int diff=Math.abs(target-sum);
                if(diff<max_diff){
                    closest_sum=sum;
                    max_diff=diff;
                }
                if(sum<target)j++;
                else if (sum>target)k--;
                else if(sum==target)break;
            }
            if(max_diff==0)break;
        }
        return closest_sum;
    }
}