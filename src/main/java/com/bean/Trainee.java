package com.bean;

public class Trainee {
    private int traineeId;
    private String name;
    private String batch;
    
    //Constructor
    public Trainee(int traineeId, String name, String batch) {
		super();
		this.traineeId = traineeId;
		this.name = name;
		this.batch = batch;
	}

    // Getters and Setters
    public int getTraineeId() {
        return traineeId;
    }

	public void setTraineeId(int traineeId) {
        this.traineeId = traineeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
}