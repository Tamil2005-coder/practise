class Solution {
    public boolean validMountainArray(int[] ar) {
        if (ar.length < 3) return false;
      int start = 0;
      int end = ar.length-1;
      while (start < end) {
        if (ar[start+1] > ar[start]) {
          start++;
        } else if (ar[end-1] > ar[end]) { 
          end--;
        } else {
          break;
        }
      }
      return start != 0 && end != ar.length-1 && start == end;
    }
}