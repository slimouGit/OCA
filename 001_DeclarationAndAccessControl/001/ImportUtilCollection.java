import java.util.*;

public class ImportUtilCollection{
	public static void main(String[] args){
		List<String> people = new ArrayList<String>();
		TreeSet<String> animals = new TreeSet<String>();

		people.add("Tina");
		people.add("Tom");

		for(String human:people){
			System.out.println(human);
		}

		animals.add("Gaston");
		
		System.out.println(animals.size());
		System.out.println(animals);
	}
}