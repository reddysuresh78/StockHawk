package com.sam_chordas.android.stockhawk.model;


import java.io.Serializable;

public class Query implements Serializable {
    public String count;
//    @SerializedName("created")
    public String created;
//    @SerializedName("lang")
    public String lang;
//    @SerializedName("diagnostics")
    public Diagnostics diagnostics;
//    @SerializedName("results")
    public Results results;
}
