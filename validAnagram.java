class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> wordOne = new HashMap<>();
        Map<Character, Integer> wordTwo = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            wordOne.put(s.charAt(i), wordOne.getOrDefault(s.charAt(i), 0) + 1);
            wordTwo.put(t.charAt(i), wordTwo.getOrDefault(t.charAt(i), 0) + 1);
        }

        return wordOne.equals(wordTwo);
    }
}