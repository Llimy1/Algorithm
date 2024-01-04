import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public ArrayList<String> solution(String myString) {
        String[] arr = myString.split("x");
        ArrayList<String> answer = new ArrayList<>();
        for (String s : arr) {
            answer.add(s);
        }
        answer.removeAll(Arrays.asList("", null));
        
        
        Collections.sort(answer);
        return answer;
    }
}