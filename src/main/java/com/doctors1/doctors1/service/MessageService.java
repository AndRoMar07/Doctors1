package com.doctors1.doctors1.service;

import com.doctors1.doctors1.model.MessageModel;
import com.doctors1.doctors1.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public List<MessageModel> getAllMessages(){
        return messageRepository.getAllMessages();
    }

    public Optional<MessageModel> getMessage(Integer id){
        return messageRepository.getMessage(id);
    }

    public MessageModel saveMessage(MessageModel messageModel){
        if (messageModel.getIdMessage()==null) {
            return messageRepository.saveMessage(messageModel);
        }
        else { Optional<MessageModel> messageModel1=messageRepository.getMessage(messageModel.getIdMessage());
            if (messageModel1.isPresent()) {
                return messageModel;
            }
            else {
                return messageRepository.saveMessage(messageModel);

            }
        }
    }
    public boolean deleteMessage(Integer id){
        return messageRepository.deleteMessage(id);
    }

    public MessageModel updateMessage(MessageModel messageModel){ return messageRepository.updateMessage(messageModel);
    }
}
