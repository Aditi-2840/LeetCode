class Solution {
    public int minimumSum(int num) {
        List<String> l=new ArrayList<String>();
		while(num>0) {
			l.add(String.valueOf(num%10));
			num/=10;
		}
		Collections.sort(l);
		int sum=Integer.parseInt((l.get(0)+l.get(2)))+Integer.parseInt((l.get(1)+l.get(3)));
        return sum;
    }
}