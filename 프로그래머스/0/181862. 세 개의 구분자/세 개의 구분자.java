import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public ArrayList<String> solution(String myStr) {
        
        myStr = myStr.replaceAll("a", " ");
        myStr = myStr.replaceAll("b", " ");
        myStr = myStr.replaceAll("c", " ");
        
        String[] sArr = myStr.split("\\s*\\s");
        
        ArrayList<String> list = new ArrayList<>();
        if (sArr.length == 0) {
            list.add("EMPTY");
        }
        for (String s : sArr) {
            list.add(s);                
        }
        
        list.removeAll(Arrays.asList(""));
//         String[] answer = new String[list.size()];
        
//         for (int i = 0; i < list.size(); i++) {
//             answer[i] = list.get(i);
//         }
        
        return list;
    }
}