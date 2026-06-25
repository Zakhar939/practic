package by.class8;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainFarm  {
    public static void main(String[] args) {

        Farm farm1 = new Farm("Cow", 10);
        Farm farm2 = new Farm("dfhj", 11);
        List<Farm> farm = new ArrayList<>();

        farm.add(farm1);
        farm.add(farm2);

        serialize(farm, "src/Folder/text.txt");
        List<Farm> farms = deserialize("src/Folder/texts.txt");
        System.out.println(farms);


    }
    static String serialize(List<Farm> farm, String file) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(farm);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return file;
    }

    static List<Farm> deserialize(String file) {
         List<Farm> farm = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            farm = (List <Farm>)objectInputStream.readObject();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return farm;
    }
}
