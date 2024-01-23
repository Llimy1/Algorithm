class Solution {
    public String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        int i = 0;
        while(str1.length() > i) {
            answer.append(str1.charAt(i));
            answer.append(str2.charAt(i));
            i++;
        }
        return answer.toString();
    }
}