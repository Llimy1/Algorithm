class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int size = 0;
        int[] answer = new int[0];
        switch (n) {
            case 1 -> {
                int b = slicer[1];
                size = b + 1;
                answer = new int[size];
                for (int i = 0; i <= b; i++) {
                    answer[i] = num_list[i];
                }
            }
            case 2 -> {
                int a = slicer[0];
                int len = num_list.length;
                size = len - a ;
                answer = new int[size];
                for (int i = a; i < len; i++) {
                    answer[i - a] = num_list[i];
                }
            }
            case 3 -> {
                int a = slicer[0];
                int b = slicer[1];
                size = b - a + 1;
                answer = new int[size];
                for (int i = a; i <= b; i++) {
                    answer[i - a] = num_list[i];
                }
            }
            case 4 -> {
                int a = slicer[0];
                int b = slicer[1];
                int c = slicer[2];
                int count = 0;
                size = (b - a) / 2 + 1;
                answer = new int[size];
                for (int i = a; i <= b; i += c) {
                    answer[count++] = num_list[i];
                }
            }
        }
        return answer;
    }
}