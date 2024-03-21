import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numSet = sc.nextLine();
        String[] num_list = numSet.split(" ");
        int a = Integer.parseInt(num_list[0]);
        int b = Integer.parseInt(num_list[1]);
        
        if (a > b) {
            System.out.print(">");
        } else if (a < b) {
            System.out.print("<");
        } else {
            System.out.print("==");
        }
    }
}