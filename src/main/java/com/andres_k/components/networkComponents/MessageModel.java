package com.andres_k.components.networkComponents;

/**
 * Created by andres_k on 08/07/2015.
 */
public abstract class MessageModel {
    protected String pseudo;
    protected String id;

    public String getPseudo(){
        return this.pseudo;
    }

    public String getId(){
        return this.id;
    }
}
