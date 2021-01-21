package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int i = scanner.nextInt();
        if (i >= 100) {
            System.out.println("not less");
        }
        else {
         System.out.println("less");
        }


         */


        /*

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое оценку: ");
        int i = scanner.nextInt();
        if (i == 5 ) {
            System.out.println("отлично");
        }else if (i == 4){
            System.out.println("хорошо");
        }else if (i == 3){
            System.out.println("удовлетворительно");
        }else if (i == 2){
            System.out.println("неудовлетворительно");
        }else {
            System.out.println("Ведено не соответствующее число ! ");
        }



         */

/*

        System.out.print("Введите День Недели : ");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();

        if (title.equals("воскресенье") )
        {
            System.out.println("0");
        }
        else if (title.equals("понедельник"))
        {
            System.out.println("1");
        }
        else if (title.equals("вторник"))
        {
            System.out.println("2");
        }
        else if (title.equals("среда"))
        {
            System.out.println("3");
        }
        else if (title.equals("четверг"))
        {
            System.out.println("4");
        }
        else if (title.equals("пятница"))
        {
            System.out.println("5");
        }
        else if (title.equals("суббота"))
        {
            System.out.println("6");
        }
        else {
            System.out.println("Такого дня недели нет ");
        }



 */

/*

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваши баллы: ");
        int i = scanner.nextInt();
        if ( i > 91) {
            System.out.print("Ваща оценка = A " );
        }else if ( i >= 81){
            System.out.print("Ваща оценка = B" );
        }else if ( i <= 80){
            System.out.print("Ваща оценка = F" );
        }else {
            System.out.println("Такой оценки нет");
        }



 */





        System.out.println("                 Задание 5.1         ");
        Double y ,  a = 7.2 , b = 5.7 , x1 = 2.92 , x2 = -3.57 ;
        Double x = x1 ;

        if (x <= 1)
        {
            y = 1 / ( Math.pow(a , 2) + Math.pow(x , 2) ) ;
        }
        else {
            y = b * Math.log(Math.abs(x));
        }

        System.out.println("Значение при x = 2.92 : "+ y);
        x = x2 ;
        if (x <= 1)
        {
            y = 1 / ( Math.pow(a , 2) + Math.pow(x , 2) ) ;
        }
        else {
            y = b * Math.log(Math.abs(x));
        }
        System.out.println("Значение при x = -3.57 : "+ y);


        System.out.println("                 Задание 5.2         ");
        a = 2.72 ; b = 1.68 ; x1 = -0.37 ; x2 = 1.9 ;
        Double x3 = 4.58 ;
        x = x1 ;
        if  ( x <= 1) {
            y = Math.sin(b*b*x) ;
        }
        else if ( x > 3 ){
            y = 1 / (Math.pow(x , 2 ) + Math.pow(a , 2 )) ;
        }
        else {
            y = Math.pow( ( 4 * x  + b ),2) ;
        }
        System.out.println("Значение при x = -0.37 : "+ y);
        x = x2 ;
        if  ( x <= 1) {
            y = Math.sin(b*b*x) ;
        }
        else if ( x > 3 ){
            y = 1 / (Math.pow(x , 2 ) + Math.pow(a , 2 )) ;
        }
        else {
            y = Math.pow( ( 4 * x  + b ),2) ;
        }
        System.out.println("Значение при x = 1.9 : "+ y);
        x = x3 ;
        if  ( x <= 1) {
            y = Math.sin(b*b*x) ;
        }
        else if ( x > 3 ){
            y = 1 / (Math.pow(x , 2 ) + Math.pow(a , 2 )) ;
        }
        else {
            y = Math.pow( ( 4 * x  + b ),2) ;
        }
        System.out.println("Значение при x = 4.58 : "+ y);



    }
}
