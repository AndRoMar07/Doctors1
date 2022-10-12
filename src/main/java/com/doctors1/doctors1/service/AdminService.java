package com.doctors1.doctors1.service;

import com.doctors1.doctors1.model.AdminModel;
import com.doctors1.doctors1.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public List<AdminModel> getAllAdmins(){
        return adminRepository.getAllAdmins();
    }
    public Optional<AdminModel> getAdmin (Integer id){
        return adminRepository.getAdmin(id);
    }
    public AdminModel saveAdmin(AdminModel adminModel){
        if (adminModel.getId()==null) {
            return adminRepository.saveAdmin(adminModel);
        }
        else { Optional<AdminModel> adminModel1=adminRepository.getAdmin(adminModel.getId());
            if (adminModel1.isPresent ()) {
                return adminModel;
            }
            else {
                return adminRepository.saveAdmin(adminModel);

            }
        }
    }
    public boolean deleteAdmin(Integer id){
        return adminRepository.deleteAdmin (id);
    }
    public AdminModel updateAdmin (AdminModel adminModel){
        return adminRepository.updateAdmin(adminModel);
    }

}
