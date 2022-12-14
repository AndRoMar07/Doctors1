package com.doctors1.doctors1.service;

import com.doctors1.doctors1.model.ClientModel;
import com.doctors1.doctors1.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<ClientModel> getAllClients(){
       return clientRepository.getAllClients();
        }

    public Optional<ClientModel> getClient(Integer id){
       return clientRepository.getClient(id);
    }

    public ClientModel saveClient(ClientModel clientModel){
        if (clientModel.getIdClient()==null){
            return clientRepository.saveClient(clientModel);
        }else{
            Optional<ClientModel> ClientRepository=clientRepository.getClient(clientModel.getIdClient());
            if (ClientRepository.isPresent()){
                return clientModel;
            }else{
                return clientRepository.saveClient(clientModel);
            }
        }
    }

    public boolean deleteClient(Integer id){
        return clientRepository.deleteClient(id);
    }

    public ClientModel updateClient(ClientModel clientModel){
           return clientRepository.saveClient(clientModel);
      }
}
