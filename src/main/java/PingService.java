
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PingService {

    @PersistenceContext
    private EntityManager em;

    public void persist() {
        em.persist(new Audit());
    }
    
}
