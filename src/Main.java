import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введи трехзначное число");

        int num = scanner.nextInt();

        int a = num % 10;
        int b = (num % 100) / 10;
        int c = num / 100;


        System.out.println("число в обратном порядке " + a + b + c);
    }
}