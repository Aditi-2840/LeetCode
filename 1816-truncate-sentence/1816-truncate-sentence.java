class Solution {
    public String truncateSentence(String s, int k) {
        String arr[]=s.split("\\s");
        String newArr[] = Arrays.copyOf(arr, k);
        String str="";
        for(String words:newArr){
            str=str+" "+words;
        }
        return str.trim();
    }
}