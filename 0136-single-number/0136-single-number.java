class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length, cnt=0;
        for(int i=0;i<n;i++){
            cnt^=nums[i];
        }
        return cnt;
    }
}