class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str=new StringBuilder();
        int n=word1.length();
        int m=word2.length();
        int i=0;
        while(i<n && i<m){
            str.append(word1.charAt(i)).append(word2.charAt(i));
            i++;
        }
        str.append(word1.substring(i, n)).append(word2.substring(i, m));
        return str.toString();
    }
}