class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer, Integer> myHashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (myHashMap.containsValue(nums[i])){
                return true;
            }
            myHashMap.put(i, nums[i]);
        }

        return false;
        
    }
}