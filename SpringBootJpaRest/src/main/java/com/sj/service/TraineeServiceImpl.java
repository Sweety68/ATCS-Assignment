package com.sj.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sj.dao.TraineeDao;
import com.sj.entity.Trainee;

@Service
@Transactional
public class TraineeServiceImpl implements TraineeService {
	
	@Autowired
	TraineeDao dao;

	@Override
	public Trainee addTrainee(Trainee trainee) {
		
		return dao.addTrainee(trainee);
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		
		return dao.updateTrainee(trainee);
	}

	@Override
	public String deleteTrainee(int tId) {
		
		return dao.deleteTrainee(tId);
	}

	@Override
	public Trainee getTrainee(int tId) {
		
		return dao.getTrainee(tId);
	}

	@Override
	public List <Trainee> getAllTrainees() {
		
		return dao.getAllTrainees();
	}

}
