import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String S=in.nextLine();
        int X = Integer.parseInt(S);
        double Y = (double) X;
        System.out.print("Строка S: "+S+"\n"+"Число с типом int X: "+X+"\n"+"Число с типом double: "+Y);

    }
}