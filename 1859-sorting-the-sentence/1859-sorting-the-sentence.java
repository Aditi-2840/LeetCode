class Solution {
    public static String sortSentence(String s) {
        String arr[]=s.split(" ");
        String str[]=new String[arr.length];
        for(String words:arr){
           char c=words.charAt(words.length()-1);
           int i=c-'0';
           StringBuilder sb=new StringBuilder(words);
           sb.deleteCharAt(sb.length()-1);
           str[i-1]=sb.toString();
           
        }
        String res="";
        for(int i=0;i<str.length-1;i++) {
        	res+=str[i]+" ";
        }
        return res+str[str.length-1];
    }
}