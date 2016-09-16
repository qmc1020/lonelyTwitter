package ca.ualberta.cs.lonelytwitter;

/**
 * Created by mqu on 9/15/16.
 */
public class importantTweet extends tweet{
    public importantTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}
