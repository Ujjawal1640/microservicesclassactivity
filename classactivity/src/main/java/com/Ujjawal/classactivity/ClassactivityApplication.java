package com.Ujjawal.classactivity;

import com.Ujjawal.classactivity.dao.ExpenseDao;
import com.Ujjawal.classactivity.entity.Expense;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClassactivityApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassactivityApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(ExpenseDao expDao) {
		return runner -> callExpense(expDao);
	}

	private void callExpense(ExpenseDao expDao) {


		Expense expObj = new Expense(1, "Apple",120, "10/11/23", "red", "abcd","abcd");
		expDao.insertRecord(expObj);
		Expense expObj1 = new Expense(2, "Banana",45, "10/11/23", "yellow", "abcd","abcd");
		expDao.insertRecord(expObj1);
		System.out.println("Expense record inserted successfully!!!");




		System.out.println(expDao.fetchById(2));
		System.out.println("Expense record found successfully!!!");



		Expense expUpObj = new Expense(2, "Banana",45, "10/11/23", "yellow", "dcab","dcab");
		expDao.updateRecord(expUpObj);
		System.out.println("Expense record updated successfully!!!");




		System.out.println("FetchAll operation initiated!!!");
		System.out.println(expDao.fetchAllRecords());
		System.out.println("Expense records Displayed successfully!!!");



		expDao.deleteRecord(2);
		System.out.println("Expense record Deleted successfully!!!");



		System.out.println(expDao.fetchAllRecords());
		System.out.println("Expense records Displayed successfully!!!");


	}
}
