class Solution {
    public String[] solution(String s, int n) {
        String[] answer;
        if (s.length() % n == 0) {
            answer = new String[s.length() / n];
        } else {
            answer = new String[s.length() / n + 1];
        }
        
        for (int i = 0; i < answer.length; i++) {
            if ((i + 1) * n > s.length()) {
                answer[i] = s.substring(i * n);
            } else {
                answer[i] = s.substring(i * n, (i + 1) * n);
            }
        }
        return answer;
    }
}