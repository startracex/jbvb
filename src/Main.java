public class Main {
    public static void main(String[] args) {
        Request req = new Request("GET", "cors", true, null, null, null);
        Fetch f = new Fetch("http://localhost:8000/",req);
        f.Then((res) -> {
            System.out.println("then1  "+res);
            return "1";
        });
        f.Then((res) -> {
            System.out.println("then2  "+res);
            return "2";
        });
        f.Catch((res) -> {
            System.out.println("catch  "+res);
            return "3";
        });
        f.Finally((res) -> {
            System.out.println("finally  "+res);
            return "4";
        });
    }
}