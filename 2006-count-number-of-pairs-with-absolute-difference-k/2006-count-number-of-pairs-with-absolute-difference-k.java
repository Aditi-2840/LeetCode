class Solution {
    public int countKDifference(int[] nums, int k) {
        int cnt=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(Math.abs(nums[i]-nums[j])==k && i<j)
                    cnt++;
            }
        }
        return cnt;
    }
}