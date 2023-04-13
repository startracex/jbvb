public class Main {
    public static void main(String[] args) {
        Request req = new Request("POST", "cors", true, null, null, null);
        Fetch f = new Fetch("http://localhost:8000/",req);
        f.Then((res) -> {
            System.out.println("then1"+res);
            return true;
        });
        f.Catch((res) -> {
            System.out.println("then2"+res);
            return true;
        });
        f.Finally((res) -> {
            System.out.println("finally"+res);
            return true;
        });
    }
}