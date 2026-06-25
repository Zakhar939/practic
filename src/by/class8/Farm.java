package by.class8;

import java.io.Serial;
import java.io.Serializable;

public class Farm implements Serializable {
    @Serial
    private static final long serialVersionUID=-795463210L;
    String name;
    double price;

    public Farm(String name, double price){
        this.name = name;
        this.price= price;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
