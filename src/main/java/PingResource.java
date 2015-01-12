
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("ping")
public class PingResource {

    @EJB
    private PingService pingService;
    
    @GET
    public String ping() {
        pingService.persist();
        return "Ping!";
    }
    
}
