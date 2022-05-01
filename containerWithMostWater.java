class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int maxArea = 0;
        while(low < high){
            if(height[low] < height[high]){
                maxArea = Math.max(maxArea, height[low] * height[high - low]);
                low++;
            }else{
                maxArea = Math.max(maxArea, height[high] * height[high - low]);
                high--;
            }
        }
        return maxArea;
    }
}
