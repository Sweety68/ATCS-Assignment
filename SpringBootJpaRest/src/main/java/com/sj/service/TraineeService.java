package com.sj.service;

import java.util.List;

import com.sj.entity.Trainee;

public interface TraineeService {
	
	Trainee addTrainee(Trainee trainee);
	Trainee updateTrainee(Trainee trainee);
       String deleteTrainee(int tId);
       Trainee getTrainee(int tId);
       List <Trainee> getAllTrainees();
	
	
	
}
