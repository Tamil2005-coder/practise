class Solution {
    public int[] replaceElements(int[] ar) {
        int n =ar.length;
        int max=-1;
        for(int i=n-1;i>=0;i--){
            max=Math.max(ar[i],ar[i]=max);
        }
        return ar;
    }
}