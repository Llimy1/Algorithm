import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        String str2;
        for (String str : intStrs) {
            str2 = str.substring(s, s + l);
            if (Integer.parseInt(str2) > k) {
                answer.add(Integer.parseInt(str2));
            };
        }
        return answer;
    }
}