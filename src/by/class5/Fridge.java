package by.class5;

public class Fridge implements Electropripiri, KithenTecnika {
    private String name;
    private String marka;
    private double price;
    private Boolean isOn;

    public Fridge(String name, String marka, double price, Boolean isOn){
        this.name = name;
        this.marka = marka;
        this.price = price;
        this.isOn = isOn;

    }

    @Override
    public void work(){
        System.out.println("холодильник морозит");
    }

    @Override
    public void pilesosit() {

    }

    @Override
    public void got(){
        System.out.println("стирает");

    }

}
