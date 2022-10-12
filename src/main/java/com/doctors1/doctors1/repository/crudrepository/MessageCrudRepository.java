package com.doctors1.doctors1.repository.crudrepository;

import com.doctors1.doctors1.model.MessageModel;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository <MessageModel, Integer> {
}
