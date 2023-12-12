class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int n = num_list.length;
        
        if (n >= 11) {
            for (int k : num_list) {
                answer += k;
            }
        } else {
            answer = answer + 1;
            for (int k : num_list) {
                answer *= k;
            }
        }
        return answer;
    }
}