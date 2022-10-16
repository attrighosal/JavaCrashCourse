package FileHandling;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {
        File file = new File("MyFile.txt");
        file.delete();
    }
}
