import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String sum = String.valueOf(a + b);
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(a) + " + " + String.valueOf(b) + " = " + sum);
        System.out.println(sb.toString());
    }
}