package com.company;
import java.util.Comparator;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        System.out.println("Задание с созданием методов Put , Get , AllGet :");
        String nums[];
        int i = -1;
        String y ;
        int j ;
        nums = new String [ 1 ];
        nums = Put("1",nums ,i = in(i)) ;
        nums = Put("3",nums ,i = in(i)) ;
        nums = Put("5",nums ,i = in(i)) ;
        nums = Put("6",nums ,i = in(i)) ;
        nums = Put("11",nums ,i = in(i)) ;
        nums = Put("5",nums ,i = in(i)) ;
        nums = Put("6",nums ,i = in(i)) ;
        nums = Put("999",nums ,i = in(i)) ;
        nums = Put("66",nums ,i = in(i)) ;

        y = Get(nums) ; nums = Gets(nums) ;
        System.out.println(y);
        y = Get(nums) ; nums = Gets(nums) ;
        System.out.println(y);
        y = Get(nums) ; nums = Gets(nums) ;
        System.out.println(y);


        nums = AllGets(nums);

        System.out.println("Вывод массива :");


        int R[] = new int [ nums.length   ];

        for ( j = 0; j < nums.length ; j++)
        {

            R[j] = Integer.parseInt (nums[j]) ;
        }
        R = qSort(R,0,R.length - 1);

        for ( j = 0; j < R.length ; j++){
            System.out.println(R[j]);
        }
        System.out.println("Самостоятельное задание :");
        String c[] = new String [ 2 ];
        int max = 0 , min = 40 ;
        double a ;
        String m ;
        for (j = 0; j < 10 ; j++)
        {
            a =  Math.random()*40;
            m = (int)a + "";
            if ( a > max ){
                max = j ;
            }
            if ( a < min ){
                min = j ;
            }
            c = Put(m,c,j) ;
        }
        String s ;
        s = c[max] ;
        c[max] = c[min] ;
        c[min] = s ;
        for (j = 0; j < 10 ; j++){
            System.out.println(c[j]);
        }

    }


    static String[] Put ( String x,String y[] , int i)
    {
        if (y.length  <= i  )
        {
            String  GGG[] = new String [y.length * 2 ];
            for (int j = 0; j < y.length; j++){
                GGG[j] = y[j];
            }
            y = GGG;
        }
        y[i] = x ;
        return  y ;
    }
    static int in (int x )
    {
        x++ ;
        return x ;
    }

    static String Get (String y[] )
    {
        return y[0] ;
    }


    static String[] Gets (String y[] )
    {
        for (int j = 1; j < y.length ; j++)
        {
            y[j - 1] = y[j];
        }
        y[y.length - 1] = null ;
        return y ;
    }
    static String[] AllGets (String y[] )
    {
        int k = 0 ;
        for (int i = 0 ; i < y.length; i++)
        {
            if (y[i] == null )
            {
                k++;
            }
        }
        String  GGG[] = new String [ (y.length - k) ];

        for (int j = 0; j < GGG.length; j++){
            GGG[j] = y[j];
        }
        return GGG;
    }



    public static int[] qSort(int[] A, int low, int high)
    {
        int i = low;
        int j = high;
        int x = A[low + (high - low) / 2];
        do
        {
            while(A[i] < x) i++;
            while(A[j] > x) j--;
            if(i <= j)
            {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++; j--;
            }
        }
        while(i <= j);
        //рекурсивные вызовы функции qSort
        if (low <  j) qSort(A, low,  j);
        if (i < high) qSort(A, i, high);
        return A;
    }





}