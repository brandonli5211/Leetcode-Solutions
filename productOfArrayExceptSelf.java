class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = nums[0];
        int zeroCount = 0;
        
        //count the number of zeros, more than 2 zeros in the array means the result is all zeros
        //collect the product of the whole array
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == 0){
                zeroCount++;
            }else{ 
                if(zeroCount < 2){
                    product *= nums[i];
                }else{
                    product = 0;
                }
            }
        }
        
        int[] result = new int[nums.length];
        if(zeroCount >= 2){
            return result;
        }
        
        for(int i = 0; i < result.length; i++){
            if(nums[i] == 0){
                //prevent division by zero
                result[i] = product;
            } else{
                //divide by current value to get the product of the rest of the array
                if(zeroCount == 1){
                    result[i] = 0;
                }else{
                    result[i] = product / nums[i];
                }
            }
        }
        
        return result; 
    }
}
