import java.util.Scanner;

public class Final_Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ввести с консоли число в бинарном формате: ");
        String s = in.next();
        String arr[] = s.split("");
        int t = arr.length;
        double result = 0;
        for (int i = 0; i < t; i++) {

            result = result + Integer.valueOf(arr[t - (i + 1)]) * Math.pow(2, i);

        }
        System.out.println(result);
    }
}