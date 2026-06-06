class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentLength=0;
        int maximumLength=0;
        for(int num : nums ){
            if(num==1){
            currentLength++;
            maximumLength= Math.max(maximumLength, currentLength);
            } else {
               currentLength = 0  ;    
 }
        }
        return maximumLength;
    }
}