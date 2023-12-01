class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int cntJ = 0;
        int cntH = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                cntJ++;
            } else {
                cntH++;
            }
        }
        
        answer[0] = cntJ;
        answer[1] = cntH;
        return answer;
    }
}