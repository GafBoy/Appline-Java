import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task16 {
    public static void main(String[] args) {
        String txt;
        try (BufferedReader br = new BufferedReader(new FileReader("Task16.txt"))) {
            while ((txt = br.readLine()) != null) {
                System.out.println(txt);
            }
        }catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: "+ exc);
        }
    }
}
