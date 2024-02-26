import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = arr.clone();
        
        if (answer.length == 1) {
            answer[0] = -1;
            return answer;
        }
        
        
        List<Integer> list = new ArrayList();
        
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        Collections.sort(list);
        
        int min = list.get(0);
        
        List<Integer> newList = new ArrayList();
        
        for (int i = 0; i < arr.length; i++) {
            newList.add(arr[i]);
        }
        
        newList.remove(Integer.valueOf(min));
        
        answer = new int[newList.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = newList.get(i);
        }
        
        return answer;
    }
}