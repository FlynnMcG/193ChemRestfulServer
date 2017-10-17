package net.apispark.webapi.representation;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * This general error structure is used throughout this API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(NON_NULL)
public class Error implements java.io.Serializable {
    /** Default serial version ID. */
    private static final long serialVersionUID = 1L;

    private java.lang.Long code;

    private java.lang.String description;

    private java.lang.String reasonPhrase;

    /**
     * Returns the value of property "code". 
     * 
     */
    public java.lang.Long getCode() {
        return code;
    }

    /**
     * Updates the value of property "code". 
     */
    public void setCode(java.lang.Long code) {
        this.code = code;
    }

    /**
     * Returns the value of property "description". 
     * 
     */
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * Updates the value of property "description". 
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * Returns the value of property "reasonPhrase". 
     * 
     */
    public java.lang.String getReasonPhrase() {
        return reasonPhrase;
    }

    /**
     * Updates the value of property "reasonPhrase". 
     */
    public void setReasonPhrase(java.lang.String reasonPhrase) {
        this.reasonPhrase = reasonPhrase;
    }

}
