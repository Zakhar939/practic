package by.class8;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        String text = "Hello";
        Relative relative = new Relative();
        ReadFile read = new ReadFile();
//        File file = new File("src/Folder/text.txt");
        File fileabc = new File("user/username");
        relative.writeForRelativeWay(text, new File("C:\\install\\text.txt"));
//        relative.writeForRelativeWay(text, file);
        //relative.writeForRelativeWay(text, fileabc);
        read.readFiletxt(fileabc);


    }
}
