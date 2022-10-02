package boundary;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("")
@ApplicationScoped
public class PetResource {

    @Path("pets")
    @GET
    public Response getAllPets() {
        return Response.ok("Hello World").build();
    }
}
