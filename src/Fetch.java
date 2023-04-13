import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.function.Function;

/**
 * Fetch is a class to send request and get response.
 * Just like fetch API in JavaScript.
 */
public class Fetch<T> {

    /**
     * @param Body     Can be modified by Then ,Catch and Finally
     */
    public T Body;
    /**
     * @param Response The response,same as Body for the first response
     */
    public T Response;
    /**
     * @param Fulfilled Run next Then when Fulfilled is ture,Run next Catch when Fulfilled is false,No valid for Finally
     */
    public boolean Fulfilled = true;

    /**
     * @param url The url to send the request to
     *            <p>
     *            Run fetch with default request
     */
    Fetch(String url) {
        try {
            Request res = new Request("GET", "cors", true, null, null, null);
            this.Response = (T) sentRequest(url, res);
            this.Body = this.Response;
        } catch (IOException e) {
            this.Fulfilled = false;
        }
    }

    /**
     * @param url The url to send the request to
     * @param res The request object
     *            <p>
     *            Run fetch with request res
     */
    Fetch(String url, Request res) {
        try {
            this.Response = (T) sentRequest(url, res);
            this.Body = this.Response;
        } catch (IOException e) {
            this.Fulfilled = false;
        }
    }

    /**
     * @param callback The callback function to be called
     *                 <p>
     *                 Then only run if the fulfilled is true
     */
    public <R> Fetch Then(Function<T, R> callback) {
        if (!Fulfilled) {
            return this;
        }
        try {
            this.Body = (T) callback.apply(this.Body);
        } catch (Exception e) {
            Fulfilled = false;
        }
        return this;
    }

    /**
     * @param callback The callback function to be called
     *                 <p>
     *                 Catch only run if the fulfilled is false
     */
    public <R> Fetch Catch(Function<T, R> callback) {
        if (Fulfilled) {
            return this;
        }
        try {
            this.Body = (T) callback.apply(this.Body);
        } catch (Exception e) {
            Fulfilled = false;
        }
        return this;
    }

    /**
     * @param callback The callback function to be called
     *                 <p>
     *                 Finally ignore if the fulfilled is false
     */
    public final <R> T Finally(Function<T, R> callback) {
        return (T) callback.apply(this.Body);
    }

    /**
     * @param url The url to send the request to
     * @param res The request object
     *            <p>
     *            sent request to the url with the request object
     */
    protected String sentRequest(String url, Request res) throws IOException {
        String sCurrentLine;
        StringBuilder sTotalString = new StringBuilder();
        URL u = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) u.openConnection();
        connection.setRequestMethod(res.method);
        connection.setUseCaches(res.cache);
        if (res.mode != null) {
            switch (res.mode) {
                case "cors":
                    connection.setRequestProperty("Access-Control-Allow-Origin", "*");
                    break;
                case "no-cors":
                    connection.setRequestProperty("Access-Control-Allow-Origin", "null");
                    break;
                case "same-origin":
                    connection.setRequestProperty("Access-Control-Allow-Origin", "same-origin");
                    break;
            }
        }

        if (res.headers != null) {
            res.headers.forEach((k, v) -> {
                connection.setRequestProperty(k.toString(), v.toString());
            });
        }
        if (res.redirect != null) {
            switch (res.redirect) {
                case "follow":
                    connection.setInstanceFollowRedirects(true);
                    break;
                case "error", "manual":
                    connection.setInstanceFollowRedirects(false);
                    break;
            }
        }

        connection.connect();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        while ((sCurrentLine = reader.readLine()) != null) {
            sTotalString.append(sCurrentLine);
        }
        reader.close();
        connection.disconnect();
        return sTotalString.toString();
    }
}