import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.print((a + b) % c + "\n" +
                        ((a % c) + (b % c)) % c + "\n" +
                        (a * b) % c + "\n" + 
                        ((a % c) * (b % c)) % c);
    }
}