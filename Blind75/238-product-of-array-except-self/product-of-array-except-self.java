class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] p = new int[n];
        p[0] = 1;
        for(int i=1;i<n;i++){
            p[i] = p[i-1] * nums[i-1]; 
        }

        int[] result = new int[n];
        int suffix = 1;
        for(int i=n-1;i>=0;i--){
            result[i] = p[i] * suffix;
            suffix = suffix * nums[i];
        }

        return result;
    }
}