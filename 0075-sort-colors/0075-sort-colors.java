class Solution {
    public void sortColors(int[] nums) {
        int ptr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=nums[ptr];
                nums[ptr]=0;
                ptr++;
            }
        }
        for(int i=ptr;i<nums.length;i++){
            if(nums[i]==1){
                nums[i]=nums[ptr];
                nums[ptr]=1;
                ptr++;
            }
        }
    }
}