class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            char left = s.charAt(start);
            char right = s.charAt(end);

            if(!Character.isLetter(left) && !Character.isDigit(left)){
                start++;
            }else if(!Character.isLetter(right) && !Character.isDigit(right)){
                end--;
            }else{
                left = Character.toLowerCase(s.charAt(start));
                right = Character.toLowerCase(s.charAt(end));
                if(left != right) return false;

                start++;
                end--;
            }
        }
        return true;

    }
}
