class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        n/=2;
        for (Map.Entry<Integer,Integer> entry:mp.entrySet()){
            if (entry.getValue()>n){
                return entry.getKey();
            }
        }
        return 0;
    }
}