package com.gamatechno.chato.sdk.app.chatroom.model;

import java.io.Serializable;

public class MentionModel implements Serializable {
    String id;
    String name;
    String pictureUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
