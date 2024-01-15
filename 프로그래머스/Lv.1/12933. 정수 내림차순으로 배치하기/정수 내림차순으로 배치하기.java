import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        char[] cArr = str.toCharArray();
        ArrayList<Integer> arr = new ArrayList<>();
        for (char c : cArr) {
            arr.add(c - '0');
        }
        
        Collections.sort(arr, Collections.reverseOrder());
    
        String s = "";
        for (int i : arr) {
            s += String.valueOf(i);
        }
        
        answer = Long.parseLong(s);
        return answer;
    }
}