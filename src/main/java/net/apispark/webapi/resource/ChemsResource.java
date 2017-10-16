package net.apispark.webapi.resource;

public interface ChemsResource {

    /**
     * Loads a list of Chesm.
     *
     * @return  {@link net.apispark.webapi.representation.ChemList} 
     * @throws org.restlet.resource.ResourceException if the call to the API fails
     */
    @org.restlet.resource.Get
    net.apispark.webapi.representation.ChemList getChems();

    /**
     * Adds a Chem
.
     *
     * @return  {@link net.apispark.webapi.representation.Chem} 
     * @throws org.restlet.resource.ResourceException if the call to the API fails
     */
    @org.restlet.resource.Post
    net.apispark.webapi.representation.Chem postChems(net.apispark.webapi.representation.Chem bean);

    /**
     * 
     *
     * @throws org.restlet.resource.ResourceException if the call to the API fails
     */
    @org.restlet.resource.Delete
    void deleteChems();

}