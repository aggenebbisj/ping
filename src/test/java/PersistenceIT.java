

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.junit.Test;
import org.junit.Before;

public class PersistenceIT {

    private EntityManager em;
    private EntityTransaction tx;
    
    @Before
    public void before() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("integration-test");
        em = factory.createEntityManager();
        tx = em.getTransaction();
    }

    @Test
    public void testEmployees() {
        tx.begin();
        try {
            List<Audit> resultList = em.createQuery("Select a From Audit a", Audit.class).getResultList();
            assertThat(resultList.size(), is(2));
        } catch (Exception e) {
            e.printStackTrace();
        }
        tx.commit();
    }

}
