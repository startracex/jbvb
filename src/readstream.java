import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class readstream {
    public static void main(String[] args) {
        int n;
        byte[] a = new byte[100];
        try {
            File f = new File("jbvb.iml");
            InputStream in = new FileInputStream(f);
            while ((n = in.read(a, 0, 100)) != -1) {
                String s = new String(a, 0, n);
                System.out.print(s);
            }

        } catch (IOException e) {
            System.out.println("exception");
        }
    }
}
