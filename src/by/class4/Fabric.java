package by.class4;

public class Fabric extends IndustrianBuilding{
    private int numOfEmployee;
    private String product;
    public Fabric (int numOfEmployee, String product, String industry, String street, String wall, int year){
        super(industry, street, wall, year);
        this.numOfEmployee = numOfEmployee;
        this.product = product;
    }
}
