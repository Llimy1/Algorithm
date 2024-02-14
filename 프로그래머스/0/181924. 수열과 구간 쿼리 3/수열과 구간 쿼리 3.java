class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for (int[] arr2 : queries) {
            int step1 = arr2[0];
            int step2 = arr2[1];
            int temp = 0;
            
            temp = arr[step1];
            arr[step1] = arr[step2];
            arr[step2] = temp;
        }
        
        return arr;
    }
}