package boundary;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.servlet.ServletContext;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("")
@ApplicationScoped
public class PetResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(PetResource.class);
    @Context
    private ServletContext ctx;

    /**
     * Use uriInfo to get current context path and to build HATEOAS links
     */
    @Context
    private UriInfo uriInfo;

    @GET
    @Path("pets")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPets() {
        final JsonObject json = Json.createObjectBuilder()
                .add("name", "Hello World")
                .build();

        LOGGER.info("Where Is My Pet :: GET - All Pets");

        if (json.isEmpty())
            throw new WebApplicationException(Response.Status.NOT_FOUND);

        return Response.ok(json).build();
    }
}
