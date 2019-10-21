package lab9.prob9;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                           new Dish("beef", false, 700, Dish.Type.MEAT),
                           new Dish("chicken", false, 400, Dish.Type.MEAT),
                           new Dish("french fries", true, 530, Dish.Type.OTHER),
                           new Dish("rice", true, 350, Dish.Type.OTHER),
                           new Dish("season fruit", true, 120, Dish.Type.OTHER),
                           new Dish("pizza", true, 550, Dish.Type.OTHER),
                           new Dish("prawns", false, 400, Dish.Type.FISH),
                           new Dish("salmon", false, 450, Dish.Type.FISH));
    private static Stream<Dish> createReuseStream(List<Dish> list){
    	return list.stream();
    }
    
    public static void main(String[] args) {
    	//9a
    	Stream<Dish> s1 = createReuseStream(menu);
    	boolean o1 = s1.anyMatch(e -> e.isVegetarian());
    	System.out.println("Vegetarian meal: " + o1);
    	
    	//9b
    	Stream<Dish> s2 = createReuseStream(menu);
    	boolean o2 = s2.anyMatch(e -> e.getCalories()<=1000);
    	System.out.println("Healthy menu: " + o2);
    	
    	//9c
    	Stream<Dish> s3 = createReuseStream(menu);
    	boolean o3 = s3.anyMatch(e -> e.getCalories()>1000);
    	System.out.println("Unhealthy menu: " + o3);
   	
    	//9d
    	Stream<Dish> s4 = createReuseStream(menu);
    	Optional<Dish> o4 = s4.filter(e -> e.getType().equals(Dish.Type.MEAT))
    						.findFirst();
    	System.out.println("First MEAT: " + o4.toString());
    	
    	//9e
    	Stream<Dish> s5 = createReuseStream(menu);
    	int calculateTotalCalories = s5.map(e -> e.getCalories())
    								.reduce(0,Integer::sum);
    	System.out.println("Total Calories: " + calculateTotalCalories);
 
    }//end_main
}//end_class