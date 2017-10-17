package net.apispark.webapi.representation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Chem {
    /** Default serial version ID. */
    private static final long serialVersionUID = 1L;

    private java.lang.String id;

    
    public java.lang.String getId() {
        return id;
    }

    public void setId(java.lang.String id) {
        this.id = id;
    }


    private java.lang.String MeltingPoint;

    
    public java.lang.String getMeltingPoint() {
        return MeltingPoint;
    }

    public void setMeltingPoint(java.lang.String MeltingPoint) {
        this.MeltingPoint = MeltingPoint;
    }


    private java.lang.String BoilingPoint;

    
    public java.lang.String getBoilingPoint() {
        return BoilingPoint;
    }

    public void setBoilingPoint(java.lang.String BoilingPoint) {
        this.BoilingPoint = BoilingPoint;
    }


    private java.lang.String active;

    
    public java.lang.String getActive() {
        return active;
    }

    public void setActive(java.lang.String active) {
        this.active = active;
    }


    private java.lang.String rank;

    
    public java.lang.String getRank() {
        return rank;
    }

    public void setRank(java.lang.String rank) {
        this.rank = rank;
    }


    private java.lang.String CASNumber;

    
    public java.lang.String getCASNumber() {
        return CASNumber;
    }

    public void setCASNumber(java.lang.String CASNumber) {
        this.CASNumber = CASNumber;
    }

}
