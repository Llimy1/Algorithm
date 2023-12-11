import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(int[] num_list) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i : num_list) {
            arr.add(i);
        }
        
        Collections.sort(arr);
        
        for (int i = 0; i < 5; i++) {
            answer.add(arr.get(i));
        }
        
        
        
        return answer;
    }
}