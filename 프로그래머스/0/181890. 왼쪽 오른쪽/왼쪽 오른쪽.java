import java.util.ArrayList;
class Solution {
    public ArrayList<String> solution(String[] str_list) {
        ArrayList<String> answer = new ArrayList<>();
        
        int idx = 0;
        boolean flag = false;
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                idx = i;
                break;
            } else if (str_list[i].equals("r")) {
                idx =  i;
                flag = true;
                break;
            }
        }
        
        if (flag) {
            for (int i = idx + 1; i < str_list.length; i++) {
                answer.add(str_list[i]);
            }
        } else {
            for (int i = 0; i < idx; i++) {
                answer.add(str_list[i]);
            }
        }
        
        return answer;
    }
}