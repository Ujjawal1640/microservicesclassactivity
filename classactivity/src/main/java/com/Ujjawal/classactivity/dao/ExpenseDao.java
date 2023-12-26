package com.Ujjawal.classactivity.dao;


import com.Ujjawal.classactivity.entity.Expense;

import java.util.List;

public interface ExpenseDao {
	public void insertRecord(Expense exp);
	public List<Expense> fetchAllRecords();
	public Expense fetchById(int expId);
	public void updateRecord(Expense exp);
	public void deleteRecord(int expId);
}