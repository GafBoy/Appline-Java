

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.printf("Введите число:");
        int num=in.nextInt();
        int A1=(num*1);
        int A2=(num*2);
        int A3=(num*3);
        int A4=(num*4);
        int A5=(num*5);
        int A6=(num*6);
        int A7=(num*7);
        int A8=(num*8);
        int A9=(num*9);
        int A10=(num*10);
        System.out.println("Таблица умножения числа "+num+":"+"\n"+num+"*1="+A1+"\n"+num+"*2="+A2+ "\n"+num+"*3="+A3+"\n"+num+"*4="+A4+"\n"+num+"*5="+A5+"\n"+num+"*6="+A6+"\n"+num+"*7="+A7+"\n"+num+"*8="+A8+"\n"+num+"*9="+A9+"\n"+num+"*10="+A10);
    }
}
