import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger aBigInt = new BigInteger(a);
        BigInteger bBigInt = new BigInteger(b);
        
        answer = String.valueOf(aBigInt.add(bBigInt));
        return answer;
    }
}