

import java.util.Scanner;

public class Task6{

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("x=");
        int x=in.nextInt();

        System.out.print("y=");
        int y=in.nextInt();

        System.out.print("z=");
        int z=in.nextInt();

        int sr=((x+y+z)/3);
        System.out.println("Среднее арифметическое чисел x, y, z: "+sr);
        int otv=(sr/2);
        if (otv>3) {
            System.out.println("Программа выполнена коректно");
        }
    }
}