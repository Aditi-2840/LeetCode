class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0, n=arr.length;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		int x=3;
		while(x<=n) {
			for(int i=0;i<=n-x;i++) {
				for(int j=i;j<i+x;j++) {
					sum+=arr[j];
				}
			}
			x+=2;
		}
        return sum;
    }
}