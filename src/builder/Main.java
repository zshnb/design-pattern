package builder;

public class Main {

	public static void main(String[] args) {
		HttpRequestBuilder builder = new HttpRequestBuilder();
		builder.setUrl("url");
		builder.setHeader("header");
		HttpRequest request = builder.build();
		System.out.println(request.toString());
	}

}
