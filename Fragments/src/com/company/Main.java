package com.company;

public class Main {

    public static void main(String[] args) {
        char symb1=1067;
        char symb2 ='Ы';
        System.out.println("symb1 contains "+ symb1);
        System.out.println("symb2 contains "+ symb2);

        char ch = 'U';
        int intCh = (int) ch;
        System.out.println("U corresponds with "+ intCh);

        String s1 = "I have ";
        String s2 = " apples ";
        int num = 3;
        String s = s1 + num + s2;
        System.out.println(s);

        int i = 35;
        String str = Integer.toString(i);
        System.out.println(str);

        char j = 'S';
        String charToString = Character.toString(j);
        System.out.println(charToString);

        int i1 = 2015;
        long l = (long) (i1);
        System.out.println(l);

        byte x=5;
        byte y1=x++;
        byte y2=x--;
        byte y3=++x;
        byte y4=--x;
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);
        System.out.println(y4);


    }
}