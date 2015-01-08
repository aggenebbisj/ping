
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryUsage;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("memory")
@Produces(MediaType.APPLICATION_JSON)
public class MemoryResource {

    @GET
    @Path("usage")    
    public MemoryUsage usage() {        
        return ManagementFactory.getMemoryMXBean().getHeapMemoryUsage();
    }
    
}
