class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == 0) {
                shiftRight(arr, i);
                arr[i + 1] = 0;
                i++;
            }
        }
    }
    
    public static void shiftRight(int arr[], int pos) {
        for(int i = arr.length - 2; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
    }
}
