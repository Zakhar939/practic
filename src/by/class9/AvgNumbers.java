package by.class9;

import java.util.List;

public class AvgNumbers extends Thread {
    double number;
    List<Integer> numbers;

    public AvgNumbers(List<Integer> numbers){
        this.numbers =numbers;
    }

    public void avg(){
        int sum = 0;
        for (Integer i : numbers) {
            String str = Thread.currentThread().getName();
            System.out.println("поток" +str +"стартовал");
            try {
                Thread.sleep(1000);
                sum +=i;
        } catch (InterruptedException e){
                throw new RuntimeException("ERROR");
            }
        }
        System.out.println(sum/numbers.size());
    }
    @Override
    public void run() {
        avg();

    }
}
