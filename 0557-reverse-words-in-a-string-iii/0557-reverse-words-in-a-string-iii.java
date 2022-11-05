class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        String res="";
        for(String words:arr){
            String w="";
            for(int i=words.length()-1;i>=0;i--){
                w+=words.charAt(i);
            }
            res=res+" "+w;
        }
        return res.trim();
    }
}