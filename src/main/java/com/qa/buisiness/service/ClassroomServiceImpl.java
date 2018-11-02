package com.qa.buisiness.service;

import javax.inject.Inject;

import com.qa.persistence.repository.ClassroomRepository;

public class ClassroomServiceImpl implements ClassroomService {

	@Inject
	private ClassroomRepository repo;

//	public String addAccount(String account) {
//		return repo.addAccount(account);
//	}
	
	
//	public String updateAccount(Long id, String account) {
//		return repo.updateAccount(id, account);
//	}
//
//	@Override
//	public String deleteAccount(Long id) {
//		return repo.deleteAccount(id);
//	}
//
//	public String getAccount(Long id) {
//		return repo.getAccount(id);
//
//	}

	public String getAllClassrooms() {
		return repo.getAllClassrooms();
	}

	public void setRepo(ClassroomRepository repo) {
		this.repo = repo;
	}

}
