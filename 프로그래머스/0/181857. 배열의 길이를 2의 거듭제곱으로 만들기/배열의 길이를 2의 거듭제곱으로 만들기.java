class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        double log = log2(len);
        int l = (int) log;
        
        System.out.print(l);
        
        if (Math.pow(2, l) == len) {
            return arr;
        } else {
            int[] answer = new int[(int)Math.pow(2, l+1)];
            
            for (int i = 0; i < len; i++) {
                answer[i] = arr[i];
            }
            return answer;
        }
    }

    public static double log2(int x) {
        return Math.log(x) / Math.log(2);
    }
}