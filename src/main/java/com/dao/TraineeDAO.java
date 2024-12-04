package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.bean.Trainee;
import com.util.DBUtil;

public class TraineeDAO {
    public boolean saveTrainee(Trainee trainee) throws ClassNotFoundException {
        String query = "INSERT INTO trainees (trainee_id, name, batch) VALUES (?, ?, ?)";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, trainee.getTraineeId());
            preparedStatement.setString(2, trainee.getName());
            preparedStatement.setString(3, trainee.getBatch());
            
            int res = preparedStatement.executeUpdate();
            if(res>0) {
            	return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}