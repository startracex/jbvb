import java.io.*;

public class e6 {
    public static void main(String[] args) {
        File source = new File("jbvb.iml");
        File target = new File("jbvb");
        char[] c = new char[19];
        int n;
        try {
            Writer out = new FileWriter(target);
            Reader in = new FileReader(source);
            while ((n = in.read(c)) != -1) {
                out.write(c, 0, n);
            }
            out.flush();
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
