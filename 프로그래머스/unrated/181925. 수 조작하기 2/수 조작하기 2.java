class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < numLog.length - 1; i++) {
            int num = 0;
            
            num = numLog[i+1] - numLog[i];
            
            switch (num) {
                case 1:
                    answer.append("w");
                    break;
                case 10:
                    answer.append("d");
                    break;
                case -1:
                    answer.append("s");
                    break;
                case -10:
                    answer.append("a");
                    break;
            }
        }
        return answer.toString();
    }
}