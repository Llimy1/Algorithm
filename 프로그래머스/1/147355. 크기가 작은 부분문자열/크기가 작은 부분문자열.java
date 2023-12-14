class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tLen = t.length();
        int pLen = p.length();
        long tNum = 0;
        long pNum = 0;
        
        for (int i = 0; i < tLen - (pLen - 1); i++) {
            tNum = Long.parseLong(t.substring(i, i+pLen));
            pNum = Long.parseLong(p);
            
            if (tNum <= pNum) {
                answer++;
            }
        }
        return answer;
    }
}