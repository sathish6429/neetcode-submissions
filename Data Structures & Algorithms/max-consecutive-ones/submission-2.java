class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int consectiveOne=0;
        int maxConsectiveOne=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                consectiveOne++;
            maxConsectiveOne= Math.max(maxConsectiveOne, consectiveOne);
            } else {
               consectiveOne = 0  ;    
 }
        }
        return maxConsectiveOne;
    }
}