package by.class5;

public class CoffeMashine implements Electropripiri {
    private String name;
    private String functions;
    private int price;
    private Boolean isOn;

    CoffeMashine(String name, String functions, int price, Boolean isOn) {
        this.name = name;
        this.functions = functions;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("кофемашина варит кофе");
    }

    @Override
    public void pilesosit() {

    }

    //    void switchOff () {
//        if (isOn) {
//            isOn = false;
//            System.out.println("выключена");
//
//        } else {
//            System.out.println("включена");
//        }
//
//    }
    public void switchOff() {
        if (isOn) {
            isOn = false;
            System.out.println("выключена");
            return;
        }
        System.out.println("включена");
    }
}

