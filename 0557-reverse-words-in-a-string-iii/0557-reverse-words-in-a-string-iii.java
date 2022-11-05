class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        String res="",w="";
        for(int i=0;i<arr.length;i++){
            w="";
            for(int j=arr[i].length()-1;j>=0;j--){
                w+=arr[i].charAt(j);
            }
            if(i==arr.length-1)
                w=w;
                //break;
            else
                res=res+w+" ";
            
        }
        return res+w;
    }
}