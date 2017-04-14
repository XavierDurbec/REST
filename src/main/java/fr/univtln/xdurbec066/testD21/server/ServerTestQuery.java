package fr.univtln.xdurbec066.testD21.server;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import fr.univtln.xdurbec066.testD21.utilisateur.Utilisateur;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Takeo on 11/04/2017.
 */
public class ServerTestQuery {

    public static void main(String[] args) {

        ClientConfig cc = new DefaultClientConfig();
        cc.getClasses().add(JacksonJsonProvider.class);
        Client c = Client.create(cc);
        WebResource webResource = c.resource("http://localhost:9999");

        Utilisateur u1 = new Utilisateur("NomTest","prenomTest");
        webResource.path("utilisateur").type(MediaType.APPLICATION_JSON).post(u1);


        Utilisateur u2 = webResource.path("utilisateur/id/13").get(Utilisateur.class);

        System.out.println(u2);

        u2.setNom("ApresChangement");
        webResource.path("utilisateur").type(MediaType.APPLICATION_JSON).put(u2);




    }
}