package com.sj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sj.entity.Trainee;
import com.sj.service.TraineeService;


@RestController
@RequestMapping("/trainee")                  //  http://localhost:5252/trainee
public class TraineeController {
	
	@Autowired
	TraineeService service;
	
	//post-insert,put-update,get-get,delete-remove
	
	@PostMapping("/addTrainee")               //  http://localhost:5252/trainee/addTrainee
	public Trainee addTrainee(@RequestBody Trainee trainee) {
		
		return service.addTrainee(trainee);
		
	}
	
	@PutMapping("/updateTrainee")            //  http://localhost:5252/trainee/updateTrainee
	public Trainee updateTrainee(@RequestBody Trainee trainee) {
		
		return service.updateTrainee(trainee);
		
	}

	@GetMapping("/getTrainee/{tid}")        //  http://localhost:5252/trainee/getTrainee/tid
	public Trainee getTrainee(@PathVariable("tid") int tId) {
		
		return service.getTrainee(tId);
		
	}
	
	@GetMapping("/getAllTrainees")          //  http://localhost:5252/trainee/getAllTrainees
	public List<Trainee> getAllTrainees() {
		
		return service.getAllTrainees();
		
	}
	
	@DeleteMapping("/deleteTrainee/{tId}")      //  http://localhost:5252/trainee/deleteTrainee/tId
	public String deleteTrainee(@PathVariable("tId") int tId) {
		
		 return service.deleteTrainee(tId);
		
	}
}
