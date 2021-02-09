
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("----------  Задание первое (1  Работа с консолью)  ----------");
        System.out.println("Silence is golden");
        System.out.println("----------  Задание второе (3   Работа с консолью)  ----------");
        System.out.println("0\n00\n000\n0000\n00000");
        System.out.println("----------  Задание третье  (6 Простейшая арифметика)  ----------");
        Scanner in = new Scanner(System.in);
        System.out.print("Цена за 1 кг конфет: ");
        int konf = in.nextInt();
        System.out.print("Цена за 1 кг печенья: ");
        int pec = in.nextInt();
        System.out.print("a) Цена за 300 г конфет и 400 г печенья = " + (konf * 0.3 + pec * 0.4) + "\n");
        System.out.print("б) 2 кг печенья + 1 кг конфет + 800 г конфет = " + (pec * 2 + konf * 0.8 + konf) + "\n");
        System.out.println("----------  Задание четвертое  (12 Простейшая арифметика)  ----------");
        System.out.print("Введите недели: ");
        int ned = in.nextInt();
        System.out.print("Введите месяца: ");
        int mes = in.nextInt();
        System.out.print("Введите года: ");
        int god = in.nextInt();
        System.out.println("Это в днях = " + ( ned * 7 + mes * 30 + god * 356));
        System.out.println("----------  Задание пятое  (6 Условный оператор и арифметика)  ----------");
        int a = 4, b =6 ,o;
        if (a == 6){
            System.out.println("yes");
        }else {
            o = b ;
            b = a ;
            a = o ;
            System.out.println(" a = " + a + " b = " + b);
        }

        System.out.println("----------  Задание шестое  (32 Условный оператор и арифметика)  ----------");

        System.out.print("Введите 4 значное число: ");
        int s = in.nextInt();
        int p1 = ( s / 1000 ) % 10 ;
        int p2 = ( s / 100 ) % 10 ;
        int p3 = ( s / 10 ) % 10 ;
        int p4 =  s  % 10 ;
        int g ;
        if ( p1 <= 5){
            System.out.print(p1);
        }
        if ( p2 <= 5){
            System.out.print(p2);
        }
        if ( p3 <= 5){
            System.out.print(p3);
        }
        if ( p4 <= 5){
            System.out.print(p4);
        }
        if ( p1 >= 5){
            System.out.print(p1);
        }
        if ( p2 >= 5){
            System.out.print(p2);
        }
        if ( p3 >= 5){
            System.out.print(p3);
        }
        if ( p4 >= 5){
            System.out.print(p4);
        }
        System.out.println();
        System.out.println("----------  Задание Седьмое  (6 Циклы и арифметика)  ----------");
        int r = 100 ;
        while (r > 0){
            System.out.print(r + " ");
            r = r-4;
        }
        System.out.println();
        System.out.println("----------  Задание Восьмое  (37 Циклы и арифметика)  ----------");

        int v = 0;
        while (true){
            System.out.print("ВВедите  число: ");
            int u = in.nextInt();
            if ( u == 0){
                break;
            }
            if (u % 2 == 0){
                v++;
            }

        }
        System.out.println("Было введено " + v + " четных цисел ");
        System.out.println();
        System.out.println("----------  Задание деввятое  (6 Работа с символами)  ----------");
        int  k = (int)(6 + Math.random() * 14) ;
        int n1,n2,n3 ;
        while (true) {
            n1 = (int)(Math.random() * k) ;
            n2 = (int)(Math.random() * k) ;
            n3 = (int)(Math.random() * k) ;
            if (n1 != n2 && n2 != n3 && n2 + 1 != n3 && n2 - 1 != n3 ) {
                break;
            }
        }
        int l ;
        for (l = 0 ; l < k ; l++){
            if ( l == n1 ){
                System.out.print("_");
            }else if (l == n2 || l == n3){
                System.out.print((int)( + Math.random() * 9));
            }else {
                if (Math.random() > 0.5 ){
                    System.out.print("S");
                }else {
                    System.out.print("D");
                }
            }

        }
        System.out.println("\n----------  Задание Десятое  (3 Работа с символами)  ----------");
        int j = 1 ;

        while ( j != 50) {
            if (Math.random() > 0.5 ){
                System.out.print("S");
            }else {
                System.out.print("D");
            }
            if ( j % 7 == 0){
                System.out.println();
            }
            j ++ ;
        }


    }
}
