package net.apispark.webapi.security.authenticators.defined;

import net.apispark.webapi.security.authenticators.HttpBasicAuthenticator;

public class HTTP_BASICAuthenticator extends HttpBasicAuthenticator {

    public HTTP_BASICAuthenticator(String userId, String password) {
        super(userId, password);
    }

}
