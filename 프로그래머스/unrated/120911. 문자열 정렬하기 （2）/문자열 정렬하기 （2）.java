import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String s = my_string.toLowerCase();
        
        ArrayList<Character> cList = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            cList.add(c);
        }
        Collections.sort(cList);
        
        StringBuilder sb = new StringBuilder();
        
        for (char c : cList) {
            sb.append(c);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}