class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        
        boolean b1 = x1 | x2;
        boolean b2 = x3 | x4;
        answer = b1 & b2;
        
        return answer;
    }
}