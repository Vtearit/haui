package LinkedBlockingDeque_Topic;
//Edit: Group of 10

import java.util.concurrent.LinkedBlockingDeque;

/**
 * 
 * The <b>LinkedBlockingDeque</b> class in Java is a part of the Java Collection
 * Framework and implements the Collection interface and the AbstractQueue
 * class. It also implements the BlockingDeque and provides an
 * optionally-bounded functionality based on linked nodes. This optional
 * boundedness is served by passing the required size in the constructor and
 * helps in preventing memory wastage. When unspecified, the capacity is by
 * default taken as <b>Integer.MAX_VALUE</b>. <br/>
 * <i>update 03/06/2020</i>
 * 
 * 
 * @author Vtearit
 *
 */

public class Example {
	/**
	 * 
	 * Java Program Demonstrate add() method of LinkedBlockingDeque
	 * 
	 * @throws IllegalStateException
	 * 
	 * 
	 */

	public static LinkedBlockingDeque<Integer> intializingIntegerDeque() {

		// Creating an empty LinkedBlockingDeque
		LinkedBlockingDeque<Integer> LBD = new LinkedBlockingDeque<Integer>();

		// Add numbers to end of LinkedBlockingDeque
		LBD.add(7855642);
		LBD.add(35658786);
		LBD.add(5278367);
		LBD.add(74381793);

		showLinkedBlockingDeque(LBD);

		return LBD;
	}

	// Displaying the LinkedBlockingDeque
	public static void showLinkedBlockingDeque(LinkedBlockingDeque<Integer> LBD) {
		System.out.println("LinkedBlockingDeque: " + LBD);
		System.out.println("");
	}

	// Java Program Demonstrate addFirst()
	// method of LinkedBlockingDeque
	public static LinkedBlockingDeque<Integer> addFirstLinkedBlockingDeque(LinkedBlockingDeque<Integer> LBD) {
		// Add numbers to front of LinkedBlockingDeque
		LBD.addFirst(1234);
		LBD.addFirst(2345);
		LBD.addFirst(3456);
		LBD.addFirst(4567);

		return LBD;
	}


	/**
	 * Java Program Demonstrate addLast()
	 * method of LinkedBlockingDeque
	 * @param LBD
	 * @return
	 */
	public static LinkedBlockingDeque<Integer> addLastLinkedBlockingDeque(LinkedBlockingDeque<Integer> LBD) {
		// Adding elements at the beggining
		LBD.addLast(40);
		LBD.addLast(50);
		LBD.addLast(60);
		LBD.addLast(70);

		return LBD;
	}

	/**
	 * 
	 * @param LBD
	 * @return
	 */
	public static LinkedBlockingDeque<Integer> clearLinkedBlockingDeque(LinkedBlockingDeque<Integer> LBD) {
		LBD.clear();

		showLinkedBlockingDeque(LBD);
		return LBD;
	}
	
	/**
	 * Java Program Demonstrate contains()
	 * method of LinkedBlockingDeque
	 * @param LBD
	 * @return
	 */
	public static LinkedBlockingDeque<Integer> containsLinkedBlockingDeque(LinkedBlockingDeque<Integer> LBD){
		if (LBD.contains(10)) {
			System.out.println("Linked Blocking Deque contains 10");
		} else {
			System.out.println("Linked Blocking Deque does not contain 10");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedBlockingDeque<Integer> LBD = intializingIntegerDeque();
		addFirstLinkedBlockingDeque(LBD);
		System.out.println("LinkedBlockingDeque after using addFirst() method: ");
		showLinkedBlockingDeque(LBD);
		addLastLinkedBlockingDeque(LBD);
		System.out.println("LinkedBlockingDeque after using addLast() method: ");
		showLinkedBlockingDeque(LBD);
		System.out.println("LinkedBlockingDeque after using clear() method: ");
		clearLinkedBlockingDeque(LBD);
		return;
	}

}
