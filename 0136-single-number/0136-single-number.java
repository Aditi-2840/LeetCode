class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length, cnt=0;
        for(int i=0;i<n;i++){
            cnt=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
            if(cnt==1)
                return nums[i];
        }
        return 0;
    }
}