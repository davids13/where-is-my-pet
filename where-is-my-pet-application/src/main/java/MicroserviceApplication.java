import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("api/v1")
@ApplicationScoped
public class MicroserviceApplication extends Application {
    // add provider classes here

    /*
    TODO:
        - requests as async
        - cache (google guava lib)
        - esi
        - request by xml (java ee zuka)
        - implement photo
        - dto (to not send gender)
        - websockets (java ee zuka)
        - create a auth (jwt)
        - create crud java ee 8 book
        - add metrics with microprofile health
        - add cicd
        - terraform scripts
        - Azure vm
        - wiremock
     */
}
