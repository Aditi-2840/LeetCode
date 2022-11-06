class Solution {
    public boolean isThree(int n) {
        int cnt=0;
        int i=1;
        while(i<=n){
            if(n%i==0)
                cnt++;
            i++;
        }
        if(cnt==3)
            return true;
        return false;
    }
}