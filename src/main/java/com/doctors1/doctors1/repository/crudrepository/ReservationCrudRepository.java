package com.doctors1.doctors1.repository.crudrepository;

import com.doctors1.doctors1.model.ReservationModel;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<ReservationModel, Integer> {
}
