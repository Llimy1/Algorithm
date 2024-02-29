class Solution {
    public String solution(String s) {
        String answer = "";
        
        int size = s.length();
        int index = size / 2;
        
        if (size % 2 == 0) {    
            return s.substring(index - 1, index + 1);
        }
        
        answer = s.substring(index, index + 1);        
        
        return answer;
    }
}