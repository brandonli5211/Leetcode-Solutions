class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length <= 1) return nums;
        int end = nums.length - 1;
        int i = 0;
        while(i < end){
            if(nums[i] % 2 == 0){
                i++;
            }else{
                int temp = nums[i];
                nums[i] = nums[end];
                nums[end] = temp;
                end--;
            }
        }
        
        return nums;
    }
}
