package Twitter;

public class NewsObject {

	//instance variables
	
	private String status;
	private int totalResults;
	private Article[] articles;
	
	// getters and setters
	
	public String getStatus() {
		return status;
	}

	public int getTotalResults() {
		return totalResults;
	}

	public Article[] getArticles() {
		return articles;
	}
	
}
