class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int size = myString.length();
        int patSize = pat.length();
        
        for (int i = 0; i < size; i++) {
            if (i + patSize > size) {
                break;
            } 
            
            if (myString.substring(i, i + patSize).equals(pat)) {
                answer++;
            };
        }
        
        return answer;
    }
}