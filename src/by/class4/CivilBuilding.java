package by.class4;

public class CivilBuilding extends Building {
    private String appointment;
    private int floors;

    public CivilBuilding(int floors, String appointment, String street, String wall, int year){
        super(street, wall, year);
        this.appointment = appointment;
        this.floors = floors;
    }
}
