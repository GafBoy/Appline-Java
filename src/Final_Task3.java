import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Final_Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текущий курс: ");
        BigDecimal k= in.nextBigDecimal();
        System.out.print("Введите сумму в рублях: ");
        BigDecimal rub = in.nextBigDecimal();
        BigDecimal result= rub.divide(k, 2, RoundingMode.HALF_UP);
        System.out.print("Количество долларов: "+result);
    }
}
