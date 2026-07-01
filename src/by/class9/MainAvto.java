package by.class9;

import java.util.List;


public class MainAvto {
    public static void main(String[] args) {
        Auto auto1 = new Auto(1100, 210, 2001, 100000, "Audi", 1);
        Auto auto2 = new Auto(1200, 220, 2002, 200000, "Audi", 2);
        Auto auto3 = new Auto(1300, 230, 2003, 300000, "Audi", 3);
        Auto auto4 = new Auto(1400, 240, 2004, 400000, "Audi", 4);
        Auto auto5 = new Auto(1500, 250, 2005, 500000, "Audi", 5);

        List<Auto> autos = List.of(auto1, auto2, auto3, auto4, auto5);

        List<Auto> autosFilter=autos.stream().filter((auto)-> {
            return (auto.getProbeg()>100000 && auto.getProbeg()<400000);
        }).toList();

        System.out.println(autosFilter);
    }
}
