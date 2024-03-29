import java.util.ArrayList;
class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] strArr = binomial.split("\\s");
        
        switch (strArr[1]) {
            case "+":
                answer = Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[2]);
                break;
            case "-":
                answer = Integer.parseInt(strArr[0]) - Integer.parseInt(strArr[2]);
                break;
            case "*":
                answer = Integer.parseInt(strArr[0]) * Integer.parseInt(strArr[2]);
                break;
        }
        return answer;
    }
}