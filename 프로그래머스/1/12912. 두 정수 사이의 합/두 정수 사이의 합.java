class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        boolean flag = true;
        
        if (a > b) {
            flag = false;
        }
        
        if (flag) {
            for (long i = a; i <= b; i++) {
                answer += i;
            }    
        } else {
            for (long i = b; i <= a; i++) {
                answer += i;
            }
        }
        
        return answer;
    }
}