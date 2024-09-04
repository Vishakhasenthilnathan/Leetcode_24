class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            int subtract = target - nums[i];
            if(map.get(subtract)!=null){
                return new int[]{map.get(subtract), i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[2];
    }
}