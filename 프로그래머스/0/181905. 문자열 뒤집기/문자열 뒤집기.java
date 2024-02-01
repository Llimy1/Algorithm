class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder();
        
        String s1 = my_string.substring(0, s);
        String s2 = my_string.substring(e + 1);
        String s3 = my_string.substring(s, e + 1);
        StringBuilder sb = new StringBuilder(s3);
        sb.reverse();
        
        answer.append(s1).append(sb).append(s2);
        
        return answer.toString();
    }
}