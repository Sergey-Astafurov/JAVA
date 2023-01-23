
import java.util.*;
import java.lang.Math;

public class program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Привет! Введи номер треугольного числа");
        int n;

        n = input.nextInt();
        int res;

        res = (int) (0.5 * (n + 1) * n);
        System.out.println("Число под номером :" + n + " = " + res);
        int i;

        for (i = 0; i <= n - 1; i++) {
            System.out.print(Integer.toString(i + 1) + " + ");
        }
    }
}

