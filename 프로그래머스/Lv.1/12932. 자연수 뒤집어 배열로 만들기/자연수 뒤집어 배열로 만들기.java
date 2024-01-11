class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        String[] sArr = str.split("");
        
        
        int[] answer = new int[sArr.length];
        int count = sArr.length - 1;
        for (String s : sArr) {
            answer[count--] = Integer.parseInt(s);
        }
        
        return answer;
    }
}