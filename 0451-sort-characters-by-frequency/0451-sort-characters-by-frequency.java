class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        int n = s.length();

        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            int val = (int)(ch);
            if(map.containsKey(ch)){
                int incr = map.getOrDefault(ch,0) + 1;
                map.put(ch,incr);
            }
            else{
                map.put(ch,1);
            }
        }

        List<Character>[] arr = new List[n+1];
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            int freq = e.getValue();
            char key = e.getKey();
            if(arr[freq] == null){
                arr[freq] = new ArrayList<>();
            }
            arr[freq].add(key);
        }

        for(int i = arr.length - 1;i >= 0;i--){
            if(arr[i] != null){
                for(char c : arr[i]){
                    for(int j = 0;j < map.get(c);j++){
                        ans.append(c);
                    }
                }
            }
        }
        return ans.toString();
    }
}