package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by mqu on 9/15/16.
 */
public class normalTweet extends tweet implements tweetable{

    public normalTweet(String message){
        super(message);
    }



    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }

    public Date getDate() {
        return null;
    }
}
