class Solution {
public:
    bool check(vector<int>& nums) {
        int n = nums.size();
        if(n<=1)return true;

        int pair=0;
        for(int i=1;i<n;i++){
            if (nums[i]<nums[i-1] ) {
                pair++;
            }
        }
        if (nums[0]<nums[n-1] )pair++;
        return pair <=1;
    }
};