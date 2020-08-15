import java.util.Scanner;

public class Task9 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int j = in.nextInt();
        int mass[] = new int[j];

        for (int i = 0; i < j; i++) {
            mass[i] = in.nextInt();
        }
        for (int i = 0; i < j; i++) {
            System.out.println(mass[i] * 2);
        }
    }
}
