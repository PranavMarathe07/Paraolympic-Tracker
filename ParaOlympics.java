package data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ParaOlympics {

	public static void main(String[] args) {
		
		
		//Creating one Hashmap
		HashMap<String, ArrayList<Integer>> db = new HashMap();
		
		ArrayList<Integer> achina = new ArrayList<Integer>();
		achina.add(43);
		achina.add(31);
		achina.add(15);
		achina.add(89);
		
		//Put the values in the hashmap
		db.put(" China", achina);
		
		
		//Entering the Great Britan
		ArrayList<Integer> agbritan = new ArrayList<Integer>();
		agbritan.add(29);
		agbritan.add(16);
		agbritan.add(11);
		agbritan.add(56);
		
		//Put the Elements in the hashamp
		db.put("Britan", agbritan);
		
		//Entering the Great Britan
		ArrayList<Integer> aIndia = new ArrayList<Integer>();
		aIndia.add(3);
		aIndia.add(5);
		aIndia.add(7);
		aIndia.add(15);
				
		//Put the Elements in the hashamp
		db.put(" India", aIndia);
		
		Set<String> allkeys = db.keySet();
		
		System.out.println("Country"+"      " +"Gold Medal"+"    "+"Silver Medal"+"  "+"Bronze Medal"+"  "+"Total");
		
		for(String c: allkeys) {
			System.out.println(c+"  ----->  "+db.get(c).get(0)+"           " +db.get(c).get(1)+"               " +db.get(c).get(2)+"          "+db.get(c).get(3));
		}
				
 	}
}
