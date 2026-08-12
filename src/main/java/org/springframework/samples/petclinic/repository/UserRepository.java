package org.springframework.samples.petclinic.repository;
import org.springframework.samples.petclinic.rest.controller.v1.VetRestControllerV1;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.User;

public interface UserRepository {

    void save(User user) throws DataAccessException;
}
