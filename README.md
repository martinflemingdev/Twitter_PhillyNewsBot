# PhillyNewsBot

https://twitter.com/phillynewsbot

* Created @PhillyNewsBot by writting a Java program that tweets Philadelphia area news twice a day.
* Currently runs off a Raspberry Pi4 autonomously.
* Wrote logic to tweet at 8AM and 8PM and autofill API query parameters with current date.

## Technology used:

* Utilizes the free News API at newsapi.org to populate its tweet. (NewsService.java)
* Uses LocalDate class to insert current date into the GET request sent to the News API. (NewsService.java)
* Created classes that model the JSON data returned to implement serialization. (NewsObject.java and Article.java)
* Uses the twitter4j (twitter 4 java) framework to interact with the Twitter API. (TwitterBot.java)
* Scheduling handled by LocalTime class conditional logic. (TwitterBot.java)
