class Solution {
    public String truncateSentence(String s, int k) {
        String arr[]=s.split("\\s");
        String str="";
        for(int i=0;i<k-1;i++){
            str+=arr[i]+" ";
        }
        return str+arr[k-1];
    }
}