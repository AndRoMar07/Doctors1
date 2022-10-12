package com.doctors1.doctors1.service;

import com.doctors1.doctors1.model.SpecialtyModel;
import com.doctors1.doctors1.repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecialtyService {

    @Autowired
    private SpecialtyRepository specialtyRepository;

    public List<SpecialtyModel> getAllSpecialties(){
        return specialtyRepository.getAllDepartments();
    }

    public Optional<SpecialtyModel> getSpecialty(Integer id){
        return specialtyRepository.getDepartment(id);
    }

    public SpecialtyModel saveSpecialty(SpecialtyModel specialtyModel) {
        if (specialtyModel.getId()==null) {
            return specialtyRepository.saveDepartment(specialtyModel);
        } else {
            Optional<SpecialtyModel> specialtyModel1=specialtyRepository.getDepartment(specialtyModel.getId());
            if (specialtyModel1.isPresent()) {
                return specialtyModel;
            } else {
                return specialtyRepository.saveDepartment(specialtyModel);

            }
        }
    }
    public boolean deleteSpecialty(Integer id){
        return specialtyRepository.deleteDepartment(id);
    }

    public SpecialtyModel updateSpecialty(SpecialtyModel specialtyModel){
        return specialtyRepository.updateDepartment(specialtyModel);
    }
}
