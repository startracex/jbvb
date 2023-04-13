import java.util.Map;

public class Request {
    String method;
    String mode;
    boolean cache;
    Map<String, String> headers;
    String redirect;
    String body;

    Request(String method, String mode, boolean cache, Map<String, String> headers, String redirect, String body) {
        this.method = method;
        this.mode = mode;
        this.cache = cache;
        this.headers = headers;
        this.redirect = redirect;
        this.body = body;
    }
}
