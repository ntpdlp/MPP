package lab4.prob4c;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee{
	//fields
	private double commission;
	private double baseSalary;
	private List<Order> orders;
	
	//constructor
	Commissioned(String empId, double commission, double baseSalary,List<Order> orders) {
		super(empId);
		this.baseSalary = baseSalary;
		this.commission = commission;
		this.orders = orders;
	}
	
	//associations
	public void addOrder(Order e) {
		orders.add(e);
	}
	
	//functions
	public int countPreviousMonthOrders(int month, int year) {
		//get list date of orders, count if its month is previous month
		int countMonth;
		int countYear;
		if(month >=2) {
			countMonth = month - 1;
			countYear = year;
		}else {
			//if currentMonth is January, its value = 1 => previousMonth = 12 of (year - 1)
			countMonth = 12;
			countYear = year - 1; 
		}
		
		//count the previous orders
		int count = 0;
		for(Order o:orders) {
			if(countMonth == o.getOrderDate().getMonthValue() && countYear == o.getOrderDate().getYear()) {
				count +=o.getOrderAmount();
			}//end_if
		}
		return count;
	}
	
	@Override
	public double calcGrossPay(int month, int year) {
		int numberPreOrders = countPreviousMonthOrders(month,year);
		return baseSalary + commission*numberPreOrders;
	}

}
