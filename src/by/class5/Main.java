package by.class5;

public class Main {
    public static void main(String[] args) {
        CoffeMashine coffeMashine1 = new CoffeMashine("lg", "кофеварка", 123, true);
        CoffeMashine coffeMashine2 = new CoffeMashine("ios", "latte", 432, false);

        Fridge fridge1 = new Fridge("lg", "t22", 145, true);

        WashingMashine washingMashine1 = new WashingMashine("samsung", "ref2f", 123, false);

        Pilesos pilesos1 = new Pilesos("ios", "t555", 1233, false);

        Electropripiri[] electropripiris = {coffeMashine1, coffeMashine2, fridge1, washingMashine1, pilesos1};

        for (Electropripiri el : electropripiris) {
            el.work();
        }


        KithenTecnika[] kithenTecnikas = {fridge1, (KithenTecnika) washingMashine1};

        for (KithenTecnika kT : kithenTecnikas) {
            kT.work();

        }

    }
}

