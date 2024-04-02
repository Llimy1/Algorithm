import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split(" ");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str));
        
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i).equals("Z")) {
            list.remove(i - 1);
        }
    }
    
    for (int i = 0; i < list.size(); i++) {
        if (!list.get(i).equals("Z")) {
            answer += Integer.parseInt(list.get(i));
        }
    }
        
        return answer;
    }
}