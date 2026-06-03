package by.class5;

public class WashingMashine implements Electropripiri, KithenTecnika {
    private String name;
    private String brend;
    private double price;
    private boolean isOn;

    public WashingMashine (String name, String brend, double price, boolean isOn){
        this.name = name;
        this.brend = brend;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("стиральная машина стирает");

    }

    @Override
    public void pilesosit() {

    }

    @Override
    public void got() {

    }
}
