class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder(my_string);
        
        for (int i : indices) {
            answer.deleteCharAt(i);
            answer.insert(i, "0");
        }
        
        String str = answer.toString();
        str = str.replaceAll("0", "");
       
        
        return str;
    }
}