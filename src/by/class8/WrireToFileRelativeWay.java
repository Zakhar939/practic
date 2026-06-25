package by.class8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WrireToFileRelativeWay {
    public static void main(String[] args) throws IOException {
            String text = "Сериализация объектов - это процесс сохранения состояния объектов в " +
                   "виде последовательности байтов, а также процесс восстановления " + "в дальнейшем из этих байтов \"живых\" объектов. Java Serialization API предоставляет" +
                    " разработчикам Java стандартный механизм управления" +
                    " сериализацией объектов. API мал и легок в применении," +
                    " а его классы и методы просты для понимания. ";
            File file = new File("src/Folder/text.txt");
//            FileWriter writer = null;
//            try {
//                writer = new FileWriter(file);
//                writer.write(text);
//            } catch (IOException e){
//                throw new RuntimeException(e);
//            } finally {
//                writer.close();
//            }

            try(FileWriter writer= new FileWriter("src/Folder/text.txt")){
                writer.write(text);
            }catch(IOException e){
                throw  new RuntimeException(e);
            }

    }

}
