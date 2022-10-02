package control.dao;

import commons.jpa.AbstractEntityModel;

public interface IGenericDAO {

    <T extends AbstractEntityModel> void add(final T object);
}
