class Solution {
    public int[] solution(int[] arr) {        
        int startIndex = 0;
        int lastIndex = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                startIndex = i;
                break;
            }
        }
        
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == 2) {
                lastIndex = i;
                break;
            }
        }
        
        int[] answer = new int[lastIndex - startIndex + 1];
        
        if (lastIndex == 0 && startIndex == 0) {
            answer[0] = -1;
            return answer;
        }
        
        int index = 0;
        for (int i = startIndex; i <= lastIndex; i++) {
            answer[index] = arr[i];
            index++;
        }
        
        return answer;
    }
}