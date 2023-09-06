// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         if (strs == null || strs.length == 0) {
//             return "";
//         }
        
//         String prefix = strs[0]; 
        
//         for (int i = 1; i < strs.length; i++) {
//             while (strs[i].indexOf(prefix) != 0) {
//                 prefix = prefix.substring(0, prefix.length() - 1);
//                 if (prefix.isEmpty()) {
//                     return "";
//                 }
//             }
//         }
        
//         return prefix;
//     }
// }

// MY SOLUTION
class Solution{
    public static String compare(String a,String b){
        int len = Math.min(a.length(),b.length());
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i<len;i++){
            if(a.charAt(i) != b.charAt(i)){
                break;
            }
            else{
                ans.append(a.charAt(i));
            }
        }
        return ans.toString();
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        String temp = strs[0];
        for(int i = 1;i<strs.length;i++){
            String s = strs[i];
            String get = compare(temp,s);
            if(get == ""){
                return "";
            }
            else{
                temp = get;
            }
        }
        return temp;
    }
}
