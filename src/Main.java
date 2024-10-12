import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int k =scanner.nextInt();
        int m =scanner.nextInt();
        double a =k / 3.6;
        System.out.println("километр в час =" +a);
        if (a > m) {
            System.out.println("Километры в час больше метров в секунду: ");
        } else {
            System.out.println("Метры в секунду больше километров в час: ");
        }
    }
}