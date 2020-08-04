
   import java.util.Scanner;

        public class Task10 {
            public static void main(String args[]) {
                Scanner in = new Scanner(System.in);
                System.out.print("Введите первый индекс матрицы: ");
                int t = in.nextInt();
                System.out.print("Введите второй индекс матрицы: ");
                int e =in.nextInt();
                int mass[][]=new int[t][e];

                for(int i=0; t>i; i++){
                    for(int j=0; e>j; j++){
                        mass[i][j]=in.nextInt();

                    }

                }for(int j=0; j<e; j++){System.out.println("Вывод первой строки матрицы помноженной на 3: "+ mass[0][j]*3);
            }}}