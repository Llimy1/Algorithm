class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String str = String.valueOf(x);
        String[] arr = str.split("");
        
        int sum = 0;
        for (String s : arr) {
            sum += Integer.parseInt(s);
        }
        
        answer = (x % sum == 0) ? true : false;
        
        return answer;
    }
}