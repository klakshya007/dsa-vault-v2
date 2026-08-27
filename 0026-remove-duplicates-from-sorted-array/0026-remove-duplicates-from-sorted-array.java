class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        int j=1;
        int count=1;
        int n=nums.length;
        while(j<n){
            if(nums[j-1]!=nums[j]){
                count++;
                nums[i]=nums[j];
                i++;
            }
            j++;
        }
        return count;
    }
}