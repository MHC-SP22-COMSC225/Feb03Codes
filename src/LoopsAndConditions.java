import java.util.*;

public class LoopsAndConditions {

	public static void main(String[] args) {
		ArrayList<Integer> id_array = new ArrayList<Integer>(5);
		ArrayList<String> name_array = new ArrayList<String>(5);
		
		id_array.add(110); 
		id_array.add(111); 
		id_array.add(112); 
		id_array.add(113); 
		id_array.add(114);
		
		name_array.add("Lisa"); 
		name_array.add("Mikaela"); 
		name_array.add("Ada"); 
		name_array.add("Ruth"); 
		name_array.add("Yana");
		
		
		//Example with if:
		
		if( (id_array.size()<10) && (name_array.size()<10) ) {
			id_array.add(118);
			name_array.add("Lily");
			System.out.println("Added a new id & name");
		} else {
			System.out.println("No change");
		}
		
		
		
		//Option 1: looping by index
		System.out.println("\nVisiting the array by index:");
		for(Integer i=0;i<id_array.size();i++) {
			System.out.println( id_array.get(i) );
		}
		
		
		//Option 2: looping by item
		System.out.println("\nVisiting the array by item:");
		for(Integer id : id_array) {
			System.out.println( id );
		}		
			

	}

}
