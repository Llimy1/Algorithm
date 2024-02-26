class Solution {
    public String[] solution(String myStr) {
        
        char[] cArr = myStr.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : cArr) {
            if (c == 'a' || c == 'b' || c == 'c') {
                sb.append(" ");
            } else {
                sb.append(c);
            }
        }
        
        String[] str = sb.toString().trim().split("\\s*\\s");
        
        if (str[0].equals("")) {
            str[0] = "EMPTY";
        }
        
        return str;
    }
}