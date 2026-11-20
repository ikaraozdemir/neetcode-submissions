class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> resultList = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            return resultList;
        }

        Map<String, List<Integer>> indexGroups = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] strArr = strs[i].toCharArray();
            Arrays.sort(strArr);
            String key = new String(strArr);

            indexGroups.computeIfAbsent(key, k -> new ArrayList<>()).add(i);
        }

        for (List<Integer> indices : indexGroups.values()) {
            List<String> group = new ArrayList<>();
            for (int idx : indices) {
                group.add(strs[idx]);
            }
            resultList.add(group);
        }

        return resultList;
    }
}