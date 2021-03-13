package Twitter;

public class CLI {
	
	public static void main(String[] args){
		
		NewsService news = new NewsService();
		String title = "";
		title = news.getNews().getArticles()[0].getTitle();
		
		String url = "";
		url = news.getNews().getArticles()[0].getUrl();
		
		System.out.println(title);
		System.out.println(url);
	}
	
}
