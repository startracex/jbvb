
import java.util.InputMismatchException;
import java.util.Scanner;

public class parseNumber {
    public static void main(String[] args) {

        String str = "数学87分，物理76分，英语96分";
        Scanner sc = new Scanner(str);
        sc.useDelimiter("[^0-9]+");
        int sum = 0;
        double index = 0;
        while (sc.hasNext()) {
            try {
                sum += sc.nextInt();
                index++;
            } catch (InputMismatchException ignored) {
            }
        }
        System.out.println(sum);
        System.out.println(sum / index);

    }
}
