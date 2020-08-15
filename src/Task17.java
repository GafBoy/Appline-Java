import java.awt.*;
import java.io.*;

public class Task17 {
    public static void main(String[] args) {
        String file;
        BufferedReader txt = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Конец ввода строки 'стоп'");
        try (FileWriter fw = new FileWriter("Task17.txt")) {
            do {
                System.out.print(": ");
                file = txt.readLine();

                if (file.compareTo("стоп") == 0) break;

                file = file + "\r\n";
                fw.write(file);
            } while (file.compareTo("стоп") != 0);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода " + exc);

        }
    }

}
