package net.apispark.webapi.representation.company;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(NON_NULL)
public class Address implements java.io.Serializable {
    /** Default serial version ID. */
    private static final long serialVersionUID = 1L;

    private java.lang.String street;

    private java.lang.String city;

    private java.lang.String zipcode;

    /**
     * Returns the value of property "street". 
     * 
     */
    public java.lang.String getStreet() {
        return street;
    }

    /**
     * Updates the value of property "street". 
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }

    /**
     * Returns the value of property "city". 
     * 
     */
    public java.lang.String getCity() {
        return city;
    }

    /**
     * Updates the value of property "city". 
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }

    /**
     * Returns the value of property "zipcode". 
     * 
     */
    public java.lang.String getZipcode() {
        return zipcode;
    }

    /**
     * Updates the value of property "zipcode". 
     */
    public void setZipcode(java.lang.String zipcode) {
        this.zipcode = zipcode;
    }

}
