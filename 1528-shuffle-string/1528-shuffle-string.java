class Solution {
    public String restoreString(String s, int[] indices) {
       Character c[]=new Character[indices.length];
        
        for(int i=0;i<indices.length;i++){
            c[indices[i]]=s.charAt(i);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<c.length;i++) {
        	sb.append(c[i]);
        }
        return sb.toString();
    }
}