package by.class8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

public class ReadFile {
    public void readFiletxt(File fileName) {
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
          //String line = br.readLine();
            List<String> line = br.readAllLines();
            String bigLine = " " ;
            for (String line1 : line){
                bigLine += line1;
            }
          System.out.print(line);
        } catch(Exception e) {
            System.out.println(e);
        }



    }
}
