class Solution {
    public String solution(String myString) {
        String answer = "";
        
        String lower = myString.toLowerCase();
        
        answer = lower.replaceAll("a", "A");
        return answer;
    }
}