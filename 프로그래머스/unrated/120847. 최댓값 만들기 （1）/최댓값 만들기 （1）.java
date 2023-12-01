import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                answer = numbers[i] * numbers[j];
            }
        }
        
        return answer;
    }
}