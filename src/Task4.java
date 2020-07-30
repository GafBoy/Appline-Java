import java.util.Scanner;

public class Task4 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.printf("Ввести число:");
        String num=in.next();
        int numAfterConvert=Integer.parseInt(num, 2);
        System.out.printf("Введенное число: %d", numAfterConvert);



    }
}