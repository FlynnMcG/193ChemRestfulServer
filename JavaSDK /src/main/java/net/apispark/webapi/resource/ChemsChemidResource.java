package net.apispark.webapi.resource;

public interface ChemsChemidResource {

    /**
     * Stores a chem.
     *
     * @return  {@link net.apispark.webapi.representation.Chem} 
     * @throws org.restlet.resource.ResourceException if the call to the API fails
     */
    @org.restlet.resource.Put
    net.apispark.webapi.representation.Chem putChemsChemid(net.apispark.webapi.representation.Chem bean);

}