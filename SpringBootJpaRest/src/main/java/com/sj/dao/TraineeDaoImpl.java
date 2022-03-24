package com.sj.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.sj.entity.Trainee;

@Repository
public class TraineeDaoImpl implements TraineeDao {

	@PersistenceContext
	EntityManager entity;
	
	@Override
	public Trainee addTrainee(Trainee trainee) {
		entity.persist(trainee);
		return entity.find(Trainee.class, trainee.gettId());
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
	
		return entity.merge(trainee);
	}

	@Override
	public String deleteTrainee(int tId) {
		Trainee delete = entity.find(Trainee.class, tId);
		if(delete!=null) {
			entity.remove(delete);
			return "find trainee successfully";
		}
		else {
			return "trainee not found";
		}
		
	}

	@Override
	public Trainee getTrainee(int tId) {
		
		return entity.find(Trainee.class,tId);
	}

	@Override
	public List<Trainee> getAllTrainees() {
		TypedQuery<Trainee> result = entity.createQuery("select t from Trainee t",Trainee.class);
		return result.getResultList();
	}

}
