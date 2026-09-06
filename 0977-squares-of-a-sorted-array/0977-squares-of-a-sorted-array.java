class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int n=nums.length;
        int j=n-1;
        int [] arr = new int[n];
        int x=n-1;
        while(i<=j){
            int diff=nums[j]+nums[i];
            if(diff>0){
                arr[x]=nums[j]*nums[j];
                j--;
            }
            else {
                arr[x]=nums[i]*nums[i];
                i++;
            }
            x--;;
        }
        return arr;
    }
}