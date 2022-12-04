class Solution {
    public boolean isCircularSentence(String sentence) {
        String arr[]=sentence.split(" ");
        boolean flag=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i].charAt(arr[i].length()-1)!=arr[i+1].charAt(0)){
                flag=false;
            }
            
        }
        if(sentence.charAt(0)!=sentence.charAt(sentence.length()-1))
            flag=false;
        return flag;
    }
}