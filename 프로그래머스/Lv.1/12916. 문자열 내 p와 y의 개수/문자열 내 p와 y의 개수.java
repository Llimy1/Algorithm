class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        String lowerStr = s.toLowerCase();
        
        int pCount = 0;
        int yCount = 0;
        
        for (int i = 0; i< lowerStr.length(); i++) {
            switch (lowerStr.charAt(i)) {
                    case 'p':
                        pCount++;
                        break;
                    case 'y':
                        yCount++;
            }
            answer = (pCount == yCount) ? true : false;
        }
        return answer;
    }
}