package decorator;

public class DecoratorRequest implements Request {
    private Request request;

    public DecoratorRequest(Request request) {
        this.request = request;
    }

    @Override
    public void sendRequest() {
        request.sendRequest();
        System.out.println("send decorator request");
    }
}
