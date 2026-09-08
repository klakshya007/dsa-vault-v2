class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> nextGreaterElement = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<nums2.length;i++){
            while(!stack.isEmpty() && stack.peek()<nums2[i]){
                nextGreaterElement.put(stack.pop(),nums2[i]);
            }
            stack.push(nums2[i]);
        }
        int[] arr= new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            arr[i]=nextGreaterElement.getOrDefault(nums1[i],-1);
        }
        return arr;
    }
}