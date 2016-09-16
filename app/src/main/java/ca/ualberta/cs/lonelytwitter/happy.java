package ca.ualberta.cs.lonelytwitter;

/**
 * Created by mqu on 9/15/16.
 */
public class happy extends mood{

    public happy(String emotion) {
        super(emotion);
        this.setMood("happy");
    }

    @Override
    public String emotional(){
        return "It is a happy emotion";
    }
}
