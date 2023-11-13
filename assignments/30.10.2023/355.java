import java.util.*;
class Twitter {
    class Tweet{
    int user;
    int tweetId;
    public Tweet(int _user,int _tweetId)
    {
        this.user=_user;
        this.tweetId=_tweetId;
    }
    }
    HashMap<Integer,Set<Integer>> followings;
    List<Tweet> tweets;
    public Twitter() 
    {
        this.followings=new HashMap<>();
        this.tweets=new ArrayList<>();
    }
    
    public void postTweet(int userId, int tweetId) 
    {
            
    }
    
    public List<Integer> getNewsFeed(int userId) {
        
    }
    
    public void follow(int followerId, int followeeId) {
        
    }
    
    public void unfollow(int followerId, int followeeId) {
        
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */