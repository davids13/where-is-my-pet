package control.dao;

import commons.jpa.AbstractEntityModel;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.stream.Stream;

@Stateless
public class GenericDAO implements IGenericDAO {

    @PersistenceContext(unitName = "petFinder_PU")
    private EntityManager entityManager;

    @Override
    public <T extends AbstractEntityModel> void add(final T object) {
        entityManager.persist(object);
    }

    public Stream<?> getAll(final String namedQuery, final Class<?> clazz) {
        final TypedQuery<?> query = entityManager.createNamedQuery(namedQuery, clazz);
        return query.getResultStream();
    }
}
