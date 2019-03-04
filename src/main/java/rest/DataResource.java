package rest;

import data.Generator;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Fen
 */
@Path("data")
public class DataResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of DataResource
     */
    public DataResource() {
    }

    /**
     * Retrieves representation of an instance of rest.DataResource
     * @param amount
     * @param idstart
     * @return an instance of java.lang.String
     */
    @GET
    @Path ("/{amount}/{idstart}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson(@PathParam("amount") int amount, @PathParam("idstart") int idstart) {
        //TODO return proper representation object
        return Response.ok().entity(Generator.generate(amount, idstart)).build();
    }


}
