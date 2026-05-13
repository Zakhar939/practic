package by.class2;

import java.util.Scanner;

public class Lessen2 {
    public static void main(String[] args) {
       /*
        int a = 7;
        while (a <= 98) {
            System.out.println(a + " ");
            a += 7;
        }
        */
/*
        int a = 1, i = 0, sum = 0;

        while (i < 10) {
            sum = sum + a++;
            i++;
        }
        System.out.println("Сумма:" + sum);
        */
        /*

        for (int a = 100; a>=1; a--) {
            if (a != 1)
                System.out.println(a + ",");
        }
        System.out.println("1");
        */
/*
        for (int j=0; j <= 100; j+=10) {
            System.out.println(j);
        }
*/
        /*
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        */
        /*
        int[] array = {1, 2, 5, 8, 15};
        int min = 100;
        int max = 0;
        for (int j = 0; j < array.length; j++) {


            int a = array[j];
            if (a < min) min = a;
            if (a > max) max = a;
        }
        System.out.println("min=" + min + " " + "max=" + max);

    }
    */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x");
        int x = sc.nextInt();
        int minN = 100;
        int maxN=0;
        int vr;
        if (x % 10 == 0) {
            System.out.println("Число x не соответствует условию задания");
        } else {
            while (x > 0) {
                vr = x % 10;
                if (minN > vr) {
                    minN = vr;
                }
                if (maxN < vr) {
                    maxN = vr;
                }
                x= x/10;
            }
            System.out.println("Минимальное число: "+minN+" "+"Максимальное число: "+maxN);
        }


    }

}