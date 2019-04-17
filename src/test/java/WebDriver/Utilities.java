package WebDriver;

import java.io.File;
import java.io.IOException;

public class Utilities {
    public static void cleanFolder(File file) throws IOException { ;
        if (file.isDirectory()) {
            File[] entries = file.listFiles();
            if (entries != null) {
                for (File entry : entries) {
                    cleanFolder(entry);
                }
            }
        }
        if (!file.delete()) {
            throw new IOException("Failed to delete " + file);
        }
    }
}
