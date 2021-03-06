package net.apispark.webapi.representation;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(NON_NULL)
public class ChemList extends java.util.ArrayList<Chem> implements java.io.Serializable {
    /** Default serial version ID. */
    private static final long serialVersionUID = 1L;

}
