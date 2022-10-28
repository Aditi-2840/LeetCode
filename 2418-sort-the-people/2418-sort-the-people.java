class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=heights.length;
        HashMap<Integer, String> hm=new HashMap<>();
        for(int i=0;i<names.length;i++){
            hm.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String res[]=new String[n];
        int idx=0;
        for(int i=n-1;i>=0;i--){
            res[idx++]=hm.get(heights[i]);
        }
        
        return res;
    }
}