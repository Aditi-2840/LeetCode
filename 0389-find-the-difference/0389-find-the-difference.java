class Solution {
    public char findTheDifference(String s, String t) {
       if(s=="")
            return t.charAt(0);
        StringBuilder sb=new StringBuilder(s);
        char ch = 0;
        for(int i=0;i<t.length();i++) {
        	int ind=s.indexOf(t.charAt(i));
        	if(ind!=-1) {
        		sb.delete(ind, ind+1);
            	s=sb.toString();
        	}
        	else {
        		ch=t.charAt(i);
        	}
        	
        }
		return ch;
    }
}