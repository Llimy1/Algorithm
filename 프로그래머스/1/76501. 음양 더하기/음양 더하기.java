class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int count = 0;
        for (boolean b : signs) {
            int i = 0;
            if (!b) {
                i = absolutes[count] * -1;
            } else {
                i = absolutes[count];    
            }
            
            answer = answer + i;
            count++;
        }
        return answer;
    }
}