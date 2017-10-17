package net.apispark.webapi.resource;

import org.restlet.resource.Get;
import org.restlet.resource.Post;
import java.util.UUID;
import org.restlet.resource.Delete;
import org.restlet.resource.Options;
import org.restlet.representation.Representation;
public interface ChemsResource {

    @Get
    net.apispark.webapi.representation.Chem represent() throws Exception;

    @Post
    net.apispark.webapi.representation.Chem add(net.apispark.webapi.representation.Chem bean) throws Exception;

    @Delete
    void remove() throws Exception;

}

