class Solution {
    public int minimumSum(int num) {
        String s=String.valueOf(num);
		int arr[]=new int[s.length()];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.charAt(i)-'0';
		}
		Arrays.sort(arr);
		String a = "", b="";
		for(int i=0;i<arr.length;i++) {
			if(i%2==0)
				a+=arr[i];
			else
				b+=arr[i];
		}
		int sum=Integer.parseInt(a)+Integer.parseInt(b);
        return sum;
    }
}