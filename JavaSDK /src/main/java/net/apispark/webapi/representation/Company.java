package net.apispark.webapi.representation;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * A representation of a Company.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(NON_NULL)
public class Company implements java.io.Serializable {
    /** Default serial version ID. */
    private static final long serialVersionUID = 1L;

    private java.lang.String id;

    private java.lang.String name;

    private java.util.List<java.lang.String> tags = new java.util.ArrayList<java.lang.String>();

    private net.apispark.webapi.representation.company.Address address;

    /**
     * Returns the value of property "id". 
     * Auto-generated primary key field
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Updates the value of property "id". 
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }

    /**
     * Returns the value of property "name". 
     * 
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Updates the value of property "name". 
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    /**
     * Returns the value of property "tags". 
     * 
     */
    public java.util.List<java.lang.String> getTags() {
        return tags;
    }

    /**
     * Updates the value of property "tags". 
     */
    public void setTags(java.util.List<java.lang.String> tags) {
        this.tags = tags;
    }

    /**
     * Returns the value of property "address". 
     * 
     */
    public net.apispark.webapi.representation.company.Address getAddress() {
        return address;
    }

    /**
     * Updates the value of property "address". 
     */
    public void setAddress(net.apispark.webapi.representation.company.Address address) {
        this.address = address;
    }

}
