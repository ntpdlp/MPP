package lab4.prob4c;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Order> list = new ArrayList<>();
		list.add(new Order("100",LocalDate.of(2019,9,1),200));
		list.add(new Order("100",LocalDate.of(2019,9,10),100));
		Commissioned cm = new Commissioned("123", 0.8, 500,list);
		Employee[] emps = {new Salaried("121", 4000),new Hourly("122", 15.67, 20),cm};
		for(Employee e:emps) {
			e.print(10, 2019);
		}

	}

}
