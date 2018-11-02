package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Trainees;
import com.qa.util.JSONUtil;

// Class to add stuff to database

@Transactional(SUPPORTS)
@Default
public class ClassroomDBRepository implements ClassroomRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	public String getAllClassrooms() {
		Query query = manager.createQuery("Select a FROM Classrooms a");
		Collection<Trainees> classes = (Collection<Trainees>) query.getResultList();
		// Converting Object to JSON
		return util.getJSONForObject(classes);
	}



	public void setUtil(JSONUtil util) {
		this.util = util;
	}



}


