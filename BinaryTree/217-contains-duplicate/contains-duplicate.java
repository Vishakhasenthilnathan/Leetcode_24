class Solution {
    // TC - O(nlogn) SC - O(1)
    // public boolean containsDuplicate(int[] nums) {
    //     Arrays.sort(nums);
    //     for(int i=1;i<=nums.length-1;i++){
    //         if(nums[i-1] == nums[i])
    //             return true;
    //     }
    //     return false;
    // }
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet();
        for(int i: nums){
            if(set.contains(i))
                return true;
            else 
                set.add(i);
        }
        return false;
    }
}