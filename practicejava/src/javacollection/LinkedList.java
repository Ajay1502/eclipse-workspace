package javacollection;



public class LinkedList {
	public static void main(String[]args) {
		java.util.LinkedList<Integer> link =new java.util.LinkedList<>();
		java.util.LinkedList<Integer> link1 = new java.util.LinkedList<>();
		link1.add(11);
		link1.add(12);
		link1.add(13);
		
		link.add(8);
		link.add(7);
		link.add(5);
		link.add(2);
		link.add(3,5);
		link.add(1);
		link.addAll(0,link1);
		link.set(0, 855);
		link.addLast(111);
		link.addFirst(888);
		//link.clear();
		System.out.println(link.indexOf(5));
		System.out.println(link.lastIndexOf(1));
		System.out.println(link.contains(9));
		for(int i=0;i<link.size();i++) {
		System.out.print(link.get(i));
		System.out.print(", ");
		}
	}
}
