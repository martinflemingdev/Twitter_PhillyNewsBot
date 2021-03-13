package Twitter;

import org.springframework.web.client.RestTemplate;

public class NewsService {

	// instance variables
	
	public static final String URL = "https://newsapi.org/v2/everything?qInTitle=philadelphia&language=en&apiKey=9f31cc0c6f26434c832af1be40a0756f";
	public RestTemplate restTemplate = new RestTemplate();
	
	// API calling method
	
	public NewsObject getNews() {
		NewsObject results = restTemplate.getForObject(URL, NewsObject.class);
		return results;
	}
	
}
