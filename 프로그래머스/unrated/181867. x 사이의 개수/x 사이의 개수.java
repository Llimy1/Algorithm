import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(String myString) {
        ArrayList<Integer> answer = new ArrayList<>();
        int count = 0;
        
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) != 'x') {
                count++;
            } else {
                answer.add(count);
                count = 0;
            }
        }
        answer.add(count);
        return answer;
    }
}