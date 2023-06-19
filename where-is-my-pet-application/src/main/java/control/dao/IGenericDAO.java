package control.dao;

import commons.jpa.AbstractEntityModel;

import java.util.stream.Stream;

public interface IGenericDAO {

    <T extends AbstractEntityModel> void add(final T object);

    Stream<?> getAll(final String namedQuery, final Class<?> clazz);
}
