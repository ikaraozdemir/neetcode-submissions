class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder subString = new StringBuilder();
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            int duplicateIndex = subString.indexOf(String.valueOf(ch));
            if (duplicateIndex != -1) {
                subString.delete(0, duplicateIndex + 1);
            }

            subString.append(ch);
            maxLength = Math.max(maxLength, subString.length());
        }

        return maxLength;
    }
}