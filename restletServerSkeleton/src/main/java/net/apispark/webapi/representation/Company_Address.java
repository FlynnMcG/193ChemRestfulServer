package net.apispark.webapi.representation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Company_Address {
    /** Default serial version ID. */
    private static final long serialVersionUID = 1L;

    private java.lang.String street;

    
    public java.lang.String getStreet() {
        return street;
    }

    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    private java.lang.String city;

    
    public java.lang.String getCity() {
        return city;
    }

    public void setCity(java.lang.String city) {
        this.city = city;
    }


    private java.lang.String zipcode;

    
    public java.lang.String getZipcode() {
        return zipcode;
    }

    public void setZipcode(java.lang.String zipcode) {
        this.zipcode = zipcode;
    }

}
