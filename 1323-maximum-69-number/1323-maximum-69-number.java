class Solution {
    public int maximum69Number (int num) {
        String str=Integer.toString(num);
        boolean b=true;
        StringBuilder sb=new StringBuilder();
        for(char c:str.toCharArray()){
            if(c=='6' && b==true){
                sb.append('9');
                b=false;
            }
            else{
                sb.append(c);
            }
            
        }
        
        return Integer.parseInt(sb.toString());
    }
}