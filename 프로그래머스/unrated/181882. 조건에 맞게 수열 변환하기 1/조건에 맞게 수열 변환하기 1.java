import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int num : arr) {
            if (num >= 50 && num % 2 == 0) {
                answer.add(num / 2);
            } else if (num < 50 && num % 2 == 1){
                answer.add(num * 2);   
            } else {
                answer.add(num);
            }
        }
        return answer;
    }
}