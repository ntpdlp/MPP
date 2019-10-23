package lab10.prob1;
import java.util.*;
public class Group<T> {
	//instance fields
	private T specialElement;
	private List<T> elements = new ArrayList<>();
	
	//constructor
	public Group(T special, List<T> elements) {
		this.specialElement = special;
		this.elements = elements;
	}
	
	public T getSpecialElement() {
		return specialElement;
	}
	public List<T> getElements() {
		return elements;
	}
	@Override
	public String toString() {
		return "[special : " + specialElement.toString() 
		    + ", elements :  " + elements.toString() + "] ";
	}
	
	
}
