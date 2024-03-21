import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String clock = sc.nextLine();
        String[] clock_list = clock.split(" ");
        int hour = Integer.parseInt(clock_list[0]);
        int min = Integer.parseInt(clock_list[1]);
        int alarmMin = min - 45;
        if (alarmMin < 0) {
            if (hour == 0) {
                System.out.print(23 + " " + (60 + alarmMin));
            } else {
                int alarmHour = hour - 1;
                System.out.print(alarmHour + " " + (60 + alarmMin));
            }
        } else {
            System.out.print(hour + " " + alarmMin);
        }
    }
}