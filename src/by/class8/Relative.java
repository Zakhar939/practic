package by.class8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Relative {


    public void writeForRelativeWay(String text, File file)  {
        FileWriter writer = null;
        try {
            writer = new FileWriter (file);
            writer.write(text);
        }catch(IOException e) {
        }finally {
            try {
                writer.close();
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
