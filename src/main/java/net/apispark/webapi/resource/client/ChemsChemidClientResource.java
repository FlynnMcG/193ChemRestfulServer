package net.apispark.webapi.resource.client;

import net.apispark.webapi.resource.client.QueryParameterHelper;


public class ChemsChemidClientResource {

    private final net.apispark.webapi.security.SecurityRuntimeConfigurator securityRuntimeConfigurator;

    private java.lang.String chemid;

    private final java.lang.String absolutePath;

    /**
     * Constructor.
     * 
     * @param config
     *            Gathers configuration of the resource URI and security. 
     * @param chemid
     *            Attribute "chemid"
     */
    public ChemsChemidClientResource(net.apispark.webapi.Config config, java.lang.String chemid) {
        this.securityRuntimeConfigurator = config.getSecurityConfig().getSecurityRuntimeConfigurator();
        this.chemid = chemid;
        this.absolutePath = config.getBasePath() + "/Chems/{chemid}";
    }

    /**
     * Stores a chem.
     * 
     * @param bean
     *            Parameter "bean"
     * @return {@link net.apispark.webapi.representation.Chem} 
     * @throws org.restlet.resource.ResourceException if the call to the API fails
     */
    public net.apispark.webapi.representation.Chem putChemsChemid(net.apispark.webapi.representation.Chem bean) {
        org.restlet.resource.ClientResource client = new org.restlet.resource.ClientResource(absolutePath);
        client.setAttribute("chemid", this.chemid);
        securityRuntimeConfigurator.configure(client);

        return client.wrap(net.apispark.webapi.resource.ChemsChemidResource.class).putChemsChemid(bean);
    }

}
