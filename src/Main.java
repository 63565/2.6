import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Введите радиус круга ");
        double radius = scanner.nextDouble();
        double area1 = Math.PI * (radius * radius);
        System.out.println("Площадь круга равна: " + area1);
        System.out.println("Введите сторону квадрата");
        double side = scanner.nextDouble();
        double area2 = side *side ;
        System.out.println("Площадь квадрата: "+area2);
        if (area1 >area2 ) {
            System.out.println("Площадь круга больше");
        } else if (area1==area2) {
            System.out.println("Площади равны");
        } else {
            System.out.println("Площадь квадрата больше");
        }
    }
}