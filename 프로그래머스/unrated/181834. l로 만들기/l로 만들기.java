class Solution {
    public String solution(String myString) {
        String answer = "";
        
        char[] cArr = myString.toCharArray();
        
        for (char c : cArr) {
            if (c < 'l') {
                answer += 'l';
            } else {
                answer += c;
            }
        }
        
        return answer;
    }
}