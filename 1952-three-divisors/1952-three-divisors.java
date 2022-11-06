class Solution {
    public boolean isThree(int n) {
        int cnt=0;
        int i=1;
        while(i<=n){
            if(n%i==0)
                cnt++;
            if(cnt>3)
                break;
            i++;
        }
        return cnt==3;
    }
}