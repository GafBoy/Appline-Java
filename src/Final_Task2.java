import java.util.Scanner;

public class Final_Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int length = in.nextInt();
        int mass[] = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Введите элемент массива " + i + ": ");
            mass[i] = in.nextInt();
        }
        int min = mass[0];
        int poz = 0;
        for (int e = 0; e < length; e++) {
            min = mass[e];
            poz = e;
            for (int j = e + 1; j < length; j++) {
                if (mass[j] < min) {
                    min = mass[j];
                    poz = j;
                }
            }
            int per = mass[e];
            mass[e] = mass[poz];
            mass[poz] = per;
        }
        for (int i = 0; i < length; i++) {
            System.out.println(mass[i]);
        }
    }
}
