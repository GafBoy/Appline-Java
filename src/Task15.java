import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int lenght = in.nextInt();
        int mass[] = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.println("Введите значение для элемента " + i + ": ");
            mass[i] = in.nextInt();
        }
        for (int j = 1; lenght > j; j++) {
            for (int i = 0; i < lenght - j; i++) {
                if (mass[i] > mass[i + 1]) {
                    int t = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = t;
                }
            }
        }
        for (int i = 0; i < lenght; i++) {
            System.out.println("Отсортированный массив: " + mass[i]);
        }
    }
}

