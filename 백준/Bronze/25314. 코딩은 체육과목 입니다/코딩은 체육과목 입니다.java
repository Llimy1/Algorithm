import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int bite = sc.nextInt();
        
        for (int i = 0; i < bite / 4; i++) {
            sb.append("long ");
        }
        sb.append("int");
        System.out.print(sb.toString());
    }
}