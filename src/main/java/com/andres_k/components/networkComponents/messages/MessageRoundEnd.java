package com.andres_k.components.networkComponents.messages;


import com.andres_k.components.networkComponents.MessageModel;

/**
 * Created by andres_k on 27/06/2015.
 */
public class MessageRoundEnd extends MessageModel {
    private String winnerTeam;

    public MessageRoundEnd(){
    }

    public MessageRoundEnd(String pseudo, String id, String winnerTeam){
        this.pseudo = pseudo;
        this.id = id;
        this.winnerTeam = winnerTeam;
    }

    public String getWinnerTeam(){
        return this.winnerTeam;
    }
}
