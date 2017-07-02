package com.fortressgain.basicapp_igt.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Datum implements Serializable {

    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("jackpot")
    @Expose
    public Integer jackpot;
    @SerializedName("date")
    @Expose
    public String date;

}