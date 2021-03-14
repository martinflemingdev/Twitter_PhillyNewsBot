package Twitter;

import java.time.LocalDate;

public class CLI {
	
	public static void main(String[] args){
		
//		NewsService news = new NewsService();
//		String title = "";
//		title = news.getNews().getArticles()[0].getTitle();
//		
//		String url = "";
//		url = news.getNews().getArticles()[0].getUrl();
		
		int year = LocalDate.now().getYear();
		int month = LocalDate.now().getMonthValue();
		int day = LocalDate.now().getDayOfMonth();
		
		
		System.out.println("&to=" + year + "-" + month + "-" + day + "&from=" + year + "-" + month + "-" + day);
	}
	
}
