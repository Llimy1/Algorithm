import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer> arr2 = new ArrayList<>();
        
        for (int i : arr) {
            arr2.add(i);
        }
        
        for (int del : delete_list) {
            int index = arr2.indexOf(del);
            
            if (index != -1) {
                arr2.remove(index);
            }
        }
        
        
        return arr2;
    }
}