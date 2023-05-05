import java.io.File;

public class listAllFiles {
    public static void main(String[] arg) {

        File file = new File("./");
        listAll(file);
    }

    static void listAll(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                listAll(f);
            } else {
                System.out.println(f);
            }
        }
    }
}

