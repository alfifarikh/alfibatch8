package qaautomation.march2022;

import java.util.TreeMap;
import java.util.TreeSet;

public class TugasSatu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tSet = new TreeSet<>();
		tSet.add("Jakarta");
		tSet.add("Bandung");
		tSet.add("Semarang");
		tSet.add("Jogja");
		tSet.add("Malang");
		tSet.add("cisauk");
		tSet.add("angke");
		
		for (String item : tSet) {
		System.out.println(item);
		}
	
		TreeMap<Integer, String> favoriteNumber = new TreeMap<>();
		favoriteNumber.put(666, "Fahri");
		favoriteNumber.put(555, "Ika");
		favoriteNumber.put(666, "Fajar");
		favoriteNumber.put(444, "Yoga");
		favoriteNumber.put(999, "Kevin");
		favoriteNumber.put(404, "Stefanus");
		favoriteNumber.put(777, "Martha");
		favoriteNumber.put(888, "Ashra");
		favoriteNumber.put(13, "Hatta");
		favoriteNumber.put(123, "Alfi");
		favoriteNumber.put(16, "Irfan");
		favoriteNumber.put(765, "adit");
		favoriteNumber.put(212, "Gerhat");
		favoriteNumber.put(14, "Adi");
		favoriteNumber.put(789, "Farah");
		
		for (Integer key : favoriteNumber.keySet()) {
			System.out.println("Favorite number of " + favoriteNumber.get(key) + " is " + key);
		}
		
		System.out.println("================================");
		
		TreeMap<String, Integer> favoriteNumberTest = new TreeMap<>();
		favoriteNumberTest.put("Fahri", 666);
		favoriteNumberTest.put("Ika", 555);
		favoriteNumberTest.put("Fajar", 123);
		favoriteNumberTest.put("Yoga", 444);
		favoriteNumberTest.put("Kevin", 999);
		favoriteNumberTest.put("Stefanus", 404);
		favoriteNumberTest.put("Martha", 777);
		favoriteNumberTest.put("Fahri", 777);
		
		for (String keyTest : favoriteNumberTest.keySet()) {
			System.out.println("Favorite number of " + favoriteNumberTest.get(keyTest) + " is " + keyTest);
		}

	}

}
