package by.class9;

import java.util.List;

public class MainNumber {
    public static void main(String[] args) {
//        List<Integer> numbers1 = List.of(1, 6, 9, 4, 7);
//        AvgNumbers number1 = new AvgNumbers(numbers1);
//        number1.setName("number1");
//        List<Integer> numbers2 = List.of(6, 7, 2, 4, 7);
//        AvgNumbers number2 = new AvgNumbers(numbers2);
//        number2.setName("number2");
//        List<Integer> numbers3 = List.of(9, 6, 8, 4, 0);
//        AvgNumbers number3 = new AvgNumbers(numbers3);
//        number3.setName("number3");
//        List<Integer> numbers4 = List.of(7, 6, 5, 4, 2);
//        AvgNumbers number4 = new AvgNumbers(numbers4);
//        number4.setName("number4");
//        List<Integer> numbers5 = List.of(3, 6, 2, 4, 8);
//        AvgNumbers number5 = new AvgNumbers(numbers5);
//        number5.setName("number5");
//
//        number1.start();
//        number2.start();
//        number3.start();
//        number4.start();
//        number5.start();
//
//
//
//
//        List<Integer> numbers1 = List.of(1,2,3,4,5);
//        AvgWithRunnable avg1 = new AvgWithRunnable(numbers1);
//        Thread t1 = new Thread(avg1);
//        List<Integer> numbers2 = List.of(1,2,3,4,5);
//        AvgWithRunnable avg2 = new AvgWithRunnable(numbers2);
//        Thread t2 = new Thread(avg2);
//
//        t1.start();
//        t2.start();

        Multiplication multiplication_1 = (a, b) -> {
            System.out.println("привет умножение");
            return a * b;
        };
        Multiplication multiplication_2 = (a, b) -> {
            System.out.println("деление");
            return a / b;
        };

        System.out.println(mp1(multiplication_1, 10, 12));
        System.out.println(mp1(multiplication_2 , 10, 1));
    }

    public static Integer mp1(Multiplication multiplication, int a, int b) {
         return multiplication.mp(a, b);
    }

}
