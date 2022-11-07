class Solution {
    public int minimumSum(int num) {
        List<Integer> l=new ArrayList<>();
		while(num>0) {
			l.add(num%10);
			num/=10;
		}
		Collections.sort(l);
		
		String a = "", b="";
		for(int i=0;i<l.size();i++) {
			if(i%2==0)
				a+=l.get(i);
			else
				b+=l.get(i);
		}
		int sum=Integer.parseInt(a)+Integer.parseInt(b);
        return sum;
    }
}