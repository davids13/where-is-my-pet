import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("api/v1")
@ApplicationScoped
public class MicroserviceApplication extends Application {
    // add provider classes here
}
