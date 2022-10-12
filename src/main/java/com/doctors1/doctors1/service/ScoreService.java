package com.doctors1.doctors1.service;

import com.doctors1.doctors1.model.ScoreModel;
import com.doctors1.doctors1.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScoreService {


    @Autowired
    private ScoreRepository scoreRepository;

    public List<ScoreModel> getAllScores(){
        return scoreRepository.getAllScores();
    }
    public Optional<ScoreModel> getScore (Integer id){
        return scoreRepository.getScore(id);
    }
    public ScoreModel saveScore(ScoreModel scoreModel) {
        if (scoreModel.getId()==null) {
            return scoreRepository.saveScore(scoreModel);
        } else {
            Optional<ScoreModel> scoreModel1 = scoreRepository.getScore(scoreModel.getId());
            if (scoreModel1.isPresent()) {
                return scoreModel;
            } else {
                return scoreRepository.saveScore(scoreModel);

            }
        }
    }
    public boolean deleteScore(Integer id){
        return scoreRepository.deleteScore(id);
    }
    public ScoreModel updateScore (ScoreModel scoreModel){
        return scoreRepository.updateScore(scoreModel);
    }

}