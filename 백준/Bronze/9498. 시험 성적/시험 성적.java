import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if (90 <= num && num <= 100) {
            System.out.print("A");
        } else if (80 <= num && num < 90) {
            System.out.print("B");
        } else if (70 <= num && num < 80) {
            System.out.print("C");
        } else if (60 <= num && num < 70) {
            System.out.print("D");
        } else {
            System.out.print("F");
        }
    }
}