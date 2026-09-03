class Solution {
    public boolean canJump(int[] nums) {
        int reach=nums[0];
        boolean ans=true;
        for(int i=1;i<nums.length;i++){
            if(reach>=i)reach=Math.max(reach,i+nums[i]);
            else if(reach<i){
                ans=false;
                break;
            }
        }
        return ans;
    }
}