package com.doctors1.doctors1.repository.crudrepository;

import com.doctors1.doctors1.model.DoctorModel;
import org.springframework.data.repository.CrudRepository;

public interface DoctorCrudRepository extends CrudRepository <DoctorModel, Integer> {

}
