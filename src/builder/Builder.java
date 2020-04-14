package builder;

public interface Builder {
	void setUrl(String url);

	void setHeader(String header);

	HttpRequest build();
}
