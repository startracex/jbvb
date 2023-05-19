import java.io.RandomAccessFile;

public class raf {
    public static void main(String[] args) {
        RandomAccessFile raf;
        try {
            raf = new RandomAccessFile("raf", "rw");
            raf.seek(0);
            long l = raf.length();
            while (l > 0) {
                l--;
                raf.seek(l);
                System.out.print((char) raf.read());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
