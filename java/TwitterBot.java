package com.twitterNewsBot.twitterNewsBot;

import java.time.LocalTime;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class TwitterBot {
 
    public static void main(String[] args) throws TwitterException{
    	
    	String title = "After the first tweet, this will persist as the last title tweeted";
    	String url = "";
    	
		while (true) {
			
			 //everyday at 8AM and 8PM
			
			if ((LocalTime.now().getHour() == 8   ||
			     LocalTime.now().getHour() == 20) &&
			     LocalTime.now().getMinute() == 0 &&
			     LocalTime.now().getSecond() == 0 &&
			     LocalTime.now().getNano() > 900000000 ) {
				try {
					NewsService news = new NewsService();
					NewsObject todaysNews = news.getNews();
					Article[] articles = todaysNews.getArticles();
				
					int i;
					for (i=0; i<articles.length; i++) {
					
					// due to only tweeting sports news, added condititional to 
					// filter out headlines specific to sports teams and last title
					
						if (!articles[i].getTitle().contains(title)	 &&
						    !articles[i].getTitle().contains("Phillies") &&
						    !articles[i].getTitle().contains("Flyers")	 &&
						    !articles[i].getTitle().contains("Sixers")   &&
						    !articles[i].getTitle().contains("76ers")	 &&
						    !articles[i].getTitle().contains("Eagles") ) {
						    break;
						}
					}
				
					title = articles[i].getTitle();
					url = articles[i].getUrl();
					newTweet(title + "\n" + url);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
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
