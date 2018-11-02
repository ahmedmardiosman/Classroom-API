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

//	@Override
//	@Transactional(REQUIRED)
//	public String addTrainer(String trainer) {
//		Accounts aAccount = util.getObjectForJSON(trainer, Trainees.class);
//		manager.persist(aAccount);
//		return "{\"message\": \"Account has been sucessfully added\"}";
//	}
//
//	@Override
//	@Transactional(REQUIRED)
//	public String updateTrainer(Long id, String trainer) {
//		Trainees aAccount = util.getObjectForJSON(trainer, Trainees.class);
//		Trainees accountInDB = findTrainer(id);
//		accountInDB.setFirstName(aAccount.getFirstName());
//		accountInDB.setLastName(aAccount.getLastName());
//		accountInDB.setAccountNumber(aAccount.getAccountNumber());
//
//		return "{\"message\": \"Account has been sucessfully updated\"}";
//	}
//
//	@Override
//	@Transactional(REQUIRED)
//	public String deleteAccount(Long id) {
//		Accounts AccountInDB = findAccount(id);
//		if (AccountInDB != null) {
//			manager.remove(AccountInDB);
//		}
//		return "{\"message\": \"Account sucessfully deleted\"}";
//	}
//
//	private Accounts findAccount(Long id) {
//		return manager.find(Accounts.class, id);
//	}
//
//	public void setManager(EntityManager manager) {
//		this.manager = manager;
//	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}

//	public String getAccount(Long id) {
//		Accounts AccountInDB = findAccount(id);
//		return util.getJSONForObject(AccountInDB);
//
//	}

}


