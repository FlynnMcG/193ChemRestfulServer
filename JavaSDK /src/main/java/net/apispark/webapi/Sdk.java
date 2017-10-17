package net.apispark.webapi;

/**
 * Entry-point for API calls.
 */
public class Sdk {

    private final net.apispark.webapi.Config config = new net.apispark.webapi.Config();

    /**
     * Returns the SDK configuration.
     */
    public net.apispark.webapi.Config getConfig() {
        return config;
    }

    public net.apispark.webapi.resource.client.ChemsClientResource chems() {
        return new net.apispark.webapi.resource.client.ChemsClientResource(config);
    }

    public net.apispark.webapi.resource.client.ChemsChemidClientResource chemsChemid(java.lang.String chemid) {
        return new net.apispark.webapi.resource.client.ChemsChemidClientResource(config, chemid);
    }

}
