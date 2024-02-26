class Solution {
    static class Pair{
        String word;
        int level;
        
        public Pair(String word, int level){
            this.word = word;
            this.level = level;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord, 1));
        Set<String> set = new HashSet<>();
        
        for(int i = 0;i < wordList.size();i++){
            set.add(wordList.get(i));
        }
        
        set.remove(beginWord);
        
        while(!q.isEmpty()){
            Pair curr = q.poll();
            String word = curr.word;
            int level = curr.level;
            
            if(word.equals(endWord)){
                return level;
            }
            
            for(int i = 0;i < word.length();i++){
                for(char ch = 'a';ch <= 'z';ch++){
                    char replaced[] = word.toCharArray();
                    replaced[i] = ch;
                    String newWord = new String(replaced);
                    
                    // if set contains that word then add to queue with level increases to 1
                    if(set.contains(newWord)){
                        set.remove(newWord);
                        q.add(new Pair(newWord, level + 1));
                    }
                }
            }
        }
        
        return 0;
    }
}