class Solution {
    public boolean solution(String s) {
        char[] cArr = s.toCharArray();
        
        if (cArr.length == 4 || cArr.length == 6) {
            for (char c : cArr) {
                if ('0' > c || c > '9') {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}