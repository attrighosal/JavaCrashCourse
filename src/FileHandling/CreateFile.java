package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {

        File file = new File("MyFile.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
