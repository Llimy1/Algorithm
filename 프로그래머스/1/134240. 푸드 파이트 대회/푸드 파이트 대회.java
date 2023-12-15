class Solution {
    public String solution(int[] food) {
        String answer = "";
        String reverse = "";
        String result = "";
        for (int i = 1; i < food.length; i++) {
            if (food[i] % 2 == 1 && food[i] != 1) {
                for (int j = 0; j < food[i] / 2; j++) {
                    answer += Integer.toString(i);    
                } 
            } else if (food[i] != 1){
                for (int k = 0; k < food[i] / 2; k++) {
                    answer += Integer.toString(i);   
                }
            }
        } 
        for (int i = answer.length() - 1; i >= 0; i--) {
                reverse += answer.charAt(i);
        }
        result = answer + "0" + reverse; 
        return result;
    }
}