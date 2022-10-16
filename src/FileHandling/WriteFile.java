package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("MyFile.txt");
            writer.write("Hello World!!\nWelcome to Java!!");
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
