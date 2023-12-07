class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        char[] cArr = myString.toCharArray();
        String str = new String();
        
        for (char c : cArr) {
            if (c == 'A') {
                str += 'B';
            } else {
                str += 'A';
            }
        }
        
        answer = str.contains(pat) ? 1 : 0;
        
        return answer;
    }
}