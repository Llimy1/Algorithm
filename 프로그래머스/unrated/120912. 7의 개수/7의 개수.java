class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            String s = String.valueOf(array[i]);
            String[] sArr = s.split("");
            
            for (int j = 0; j < sArr.length; j++) {
                if (sArr[j].equals("7")) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}