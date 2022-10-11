class Solution {
    public String interpret(String str) {
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='G')
                sb.append('G');
            else if(str.charAt(i)=='(' && str.charAt(i+1)==')'){
                sb.append('o');
            }
            else if(str.charAt(i)=='(' && str.charAt(i+1)=='a' && str.charAt(i+2)=='l' && str.charAt(i+3)==')'){
                sb.append("al");
            }
        }
       return sb.toString();
    }
}