class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> mappings = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] strAsChars = strs[i].toCharArray();
            Arrays.sort(strAsChars);
            String strSorted = new String(strAsChars);

            List<String> existing = mappings.getOrDefault(strSorted, new ArrayList<>());
            existing.add(strs[i]);

            mappings.put(strSorted, existing);
        }

        for (Map.Entry<String, List<String>> entry : mappings.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }
}