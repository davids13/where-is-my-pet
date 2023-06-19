package control.service;

import entity.Owner;

import java.util.List;

public interface IPetService {
    List<Owner> findAllOwners();
}
