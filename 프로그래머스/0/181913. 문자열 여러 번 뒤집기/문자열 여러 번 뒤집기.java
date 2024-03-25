class Solution {
    public String solution(String my_string, int[][] queries) {
        
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            StringBuilder temp = new StringBuilder(my_string);

            String startSub = temp.substring(0, start);
            String endSub = temp.substring(end + 1);
            String sub = temp.substring(start, end + 1);

            temp = new StringBuilder(startSub);

            for (int i = sub.length() - 1; i >= 0; i--) {
                temp.append(sub.charAt(i));
            }

            temp.append(endSub);
            my_string = temp.toString();
        }
        return my_string;
    }
}