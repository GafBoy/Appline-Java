import java.io.*;

public class Task18 {
    public static void main(String[] args) {
        String txt;
        int lines = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("Task18.txt"))) {
            while ((txt = br.readLine()) != null) {
                lines++;
                System.out.println(txt);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
        System.out.println("Количество строк: " + lines);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try (FileWriter fw = new FileWriter("Task18.txt")) {
            String t = "";
            for (int i = 0; i < lines; i++) {
                System.out.print(": ");
                t = t + br.readLine() + "\r\n";
            }
            fw.write(t);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода " + exc);

        }
    }
}
