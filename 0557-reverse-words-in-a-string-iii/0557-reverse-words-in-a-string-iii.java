class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            for(int j=arr[i].length()-1;j>=0;j--){
                res.append(arr[i].charAt(j));
            }
            // if(i==arr.length-1)
            //     res=res;
            // else
                res.append(" ");
            
        }
        return res.toString().trim();
    }
}