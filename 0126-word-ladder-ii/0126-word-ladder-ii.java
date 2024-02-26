// Brute Force

// class Solution {
//     public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
//         List<List<String>> ans = new ArrayList<>();
//         Set<String> set = new HashSet<>();
//         int len = wordList.size();
        
//         for(int i = 0;i < len;i++){
//             set.add(wordList.get(i));
//         }
        
//         Queue<List<String>> q = new LinkedList<>();
//         List<String> list = new ArrayList<>();
        
//         list.add(beginWord);
//         q.add(list);
        
//         List<String> usedOnLevel = new ArrayList<>();
//         usedOnLevel.add(beginWord);
//         int level = 0;
        
//         while(!q.isEmpty()){
//             List<String> temp = q.poll();
            
//             if(temp.size() > level){
//                 level++;
//                 for(String it : usedOnLevel){
//                     set.remove(it);
//                 }
//             }
            
//             String word = temp.get(temp.size() - 1);
            
//             if(word.equals(endWord)){
//                 if(ans.size() == 0){
//                     ans.add(temp);
//                 }
//                 else if(ans.get(0).size() == temp.size()){
//                     ans.add(temp);
//                 }
//             }
            
//             for(int i = 0;i < word.length();i++){
//                 for(char ch = 'a';ch <= 'z';ch++){
//                     char[] replaced = word.toCharArray();
//                     replaced[i] = ch;
//                     String new_Word = new String(replaced);
                    
//                     if(set.contains(new_Word)){
//                         temp.add(new_Word);
                        
//                         List<String> temp2 = new ArrayList<>(temp);
//                         q.add(temp2);
                        
//                         usedOnLevel.add(new_Word);
//                         temp.remove(temp.size() - 1);
//                     }
//                 }
//             }
//         }
        
//         return ans;
//     }
// }


// Optimized Approach

class Solution {
    public static void dfs(String word, List<String> seq, String beginWord, HashMap<String, Integer> map, List<List<String>> ans){
        if(word.equals(beginWord)){
            List<String> dup = new ArrayList<>(seq);
            Collections.reverse(dup);
            ans.add(dup);
            return;
        }
        
        int steps = map.get(word);
        int size = word.length();
        
        for(int i = 0;i < size;i++){
            for(char ch = 'a';ch <= 'z';ch++){
                    char[] replaced = word.toCharArray();
                    replaced[i] = ch;
                    String new_word = new String(replaced);
                    
                    if(map.containsKey(new_word) && map.get(new_word) + 1 == steps){
                        seq.add(new_word);
                        dfs(new_word, seq, beginWord, map, ans);
                        seq.remove(seq.size() - 1);
                    }
                }
        }
    }
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) { 
        Set<String> set = new HashSet<>();
        int len = wordList.size();
        
        for(int i = 0;i < len;i++){
            set.add(wordList.get(i));
        }
        
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put(beginWord, 1);
        
        int size = beginWord.length();
        set.remove(beginWord);
        
        while(!q.isEmpty()){
            String word = q.poll();
            int steps = map.get(word);
            
            if(word.equals(endWord)){
                break;
            }
            
            for(int i = 0;i < size;i++){
                for(char ch = 'a';ch <= 'z';ch++){
                    char[] replaced = word.toCharArray();
                    replaced[i] = ch;
                    String new_word = new String(replaced);
                    
                    if(set.contains(new_word)){
                        q.add(new_word);
                        set.remove(new_word);
                        map.put(new_word, steps + 1);
                    }
                }
            }
        }
        
        List<List<String>> ans = new ArrayList<>();
        if(map.containsKey(endWord)){
            List<String> seq = new ArrayList<>();
            seq.add(endWord);
            dfs(endWord, seq, beginWord, map, ans);
        }
        return ans;
    }
}