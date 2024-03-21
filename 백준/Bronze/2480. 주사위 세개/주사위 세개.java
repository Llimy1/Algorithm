import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dice = sc.nextLine();
        String[] diceCount = dice.split(" ");
        int a = Integer.parseInt(diceCount[0]);
        int b = Integer.parseInt(diceCount[1]);
        int c = Integer.parseInt(diceCount[2]);
        
        if (a == b && b == c) {
            System.out.print((10000 + a * 1000));
        } else if (a == b && a != c) {
            System.out.print((1000 + a * 100));
        } else if (a == c && b != c) {
            System.out.print((1000 + a * 100));
        } else if (b == c && b != a) {
            System.out.print((1000 + b * 100));
        } else {
            if (a > b && a > c) {
                System.out.print(a * 100);
            } else if (b > a && b > c) {
                System.out.print(b * 100);
            } else {
                System.out.print(c * 100);
            }
        }
    }
}