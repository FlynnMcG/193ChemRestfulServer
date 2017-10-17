package net.apispark.webapi.resource;

import org.restlet.resource.Put;
import org.restlet.resource.Options;
import org.restlet.representation.Representation;
public interface ChemsChemidResource {

    @Put
    net.apispark.webapi.representation.Chem store(net.apispark.webapi.representation.Chem bean) throws Exception;

}

