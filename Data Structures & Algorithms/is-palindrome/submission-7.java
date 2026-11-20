class Solution {
    public boolean isPalindrome(String s) {

      String[] words = s.split(" ");
      StringBuilder merged = new StringBuilder();

      for (String word : words) {
        String cleaned = word.replaceAll("[^a-zA-Z0-9]","");
        if (!cleaned.isEmpty()) {
            merged.append(cleaned.toLowerCase());
        }
      }
      
      for (int position = 0; position <= merged.length()-1 ; position++) {
        if (merged.charAt(position) == merged.charAt((merged.length()-1-position))){
           
            if (position == merged.length()-1-position) {
                return true;
            }

             continue;
        }
        
        return false;
      }
      return true;
    }
}



