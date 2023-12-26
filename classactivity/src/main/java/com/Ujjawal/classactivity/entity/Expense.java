package com.Ujjawal.classactivity.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Expense {
	
		@Id
		@Column(name = "id",nullable =  false, length = 10)
		private int id;
		@Column(name = "name", nullable =  false, length = 20)
		private String name;
		@Column(name = "cost", nullable =  false)
		private double cost;
		@Column(name = "date", nullable = false)
		private String date;
		@Column(name = "color", nullable = false)
		private String color;
		@Column(name = "url", nullable = false)
		private String url;
		@Column(name = "remarks", nullable = false, length = 200)
		private String remarks;
		
		// default constructor
		public Expense(){
			
		}
		
		// parameterized constructor
		public Expense(int id, String name, double cost, String date, String color, String url, String remarks) {
			super();
			this.id = id;
			this.name = name;
			this.cost= cost;
			this.date= date;
			this.color = color;
			this.url = url;
			this.remarks = remarks;
		}
		
		@Override
		public String toString() {
			return "\n Expense [id=" + id + ", name=" + name+", cost="+cost+ ", date=" + date +", color=" + color +", url=" + url +", remarks=" + remarks + "]";
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public double getCost() {
			return cost;
		}
		public void setcost(double cost) {
			this.cost = cost;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getRemarks() {
			return remarks;
		}
		public void setSalary(String remarks) {
			this.remarks = remarks;
		}
		

}