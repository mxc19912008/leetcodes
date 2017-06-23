public class Solution {
    public void moveZeroes(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=0){
                int j = i-1;
                while(i>=1&&nums[j]==0){
                    int toSwap = nums[i];
                    nums[i] = nums[j];
                    nums[j] = toSwap;
                    j--;
                    i--;
                }
            }
        }
    }
}