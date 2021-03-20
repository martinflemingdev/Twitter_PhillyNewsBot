package Twitter;

import java.time.LocalDate;

import org.springframework.web.client.RestTemplate;

public class NewsService {

	// instance variables
	
	private static final String API_URL = "https://newsapi.org/v2/everything?q=philadelphia&language=en&apiKey=******************************";
	private RestTemplate restTemplate = new RestTemplate();
	
	// API calling method
	
	public NewsObject getNews() {
		
		LocalDate currentDate = LocalDate.now();
		
		NewsObject results = restTemplate.getForObject(API_URL + "&to=" + currentDate + "&from=" + currentDate, NewsObject.class);
		return results;
	}
	
}
