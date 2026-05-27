package by.class4;

public class Administrative extends CivilBuilding {

    private String purpose;
    private int numberOfPeople;

    public Administrative(String purpose, int numberOfPeople,  int fl, String appointment, String street, String wall, int year){
        super(fl, appointment, street, wall, year);
        this.purpose = purpose;
        this.numberOfPeople = numberOfPeople;


    }
    public int getNumberOfPeople(){
        return numberOfPeople;

    }
    public int setNumberOfPeople(int newPeaple){
        numberOfPeople =  newPeaple;
        return numberOfPeople;

    }
}
