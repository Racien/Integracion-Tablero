/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:FactorialResource [/ficha]<br>
 * USAGE:
 * <pre>
 *        Integrar client = new Integrar();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author May
 */
public class Integrar {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/SimpleRESTweb/webresources";

    public Integrar() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("ficha");
    }

    public String ficha(String movimiento) throws ClientErrorException {
        if (movimiento != null) {        WebTarget resource = webTarget;

            resource = resource.queryParam("movimiento", movimiento);
        }
        return resource.get(String.class);
    }

    public void close() {
        client.close();
    }
    
    
    
}
