@groovy.transform.ToString
class Tweet2{

    String username
    String text
    Integer retweets
    Integer favorites
    Date createdOn
    
    public Tweet2(String user, String tweet){
        username = user
        text = tweet
        retweets = 0
        favorites = 0
        createdOn = new Date()
    }
    
    void addToRetweets(){
        retweets += 1
    }
    
    void addToFavorites(){
        favorites += 1
    }
    
}

//def tweetnew = new Tweet2("maria","hello twitter")
//println tweetnew

//reason why it says duplicate: when script is created it create a class using the name of the file.
//so in this case it would be 2 classes counting the one defined here.
