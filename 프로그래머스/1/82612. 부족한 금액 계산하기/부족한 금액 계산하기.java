class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        int i = 1;
        long priceSum = 0;
        
        while (i <= count) {
            priceSum += price * i;
            i++;
        }
        
        answer = priceSum - money;
        
        if (answer < 0) {
            answer = 0;
        }
        return answer;
    }
}