class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        int i = 0;
        int size = my_string.length();
        int j = 1;
        
        while (i < size) {
            String str = my_string.substring(i, m * j);
            answer.append(str.charAt(c - 1));
            i += m;
            j++;
        }
        
        return answer.toString();
    }
}