import java.io.*;

public class writestream {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            s.append((char) (0x4e00 + (int) (Math.random() * (0x9fa5 - 0x4e00 + 1))));
        }
        System.out.println(s);

// //       亂碼
        try {
            File f = new File("hanz.txt");
            OutputStream out = new FileOutputStream(f);
            for (int i = 0; i < s.length(); i++) {
                out.write(s.charAt(i));
            }

        } catch (IOException e) {
            System.out.println("exception");
        }

 //      不會構成亂碼
 //       FileOutputStream
        try {
            File f = new File("hanz.txt");
            OutputStream out = new FileOutputStream(f);
            byte[] b = s.toString().getBytes();
            out.write(b);
            out.close();
        } catch (IOException e) {
            System.out.println("exception");
        }
 //       FileWriter
        try {
            File f = new File("hanz.txt");
            Writer out = new FileWriter(f);
            out.write(s.toString());
            out.close();
        } catch (IOException e) {
            System.out.println("exception");
        }
    }
}
