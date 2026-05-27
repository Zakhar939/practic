package by.class4;

public class IndustrianBuilding extends Building {

    private String industry;

    public IndustrianBuilding(String industry, String street, String wall, int year){
        super(street, wall, year);
        this.industry = industry;
    }
}
