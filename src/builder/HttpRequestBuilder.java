package builder;

public class HttpRequestBuilder implements Builder {
	private HttpRequest httpRequest;

	public HttpRequestBuilder() {
		httpRequest = new HttpRequest();
	}
	@Override
	public void setUrl(String url) {
		httpRequest.setUrl(url);
	}

	@Override
	public void setHeader(String header) {
		httpRequest.setHeader(header);
	}

	@Override
	public HttpRequest build() {
		return httpRequest;
	}
}
