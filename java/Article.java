package Twitter;

import java.util.Map;

public class Article {

	// instance variables
	
	private Map<String, String> source;
	private String author;
	private String title;
	private String description;
	private String url;
	private String urlToImage;
	private String publishedAt;
	private String content;
	
	// getters
	
	public Map<String, String> getSource() {
		return source;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getUrl() {
		return url;
	}

	public String getUrlToImage() {
		return urlToImage;
	}

	public String getPublishedAt() {
		return publishedAt;
	}

	public String getContent() {
		return content;
	}

	
}
