import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();
        boolean divisibleBy5 = false;

        if (a % 5 == 0) {
            System.out.println("a=" + a);
            divisibleBy5 = true;
        }
        if (b % 5 == 0) {
            System.out.println("b=" + b);
            divisibleBy5 = true;
        }
        if (c % 5 == 0) {
            System.out.println("c=" + c);
            divisibleBy5 = true;
        }

        if (!divisibleBy5) {
            System.out.println("нет значений, кратных 5");
        }

        int divisionResult = a / b;
        System.out.println( + divisionResult);
        float divisionResultFloat = (float) a / b;
        System.out.println( + divisionResultFloat);
        int roundedUp = (int) Math.ceil((double) a / b);
        System.out.println( + roundedUp);
        int roundedDown = (int) Math.floor((double) a / b);
        System.out.println( + roundedDown);
        int roundedMath = Math.round((float) a / b);
        System.out.println( + roundedMath);
        int remainder = b % c;
        System.out.println( + remainder);
        int min = Math.min(a, b);
        System.out.println( + min);
        int max = Math.max(b, c);
        System.out.println( + max);
    }
}