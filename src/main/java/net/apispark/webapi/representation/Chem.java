package net.apispark.webapi.representation;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * A representation of a Chem.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(NON_NULL)
public class Chem implements java.io.Serializable {
    /** Default serial version ID. */
    private static final long serialVersionUID = 1L;

    private java.lang.String id;

    private java.lang.Double MeltingPoint;

    private java.lang.Double BoilingPoint;

    private java.lang.Boolean active;

    private java.lang.Integer rank;

    private java.lang.Double CASNumber;

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
     * Returns the value of property "MeltingPoint". 
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty("Melting Point")
    public java.lang.Double getMeltingPoint() {
        return MeltingPoint;
    }

    /**
     * Updates the value of property "MeltingPoint". 
     */
    public void setMeltingPoint(java.lang.Double MeltingPoint) {
        this.MeltingPoint = MeltingPoint;
    }

    /**
     * Returns the value of property "BoilingPoint". 
     * 
     */
    @com.fasterxml.jackson.annotation.JsonProperty("Boiling Point")
    public java.lang.Double getBoilingPoint() {
        return BoilingPoint;
    }

    /**
     * Updates the value of property "BoilingPoint". 
     */
    public void setBoilingPoint(java.lang.Double BoilingPoint) {
        this.BoilingPoint = BoilingPoint;
    }

    /**
     * Returns the value of property "active". 
     * 
     */
    public java.lang.Boolean getActive() {
        return active;
    }

    /**
     * Updates the value of property "active". 
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }

    /**
     * Returns the value of property "rank". 
     * 
     */
    public java.lang.Integer getRank() {
        return rank;
    }

    /**
     * Updates the value of property "rank". 
     */
    public void setRank(java.lang.Integer rank) {
        this.rank = rank;
    }

    /**
     * Returns the value of property "CASNumber". 
     * This property is a reference to a Company
     */
    @com.fasterxml.jackson.annotation.JsonProperty("CAS Number")
    public java.lang.Double getCASNumber() {
        return CASNumber;
    }

    /**
     * Updates the value of property "CASNumber". 
     */
    public void setCASNumber(java.lang.Double CASNumber) {
        this.CASNumber = CASNumber;
    }

}
