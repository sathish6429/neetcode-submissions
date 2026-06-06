class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>containtarget=new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int num =nums[i];
            int diff =target -num;
            if(containtarget.containsKey(diff)){
                return new int[]{containtarget.get(diff),i};
            }
            containtarget.put(num,i);
        }
        return new int[]{};
    }
}
