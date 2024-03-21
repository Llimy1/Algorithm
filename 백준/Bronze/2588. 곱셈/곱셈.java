import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int third = num2 % 10;
        int second = num2 % 100 / 10;
        int first = num2 / 10 / 10;
        
        System.out.print(num1 * third + "\n" +
                        num1 * second + "\n" + 
                        num1 * first + "\n" + 
                        num1 * num2);
        
        
    }
}