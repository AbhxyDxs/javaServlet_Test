package com.service;

import com.bean.Trainee;
import com.dao.TraineeDAO;

public class TraineeService {
    private TraineeDAO traineeDAO;

    public TraineeService() {
        traineeDAO = new TraineeDAO();
    }

    public boolean registerTrainee(Trainee trainee) throws ClassNotFoundException {
        return traineeDAO.saveTrainee(trainee);
    }
}