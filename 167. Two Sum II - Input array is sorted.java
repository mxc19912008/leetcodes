public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int lo = 0, hi = nums.length-1;
            while(lo < hi){
                int sum = nums[lo] + nums[hi];
                if (sum < target){
                    while(lo < hi && nums[lo]==nums[lo+1]) lo++;
                    lo++;
                }else if(sum > target){
                    while(lo <= hi && nums[hi]==nums[hi-1]) hi--;
                    hi--;
                }else {
                    return new int[] { lo+1, hi+1 };
                    
                }
            }
            throw new IllegalArgumentException("No two sum solution");
        }
        
    
}