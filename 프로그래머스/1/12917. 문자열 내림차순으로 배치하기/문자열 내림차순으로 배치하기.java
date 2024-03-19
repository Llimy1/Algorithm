import java.util.Arrays;


class Solution {
    public String solution(String s) {
        String answer = "";
        char[] cArr = s.toCharArray();
        
        Arrays.sort(cArr);
        
        StringBuilder str = new StringBuilder();
        for (char c : cArr) {
            str.append(c);
        }
        
        answer = str.reverse().toString();
        
        return answer;
    }
}