package decorator;

public class HttpRequest implements Request {
    @Override
    public void sendRequest() {
        System.out.println("send http request");
    }
}
