import java.util.*;
public class JHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<Integer,String>();
		
		//1. Add key-value pairs to the map
		hmap.put(0, "Apple");
		hmap.put(1, "Banana");
		hmap.put(2, "Orange");
		hmap.put(5, "Watermelon");
		hmap.put(9, "Pineapple");
	
		
		System.out.print("The map is: ");
		System.out.println(hmap + "\n");
		
		
		//2. Modify key 0
		hmap.replace(0, "Kiwi"); // Can  be done using "put" as well
		
		System.out.print("The modified map is: ");
		System.out.println(hmap + "\n");
		
		
		//3. Get fruit at key 2
		System.out.println("The fruit at key 2 is: " + hmap.get(2) + "\n");
		
		//4. Remove fruit at key 1
		hmap.remove(1);
		System.out.println("The map after removing key 1 is: " + hmap + "\n");		
		
		
		//5. Does it have fruit Banana
		System.out.println("Does map have Banana? " + hmap.containsValue("Banana") + "\n");		
		

	}

}
