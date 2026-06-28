class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        int length = 0,maxLength = 0;
        for(int right = 0; right < s.length(); right++){

            while(charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(s.charAt(right));
            length = charSet.size();
            maxLength = Math.max(length,maxLength);

        }

        return maxLength;
    }
}
