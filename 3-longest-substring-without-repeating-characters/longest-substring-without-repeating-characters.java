class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left= 0, max = 0;

        for(int Right = 0; Right<s.length(); Right++){
            while(set.contains(s.charAt(Right))) {
                set.remove(s.charAt(left));
                left++;
        }
        set.add(s.charAt(Right));
        max = Math.max(max,Right- left +1);
        }
        return max;
     }
}