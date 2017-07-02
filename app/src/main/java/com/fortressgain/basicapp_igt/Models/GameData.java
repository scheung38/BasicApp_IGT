package com.fortressgain.basicapp_igt.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


public class GameData implements Serializable {

    @SerializedName("response")
    @Expose
    public String response;
    @SerializedName("currency")
    @Expose
    public String currency;
    @SerializedName("data")
    @Expose
    public List<String> data = null;

//    public static GameData set(String response) {
//    }
}