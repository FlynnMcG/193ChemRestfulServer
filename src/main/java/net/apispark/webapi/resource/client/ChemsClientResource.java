package net.apispark.webapi.resource.client;

import net.apispark.webapi.resource.client.QueryParameterHelper;


public class ChemsClientResource {

    private final net.apispark.webapi.security.SecurityRuntimeConfigurator securityRuntimeConfigurator;

    private final java.lang.String absolutePath;

    /**
     * Constructor.
     * 
     * @param config
     *            Gathers configuration of the resource URI and security. 
     */
    public ChemsClientResource(net.apispark.webapi.Config config) {
        this.securityRuntimeConfigurator = config.getSecurityConfig().getSecurityRuntimeConfigurator();
        this.absolutePath = config.getBasePath() + "/Chems/";
    }

    /**
     * Loads a list of Chesm.
     * 
     * @param size
     *            Size of the page to retrieve.
     * @param page
     *            Number of the page to retrieve.
     * @param sort
     *            Order in which to retrieve the results. Multiple sort criteria can be passed.
     * @param boilingPoint
     *            Allows to filter the collections of result by the value of field firstName
     * @param meltingPoint
     *            Allows to filter the collections of result by the value of field lastName
     * @param active
     *            Allows to filter the collections of result by the value of field active
     * @param cASNumber
     *            Allows to filter the collections of result by the value of field company
     * @return {@link net.apispark.webapi.representation.ChemList} 
     * @throws org.restlet.resource.ResourceException if the call to the API fails
     */
    public net.apispark.webapi.representation.ChemList getChems(java.lang.Long size, java.lang.Long page, java.lang.String sort, java.lang.Double boilingPoint, java.lang.Double meltingPoint, java.lang.Boolean active, java.lang.String cASNumber) {
        org.restlet.resource.ClientResource client = new org.restlet.resource.ClientResource(absolutePath);
        QueryParameterHelper.addQueryParameter(client, "$size", size);
        QueryParameterHelper.addQueryParameter(client, "$page", page);
        QueryParameterHelper.addQueryParameter(client, "$sort", sort);
        QueryParameterHelper.addQueryParameter(client, "Boiling Point", boilingPoint);
        QueryParameterHelper.addQueryParameter(client, "Melting Point", meltingPoint);
        QueryParameterHelper.addQueryParameter(client, "active", active);
        QueryParameterHelper.addQueryParameter(client, "CAS Number", cASNumber);
        securityRuntimeConfigurator.configure(client);

        return client.wrap(net.apispark.webapi.resource.ChemsResource.class).getChems();
    }

    /**
     * Adds a Chem
.
     * 
     * @param bean
     *            Parameter "bean"
     * @return {@link net.apispark.webapi.representation.Chem} 
     * @throws org.restlet.resource.ResourceException if the call to the API fails
     */
    public net.apispark.webapi.representation.Chem postChems(net.apispark.webapi.representation.Chem bean) {
        org.restlet.resource.ClientResource client = new org.restlet.resource.ClientResource(absolutePath);
        securityRuntimeConfigurator.configure(client);

        return client.wrap(net.apispark.webapi.resource.ChemsResource.class).postChems(bean);
    }

    /**
     * 
     * 
     * @throws org.restlet.resource.ResourceException if the call to the API fails
     */
    public void deleteChems() {
        org.restlet.resource.ClientResource client = new org.restlet.resource.ClientResource(absolutePath);
        securityRuntimeConfigurator.configure(client);

        client.wrap(net.apispark.webapi.resource.ChemsResource.class).deleteChems();
    }

}
