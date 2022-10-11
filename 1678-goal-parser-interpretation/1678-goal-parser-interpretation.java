class Solution {
    public String interpret(String str) {
        
        
        str=str.replaceAll("\\(\\)","o");
        str=str.replaceAll("\\(al\\)","al");
        
        return str;
        
        
    }
}