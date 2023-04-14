public class Main {
    public static void main(String[] args) {

        try {
            int a = div(10, 0);
            System.out.println(a);
        } catch (Exp e) {
            System.out.println(e.getMsg());
        }

        try {
            int a = div(10, 2);
            System.out.println(a);
        } catch (Exp e) {
            System.out.println(e.getMsg());
        }

    }
    static int div(int a, int b) throws Exp {
        if (b == 0) {
            throw new Exp();
        }
        return a / b;
    }
}