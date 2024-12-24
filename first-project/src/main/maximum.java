import java.util.Scanner;

public class MaxOfFourNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введите третье число: ");
        double num3 = scanner.nextDouble();

        System.out.print("Введите четвертое число: ");
        double num4 = scanner.nextDouble();

        double max = findMax(num1, num2, num3, num4);
        System.out.println("Максимальное число: " + max);
    }

    public static double findMax(double a, double b, double c, double d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }
}
