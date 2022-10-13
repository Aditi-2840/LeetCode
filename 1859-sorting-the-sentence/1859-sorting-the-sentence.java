class Solution {
    public static String sortSentence(String s) {
        String arr[]=s.split(" ");
        String str[]=new String[arr.length];
        for(String words:arr){
           char c=words.charAt(words.length()-1);
           int i=c-'0';
           str[i-1]=words.substring(0, words.length()-1);
           
        }
        return String.join(" ", str);
    }
}