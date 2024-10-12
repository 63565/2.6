import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.println("введи число ");
        int a = n.nextInt();
        int hour;
        hour = a / 3600;
        int min;
        min = hour%60;
        int sec;
        sec = min%60;
        System.out.println(hour);
        System.out.println(min);
        System.out.println(sec);
    }
}