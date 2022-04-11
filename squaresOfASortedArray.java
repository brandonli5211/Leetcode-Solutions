class Solution {
   public static int[] sortedSquares(int[] nums) {
       int low = 0;
       int high = nums.length - 1;
       int k = nums.length - 1;
       
       int[] result = new int[nums.length];
       
       while(low <= high){
           int sq1 = nums[low] * nums[low];
           int sq2 = nums[high] * nums[high];
           if( sq1 < sq2){
               result[k] = sq2;
               high--;
           }
           else{
               result[k] = sq1;
               low++;
           }
           
           k--;
       }
       return result;
   }
}
