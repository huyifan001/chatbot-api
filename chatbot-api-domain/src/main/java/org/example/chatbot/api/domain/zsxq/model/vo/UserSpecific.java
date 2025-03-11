package org.example.chatbot.api.domain.zsxq.model.vo;

/**
 * <h3>chatbot-api</h3>
 * <p>UserSpecific</p>
 *
 * @author : hyf
 * @date : 2025-03-11 14:10
 **/
public class UserSpecific {

    private boolean liked;

    private boolean subscribed;

    public void setLiked(boolean liked){
        this.liked = liked;
    }
    public boolean getLiked(){
        return this.liked;
    }
    public void setSubscribed(boolean subscribed){
        this.subscribed = subscribed;
    }
    public boolean getSubscribed(){
        return this.subscribed;
    }

}
