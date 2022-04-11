class Solution {
    public static boolean validMountainArray(int[] arr) {
        int timesIncreasing = 0;
        int timesDecreasing = 0;

        if(arr.length <= 2) return false;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[i-1]){
                int k = i;
                while( k < arr.length && arr[k] > arr[k - 1]){
                    k++;
                }
                timesIncreasing++;
                i = k - 1;
            }else if(arr[i] < arr[i-1]){
                int k = i;
                while(k < arr.length && arr[k] < arr[k - 1]){
                    k++;
                }
                timesDecreasing++;
                i = k - 1;
            }else{
                return false;
            }

            if(timesDecreasing > timesIncreasing) return false;
        }

        if(timesIncreasing == 1 && timesDecreasing == 1) return true;
        return false;
    }
}
