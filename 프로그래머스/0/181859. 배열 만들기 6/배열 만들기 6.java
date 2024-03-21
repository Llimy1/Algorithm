import java.util.*;
class Solution {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while (i < arr.length) {
            if (stack.empty()) {
                stack.push(arr[i]);
                i++;
            } else if (stack.peek() == arr[i]) {
                stack.pop();
                i++;
            } else if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
                i++;
            }
        }
        
        if (stack.empty()) {
            stack.push(-1);
        }
        
        return stack;
    }
}