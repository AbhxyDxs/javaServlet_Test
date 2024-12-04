package com.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Trainee;
import com.service.TraineeService;

@WebServlet("/TraineeRegistrationServlet")
public class TraineeRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private TraineeService traineeService;
	public void init() {
        traineeService = new TraineeService();
    }
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int traineeID = Integer.parseInt(request.getParameter("trainee_id"));
        String name = request.getParameter("name");
        String batch = request.getParameter("batch");

        Trainee trainee = new Trainee(traineeID,name,batch);

        boolean isRegistered = false;
		try {
			isRegistered = traineeService.registerTrainee(trainee);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        if (isRegistered) {
            response.getWriter().write("Registration Successful!");
        } else {
            response.getWriter().write("Registration Failed!");
        }
    }
}