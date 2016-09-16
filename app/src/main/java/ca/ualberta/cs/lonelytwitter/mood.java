package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by mqu on 9/15/16.
 */
public abstract class mood {

    private String emotion;
    private Date date;

    public abstract String emotional();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public mood(String emotion) {
        this.emotion =  emotion;
        this.date = new Date();

    }

    public mood(String emotion, Date date ) {
        this.emotion =  emotion;
        this.date = date;

    }

    public void setMood(String emotion)  {
        this.emotion = emotion;
    }

    public String getMood() {
        return this.emotion;
    }
}
