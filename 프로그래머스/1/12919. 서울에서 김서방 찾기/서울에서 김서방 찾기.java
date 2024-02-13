class Solution {
    public String solution(String[] seoul) {
        int count = 0;
        for (String s : seoul) {
            if (s.equals("Kim")) {
                break;
            }
            count++;
        }
        
        StringBuilder answer = new StringBuilder();
        answer.append("김서방은 ").append(count).append("에 있다");
        return answer.toString();
    }
}