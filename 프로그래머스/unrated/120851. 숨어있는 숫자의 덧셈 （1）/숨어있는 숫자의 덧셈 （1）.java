class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (char x : my_string.toCharArray()) {
            if (x >= 48 && x <= 58) {
                answer += (x-48);
            }
        }
        return answer;
    }
}