import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];

        for (int k = 0; k < queries.length; k++) {
            int s = queries[k][0];
            int e = queries[k][1];
            
            for (int j = s; j <= e; j++) {
                arr[j] = arr[j] + 1;   
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}