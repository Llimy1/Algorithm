class Solution {
    public long solution(long n) {
        long answer = 0;
        
        double sqrt = Math.sqrt(n);
        
        if (sqrt % 1 == 0) {
            long x = (long)sqrt;
            answer = (x+1) * (x+1);
        } else {
            answer = -1;
        }
        return answer;
    }
}