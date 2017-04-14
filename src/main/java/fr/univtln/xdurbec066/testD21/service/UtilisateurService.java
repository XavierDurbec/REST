package fr.univtln.xdurbec066.testD21.service;

import fr.univtln.xdurbec066.testD21.utilisateur.Utilisateur;

import javax.ws.rs.*;

/**
 * Created by Takeo on 11/04/2017.
 */

@Path("/utilisateur")
public class UtilisateurService {


    @GET
    @Produces("application/json")
    public String utilisateurALl(){return Utilisateur.findOne().toString();}

    @GET
    @Produces("application/json")
    @Path("/id/{id}")
    public static String userById(@PathParam("id") int id) {
        return Utilisateur.findById(id).toString();
    }


    @PUT
    @Produces("application/json")
    @Consumes("application/json")
    public void putUtilisateur(Utilisateur utilisateur){
        Utilisateur.ModifyOne(utilisateur);
    }



    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public void postUtilisateur(Utilisateur utilisateur) {
        Utilisateur.CreateOne(utilisateur);
    }

}
