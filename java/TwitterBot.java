package Twitter;

import java.time.LocalTime;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class TwitterBot {
 
    public static void main(String[] args){

		while (true) {
			
			// everyday at 8AM and 8PM
			
			if ((LocalTime.now().getHour() == 8  ||
				LocalTime.now().getHour() == 20) &&
				LocalTime.now().getMinute() == 0 &&
				LocalTime.now().getSecond() == 0 &&
				LocalTime.now().getNano() > 990000000 )
			{
				NewsService news = new NewsService();
				NewsObject todaysNews = news.getNews();
				
				String title = "";
				title = todaysNews.getArticles()[0].getTitle();
				
				String url = "";
				url = todaysNews.getArticles()[0].getUrl();
				
				newTweet(title + "\n" + url);
			}
		}
    }
    
    public static void newTweet(String tweet) {
        Twitter twitter = TwitterFactory.getSingleton();
        try {
            Status status = twitter.updateStatus(tweet);
        } catch (TwitterException e) {
            e.printStackTrace();
        }
    }
    
}