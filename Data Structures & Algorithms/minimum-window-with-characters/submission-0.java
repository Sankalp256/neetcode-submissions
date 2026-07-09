class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty())
            return "";

        int[] sMap = new int[256];
        int[] tMap = new int[256];
        int minLength = Integer.MAX_VALUE;
        int minStart = 0;

        for (int i = 0; i < t.length(); i++) {
            tMap[t.charAt(i)]++;
        }

        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            sMap[s.charAt(right)]++;

            while (contains(sMap, tMap)) {
                if ((right - left + 1) < minLength) {
                    minLength = right - left + 1;
                    minStart = left;
                }
                sMap[s.charAt(left++)]--;
            }
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);
    }

    public boolean contains(int[] mapS, int[] mapT) {
        for (int i = 0; i < 256; i++) {
            if (mapT[i] > mapS[i]) {
                return false;
            }
        }
        return true;
    }
}
