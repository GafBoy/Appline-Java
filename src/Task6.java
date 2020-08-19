

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x=");
        int x = in.nextInt();

        System.out.print("y=");
        int y = in.nextInt();

        System.out.print("z=");
        int z = in.nextInt();


        double sr = ((double) x + (double) y + (double) z) / 3;
        System.out.println("Среднее арифметическое чисел x, y, z: " + sr);
        double otv = sr / 2;
        if ((int) otv > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}