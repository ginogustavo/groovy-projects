@groovy.transform.ToString()
class Tweet{
String user
String text
Date datePosted
def comments = []
int likes
int retweets
}

//Tweet t = new Tweet()