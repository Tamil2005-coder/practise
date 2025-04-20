class Solution {
    public int thirdMax(int[] nums) {
        // Use variables to store the first, second, and third maximum values
        Long firstmax = Long.MIN_VALUE, secmax = Long.MIN_VALUE, thirdmax = Long.MIN_VALUE;
        
        // Counter to keep track of the distinct numbers found
        int count = 0;
        
        for (int num : nums) {
            if (num == firstmax || num == secmax || num == thirdmax) {
                continue;
            }
            if (num > firstmax) {
                thirdmax = secmax;
                secmax = firstmax;
                firstmax = (long) num;
                count++;
            } else if (num > secmax) {
                thirdmax = secmax;
                secmax = (long) num;
                count++;
            } else if (num > thirdmax) {
                thirdmax = (long) num;
                count++;
            }
        }
        
        return count >= 3 ? thirdmax.intValue() : firstmax.intValue(); 
    }
}
