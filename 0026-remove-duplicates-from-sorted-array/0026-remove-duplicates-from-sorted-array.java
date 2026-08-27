class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        int prev=nums[0];
        for(int num:nums){
            if(num!=prev){
                nums[i]=num;
                i++;
            }
            prev=num;
        }
        return i;
    }
}