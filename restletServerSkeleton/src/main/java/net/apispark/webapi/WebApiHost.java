package net.apispark.webapi;

import org.restlet.Component;
import org.restlet.data.Protocol;

public class WebApiHost {

    public static void main(String[] args) throws Exception {

        // Attach application to http://localhost:9001/v1
        Component c = new Component();
        c.getServers().add(Protocol.HTTP, 9001);
        c.getDefaultHost().attach("/v1", new WebApiApplication());
        c.start();
    }
}