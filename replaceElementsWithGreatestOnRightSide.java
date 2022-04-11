class Solution {
    public int[] replaceElements(int[] arr) {
        int temp = arr[arr.length -1];
        int max = arr[arr.length -1];
        arr[arr.length - 1] = -1;
        for(int i = arr.length -2 ;i>=0;i--) {
            max = Math.max(temp, max);
            temp = arr[i];
            arr[i] = max;
        }
        return arr;
    }
}
