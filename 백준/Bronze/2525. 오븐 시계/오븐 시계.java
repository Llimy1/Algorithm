import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String clock = sc.nextLine();
        int count = sc.nextInt();
        String[] clock_list = clock.split(" ");
        int hour = Integer.parseInt(clock_list[0]);
        int min = Integer.parseInt(clock_list[1]);
        int plusHour = 0;
        int plusMin = 0;
        
        if (count > 60) {
            plusMin = count % 60;
            plusHour = count / 60;
        } else {
            plusMin = count;
        }
        
        int totalHour = hour + plusHour;
        int totalMin = min + plusMin;
        
        if (totalMin == 60) {
            totalHour = totalHour + 1;
            totalMin = 0;
        } else if (totalMin > 60) {
            totalHour = totalHour + (totalMin / 60);
            totalMin = totalMin % 60;
        }
        
        if (totalHour >= 24) {
           totalHour = totalHour % 24;
        }
        
        System.out.print(totalHour + " " + totalMin);
    }
}