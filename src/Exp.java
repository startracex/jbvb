public class Exp extends Exception {
    String msg;

    public Exp() {
        this.msg = "除数不能为0";
    }

    public String getMsg() {
        return msg;
    }
}
