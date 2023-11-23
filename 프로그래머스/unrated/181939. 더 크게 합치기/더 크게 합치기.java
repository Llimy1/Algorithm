class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sta = Integer.toString(a);
        String stb = Integer.toString(b);
        
        String stab = sta+stb;
        String stba = stb+sta;
        
        int numab = Integer.valueOf(stab);
        int numba = Integer.valueOf(stba);
        
        if (numab >= numba) {
            return numab;
        } else {
            return numba;
        }
    }
}