class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
            if (getDivisor(i) % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        
        System.out.print(answer);
        return answer;
    }
    
    private int getDivisor(int num) {
        int count = 0;
        
        for (int i = 1; i <= (int)num / 2; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        count++;
        return count;
    }
}