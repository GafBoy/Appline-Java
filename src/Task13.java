import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str1 = in.nextLine();
        System.out.println("Введите вторую строку: ");
        String str2 = in.nextLine();
        int length1 = str1.length();
        int length2 = str2.length();
        if (length1 < length2) {
            System.out.println("Строка с большей длинной : "+ str2);
        }
            else if (length1 > length2) {
                System.out.println("Строка с большей длинной : "+ str1);
            }
            else if (length1 == length2) {
                System.out.println("Длины строк равны");

            }
        }
    }

