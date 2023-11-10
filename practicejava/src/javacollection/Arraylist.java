package javacollection;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<>();
		ArrayList<Integer> li = new ArrayList<>();
		li.add(11);
		li.add(12);
		li.add(13);
		
		array.add(8);
		array.add(7);
		array.add(5);
		array.add(2);
		array.add(3,5);
		array.add(1);
		array.addAll(0,li);
		array.set(0, 855);
		//array.clear();
		System.out.println(array.indexOf(5));
		System.out.println(array.lastIndexOf(1));
		System.out.println(array.contains(9));
		for(int i=0;i<array.size();i++) {
		System.out.print(array.get(i));
		System.out.print(", ");
		}
		ArrayList<String> car = new ArrayList<>();
		car.add("honda");
		car.add(0,"Tata");
		car.add("Mahindra");
		for(int a=0;a<car.size();a++) {
			System.out.println(car.get(a));
			
		}
	
	}

	
		
}
