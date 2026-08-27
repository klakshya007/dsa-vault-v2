class Solution {
    public void reverse(int i, int j,int arr[]){
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int i=0;
        int n=nums.length-1;
        k=k%(n+1);
        reverse(i,n,nums);
        reverse(i,k-1,nums);
        reverse(k,n,nums);
    }
}