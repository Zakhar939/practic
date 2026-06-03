package by.class5;

public class Pilesos implements Electropripiri {
    private String name;
    private String brend;
    private double price;
    private boolean isOn;

    public Pilesos (String name, String brend, double price, boolean isOn) {
        this.name = name;
        this.brend = brend;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work(){
        System.out.println("пылесос убирает");
    }

    @Override
    public void pilesosit(){
        System.out.println("dfghj");
    }


}
