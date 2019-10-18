package lab8.prob2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Product{
	//instance field
	private String title;
	private double price;
	private int model=0;
	
	//constructor
	public Product(String title, Double price, int model){
		this.title = title;
		this.price = price;
		this.model = model;
	}
	
	//getter
	public String getTitle() {
		return title;
	}
	public double getPrice() {
		return price;
	}
	public int getModel() {
		return model;
	}
	
	@Override
	public String toString() {
		return String.format("\n Title %s : Price %s : Model %s", title,price,model);
	}
	
}//end_class


public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<Product>() {
			{
				add(new Product("IPhone 6x",1000.0,6));
				add(new Product("GalaxyNote",1100.0,11));
				add(new Product("MacbookPro",2000.0,10));
				add(new Product("Dell",3000.0,10));	
				add(new Product("GalaxyNote",500.0,5));
				add(new Product("MacbookPro",2000.0,8));
			}
		};
		
		//a
		Comparator<Product> comp1 = new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getPrice(), o2.getPrice());
			}
			
		};
		list.sort(comp1);
		System.out.println("Sort price:");
		System.out.println(list);
		
		
		//b
		Comparator<Product> comp2 = new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				// TODO Auto-generated method stub
				return o1.getTitle().compareToIgnoreCase(o2.getTitle());
			}
			
		};
		list.sort(comp2);
		System.out.println("Sort title:");
		System.out.println(list);

		
		//c
		list.sort(new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				if(o1.getTitle() != o2.getTitle()) {
					return o1.getTitle().compareToIgnoreCase(o2.getTitle());
				}else {
					return Double.compare(o1.getPrice(), o2.getPrice());
				}
			}
			
		});
		System.out.println("Sort title , then price:");
		System.out.println(list);

		
		//d
		list.sort((Product o1, Product o2)->{
			if(o1.getTitle() != o2.getTitle()) {
				return o1.getTitle().compareToIgnoreCase(o2.getTitle());
			}else {
				return Integer.compare(o1.getModel(), o2.getModel());
			}
			
		});
		System.out.println("Sort title , then model:");
		System.out.println(list);
		
	}//end_main

}//end_class
