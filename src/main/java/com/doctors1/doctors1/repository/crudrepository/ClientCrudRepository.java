package com.doctors1.doctors1.repository.crudrepository;

import com.doctors1.doctors1.model.ClientModel;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository <ClientModel, Integer> {
}
