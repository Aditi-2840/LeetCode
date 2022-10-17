class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int sum=0;
		for(int i=0;i<n;i++) {
			if((i+1)%2!=0) {
				for(int j=0;j<n;j++) {
					int t=j;
					if((n-j)>=(i+1)) {
						for(int k=1;k<=i+1;k++) {
							sum+=arr[t];
							t++;
						}
					}
					
				}
			}
		}
        return sum;
    }
}