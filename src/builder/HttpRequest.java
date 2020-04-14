package builder;

public class HttpRequest {
	private String header;

	private String url;

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "HttpRequest{" +
			"header='" + header + '\'' +
			", url='" + url + '\'' +
			'}';
	}
}
