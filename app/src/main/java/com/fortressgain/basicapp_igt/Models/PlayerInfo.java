package com.fortressgain.basicapp_igt.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class PlayerInfo implements Serializable {

    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("balance")
    @Expose
    public Integer balance;
    @SerializedName("avatarLink")
    @Expose
    public String avatarLink;
    @SerializedName("lastLogindate")
    @Expose
    public String lastLogindate;

}