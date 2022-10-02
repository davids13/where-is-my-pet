package control.dao;

import commons.jpa.AbstractEntityModel;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

//@Stateless
@ApplicationScoped
@Transactional // ejb contains transactional(is not needed to use); Mark your CDI bean method as @Transactional and the EntityManager will enlist and flush at commit.
public class GenericDAO implements IGenericDAO {

    @PersistenceContext(unitName = "petFinder_PU")
    private EntityManager entityManager;

    public <T extends AbstractEntityModel> void add(final T object) {
        entityManager.persist(object);
    }
}
