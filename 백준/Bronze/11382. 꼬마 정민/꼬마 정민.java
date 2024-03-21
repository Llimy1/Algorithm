import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numString = sc.nextLine();
        
        String[] num_list = numString.split(" ");
        long sum = 0;
        for (int i = 0; i < num_list.length; i++) {
            sum += Long.parseLong(num_list[i]);
        }
        
        System.out.print(sum);
    }
}