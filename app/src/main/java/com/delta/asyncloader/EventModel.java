package com.delta.asyncloader;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by GrabVN_1791 on 22.10.2017.
 */

public class EventModel {
    @SerializedName("datepost")
    @Expose
    private String datepost;

    public String getDatepost() {
        return datepost;
    }

    public void setDatepost(String datepost) {
        this.datepost = datepost;
    }
}
