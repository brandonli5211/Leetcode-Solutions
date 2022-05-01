class Solution {
    public int reverse(int x) {
        int digits = 0;
        int y = 0;
        int z = x;
        while(z != 0){
            z /= 10;
            digits++;
        }

        for(int i = digits - 1; i >= 0; i--){
            int current = x % 10;
            x /= 10;
            y += current * Math.pow(10,i);
        }
        if(y == Integer.MAX_VALUE || y == Integer.MIN_VALUE){
            return 0;
        }
        return y;

    }
}
