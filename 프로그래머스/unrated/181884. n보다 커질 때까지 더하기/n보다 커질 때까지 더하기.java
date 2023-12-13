class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        
        for (int k : numbers) {
            answer += k;
            if (answer > n) break;
        }
        return answer;
    }
}