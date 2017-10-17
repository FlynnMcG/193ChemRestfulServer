package net.apispark.webapi.representation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Company {
    /** Default serial version ID. */
    private static final long serialVersionUID = 1L;

    private java.lang.String id;

    
    public java.lang.String getId() {
        return id;
    }

    public void setId(java.lang.String id) {
        this.id = id;
    }


    private java.lang.String name;

    
    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }


    private java.util.List<java.lang.String> tags;

    
    
    public java.util.List<java.lang.String> getTags() {
        if (tags == null) {
            tags = new ArrayList<java.lang.String>();
        }
        return tags;
    }

    public void setTags(java.util.List<java.lang.String> tags) {
        this.tags = tags;
    }


    private java.lang.String address;

    
    public java.lang.String getAddress() {
        return address;
    }

    public void setAddress(java.lang.String address) {
        this.address = address;
    }

}
