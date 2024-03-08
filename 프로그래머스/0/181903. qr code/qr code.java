class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();
        
        String[] split = code.split("");
        for (int i = 0; i < split.length; i++) {
            if (i % q == r) {
                answer.append(split[i]);
            }
        }
        
        return answer.toString();
    }
}