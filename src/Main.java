import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите минуты");
        
        int t = scanner.nextInt();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double x = (b*b) - 4*a*c;
        if (x<0) {
            System.out.println("вещественных корней нет");
        } else if (a==0){
            System.out.println("Попробуй еще детка");
        }
        else {
            System.out.println("вещественные корни есть");

        }
    }
}