package com.tencty.android.fake_tinder.Matches;

public class MatchesObject {
    private String userId;
    public MatchesObject (String userId){
        this.userId = userId;
    }

    public String getUserId(){
        return userId;
    }
    public void setUserID(String userID){
        this.userId = userId;
    }
}
