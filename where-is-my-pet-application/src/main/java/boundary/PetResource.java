package boundary;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.servlet.ServletContext;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

@Path("")
@ApplicationScoped
public class PetResource {

    @Context
    private ServletContext ctx;

    /**
     * Use uriInfo to get current context path and to build HATEOAS links
     */
    @Context
    private UriInfo uriInfo;

    @Path("pets")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPets() {
        final JsonObject json = Json.createObjectBuilder()
                .add("name", "Hello World")
                .build();
        return Response.ok(json).build();
    }
}
