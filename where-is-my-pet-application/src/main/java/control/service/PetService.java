package control.service;

import control.dao.IGenericDAO;
import entity.Owner;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PetService implements IPetService {

    private IGenericDAO dao;

    public List<Owner> findAllOwners() {
        Stream<Owner> getOwners = (Stream<Owner>) dao.getAll(Owner.OWNER_FIND_ALL, Owner.class);

        if (getOwners == null) {
            return Collections.emptyList();
        }

        return getOwners.collect(Collectors.toList());
    }

}
