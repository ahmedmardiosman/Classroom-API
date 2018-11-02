package com.qa.persistence.domain;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Classrooms {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long classroomID;
	private String trainer;
	
	@OneToMany(targetEntity = Trainees.class)
	private List<Trainees> traineesList;

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	
	public Long getClassroomID() {
		return classroomID;
	}

	public void setClassroomID(Long classroomID) {
		this.classroomID = classroomID;
	}
	
	public List<Trainees> getTrainees() {
	      return traineesList;
	    }

	   public void setTrainees(List<Trainees> traineesList) {
	      this.traineesList = traineesList;
	   }
	
	
	

}
