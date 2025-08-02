class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0;i < s.length();i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> sortedEntries = new ArrayList<>(map.entrySet());
        sortedEntries.sort((a, b) -> b.getValue() - a.getValue());

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : sortedEntries) {
            char c = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}