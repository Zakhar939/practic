package by.class4;

public class Main {
    public static void main(String[] args){
        Administrative spotrBuilding = new Administrative("спортивная", 50, 30, "cnhh", "fff", "ggg", 2020);
        int result =  spotrBuilding.getNumberOfPeople();
        System.out.println(result);
        spotrBuilding.setNumberOfPeople(40);
        System.out.println(spotrBuilding.getNumberOfPeople());

        Fabric fabricBuild = new Fabric(50, "fghj", "hdd", "fhjf", "fgh", 1975);
        Building buildings[] = new Building[2];
        buildings[0] = spotrBuilding;
        buildings[1] = fabricBuild;

        Village village = new Village(buildings);



    }

}
