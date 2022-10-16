class Solution {
    public int commonFactors(int a, int b) {
        int cnt=0;
        for(int i=1;i<=gcd(a,b);i++){
            if(a%i==0 && b%i==0)
                cnt++;
        }
        return cnt;
    }
    public int gcd(int a,int b){
        if(a==0)
            return b;
        else
            return gcd(b%a,a);
    }
}