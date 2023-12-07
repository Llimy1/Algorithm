class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for (int num : num_list) {
            if (num % 2 == 0) {
                sb1.append(Integer.toString(num));
            } else {
                sb2.append(Integer.toString(num));
            }
        }
        
        answer = Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());
        
        return answer;
    }
}