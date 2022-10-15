class Solution {
    public String restoreString(String s, int[] indices) {
        int n=s.length();
        char ch[]=new char[n];
        int i=0;
        for(char c:s.toCharArray()){
            ch[indices[i++]]=c;
        }
        return new String(ch);
    }
}