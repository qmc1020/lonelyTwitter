package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mqu on 9/15/16.
 */
public abstract class tweet {
    private String message;
    private Date date;

    private ArrayList<mood> moodlist;

    public tweet(String message){
        this.message = message;
        this.date = new Date();
        this.moodlist = new ArrayList<mood>();
    }

    public tweet(String Message,Date date){
        this.message = message;
        this.date = date;
        this.moodlist = new ArrayList<mood>();
    }

    public abstract Boolean isImportant();


    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) throws tweetsTooLongException {
        if(message.length()> 140){
            throw new tweetsTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
