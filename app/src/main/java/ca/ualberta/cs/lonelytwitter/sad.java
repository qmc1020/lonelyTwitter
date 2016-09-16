package ca.ualberta.cs.lonelytwitter;

/**
 * Created by mqu on 9/15/16.
 */
public class sad extends mood {

    public sad(String emotion) {
        super(emotion);
        this.setMood("sad");
    }

    @Override
    public String emotional(){
        return "It is a sad emotion";
    }
}
