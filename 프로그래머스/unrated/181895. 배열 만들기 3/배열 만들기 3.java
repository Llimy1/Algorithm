import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public ArrayList<Integer> solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < intervals.length; i++) {
            System.out.println(Arrays.toString(intervals[i]));
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                System.out.println(arr[j]);
                answer.add(arr[j]);
            }
        }
        return answer;
    }
}