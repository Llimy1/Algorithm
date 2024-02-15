class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        
        int size = phone_number.length();
        int sizeBack = size - 4;
        String backNum = phone_number.substring(sizeBack, size);
        
        for (int i = 0; i < sizeBack; i++) {
            answer.append("*");
        }
        answer.append(backNum);
        
        return answer.toString();
    }
}