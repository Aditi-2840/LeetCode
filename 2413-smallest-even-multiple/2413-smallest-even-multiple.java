class Solution {
    public int smallestEvenMultiple(int n) {
        int i=1, ans=1;
        while(i>0){
            if(i%2==0 & i%n==0){
                ans=i;
                break;
            }
            i++;
        }
        return ans;
    }
}