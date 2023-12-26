package com.Ujjawal.classactivity.dao;

import com.Ujjawal.classactivity.entity.Expense;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ExpenseDaoImpl implements ExpenseDao {
	
	@Autowired
	private EntityManager entityManager;
	

	@Transactional
	public void insertRecord(Expense exp) {
		//adds to DB
		entityManager.persist(exp);
	}

	@Override
	public List<Expense> fetchAllRecords() {
		
		//SQL Query
		TypedQuery<Expense> typedQuery = entityManager.createQuery("from Expense", Expense.class);
		return typedQuery.getResultList();
	}
	
	@Override
	public Expense fetchById(int expId) {
		//find by ID - hibernate function
		Expense response = (Expense) entityManager.find(Expense.class, expId);
		return response;
	}
	

	@Override
	@Transactional
	public void updateRecord(Expense exp) {
		// TODO Auto-generated method stub
		//overwrites file oin basis of ID
		entityManager.merge(exp);

	}

	@Override
	@Transactional
	public void deleteRecord(int expId) {
		// TODO Auto-generated method stub
		Expense response = (Expense) entityManager.find(Expense.class, expId);
		if (entityManager.contains(response)) {
			//to delete
			entityManager.remove(response);
		} else {
			entityManager.remove(entityManager.merge(response));
		}
	}
	
}