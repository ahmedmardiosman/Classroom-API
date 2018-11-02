package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainees {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long traineeID;
	private String traineeName;
	
	
	
	

	public Trainees() {
	}

	public Trainees(Long traineeID, String traineeName) {

		this.setTraineeID(traineeID);
		this.setTraineeName(traineeName);

	}

	

//	@Override
//	public String toString() {
//		return "Accounts [id : " + id + ", firstName : " + firstName + ", lastName : " + lastName + ", accountNumber : "
//				+ accountNumber + "]";
//	}

	

	public Long getTraineeID() {
		return traineeID;
	}

	public void setTraineeID(Long traineeID) {
		this.traineeID = traineeID;
	}
	

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

}
