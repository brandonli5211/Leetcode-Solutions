class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0; 
        int end = 0;
        int length = 0; 
        Set<Character> set = new HashSet<Character>();
        
        while(end < s.length()){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                end++;
                if(set.size() > length) length = set.size();
            }else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        
        return length;
    }
}
