package JSE_Group10;

import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * The <b>LinkedBlockingDeque</b> class in Java is a part of the <b>Java
 * Collection Framework</b> and implements the Collection <i>interface and the
 * AbstractQueue class</i>. It also implements the BlockingDeque and provides an
 * optionally-bounded functionality based on linked nodes. <br/>
 * <i>update 05/06/2020</i>
 * 
 * @author Group 10
 *
 */
public class linkedBlockingDeque {

	static Scanner sc = new Scanner(System.in);

	// showLBD() method is used to show LinkedBlockingDeque
	public static void showLBD(LinkedBlockingDeque<Integer> LBD) throws IllegalStateException {
		System.out.println("LinkedBlockingDeque: " + LBD);
	}

	// addLBD() method is used to inserts the specified element at the end of this
	// deque
	public static Deque<Integer> addLBD(LinkedBlockingDeque<Integer> LBD) throws IllegalStateException {

		// Use add() method to add elements into the LinkedBlockingDeque
		System.out.println("Add value for the LinkedBlockingDeque (If value = 0 => Stop).");
		while (true) {
			System.out.print("Add value: ");
			int addValue = sc.nextInt();
			if (addValue == 0)
				break;
			LBD.add(addValue);
		}

		showLBD((LinkedBlockingDeque<Integer>) LBD);

		return LBD;
	}

	// addFirstLBD() method inserts the specified element at the front of this deque
	public static LinkedBlockingDeque<Integer> addFirstLBD(LinkedBlockingDeque<Integer> LBD)
			throws IllegalStateException {
		// n is the number of digits used for use with the addfirst () method
		System.out.print("Number of the element ​​to insert at the front of deque: ");
		int a = sc.nextInt();

		// Add elements to front of LinkedBlockingDeque
		System.out.println("Type values: ");
		for (int i = 0; i < a; i++) {
			System.out.print("Add value: ");
			LBD.addFirst(sc.nextInt());
		}
		return LBD;
	}

	// addLastLBD() method inserts the specified element at the end of this deque
	public static LinkedBlockingDeque<Integer> addLastLBD(LinkedBlockingDeque<Integer> LBD)
			throws IllegalStateException {
		// n is the number of digits used for use with the addfirst () method
		System.out.print("Number of the element ​​to insert at the end of deque: ");
		int b = sc.nextInt();

		// Add elements to front of LinkedBlockingDeque
		System.out.println("Type values: ");
		for (int i = 0; i < b; i++) {
			System.out.print("Add value: ");
			LBD.addLast(sc.nextInt());
		}
		return LBD;
	}

	// This method used to make a copy of LinkedBlockingDeque
	public static LinkedBlockingDeque<Integer> CopyLBD(LinkedBlockingDeque<Integer> LBD,
			LinkedBlockingDeque<Integer> temp_deque) {

		for (int value : LBD) {
			temp_deque.add(value);
		}

		showLBD(temp_deque);

		return temp_deque;
	}

	// clearLBD() method atomically removes all of the elements from this deque
	public static LinkedBlockingDeque<Integer> clearLBD(LinkedBlockingDeque<Integer> LBD) throws IllegalStateException {
		LBD.clear();

		showLBD(LBD);
		return LBD;
	}

	// containsLBD() method returns true if this deque contains the specified
	// element.
	public static void containsLBD(LinkedBlockingDeque<Integer> LBD) throws IllegalStateException {
		System.out.print("\nCheck Contains method of Linked Blocking Deque with value: ");
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();

		if (LBD.contains(c)) {
			System.out.println("Linked Blocking Deque contains " + c);
		} else {
			System.out.println("Linked Blocking Deque does not contain " + c);
		}
		sc.close();
	}

	// getElementLBD() method is used to retrieves, but does not remove, the head of
	// the queue represented by this deque
	public static void getElementLBD(LinkedBlockingDeque<Integer> LBD) throws IllegalStateException {
		System.out.println("\nLinked Blocking Deque: " + LBD);
		// prints the first element
		System.out.println("Linked Blocking Deque front element: " + LBD.element());
	}

	// getFirstElementLBD() method retrieves, but does not remove, the first element
	// of this deque
	public static void getFirstElementLBD(LinkedBlockingDeque<Integer> LBD) throws IllegalStateException {
		// prints the first element
		System.out.println("Linked Blocking Deque first element: " + LBD.getFirst());
	}

	// getLastElementLBD() method retrieves, but does not remove, the last element
	// of this deque
	public static void getLastElementLBD(LinkedBlockingDeque<Integer> LBD) throws IllegalStateException {
		// prints the last element
		System.out.println("Linked Blocking Deque last element: " + LBD.getLast());
	}

	// iteratorLBD() method returns an iterator over the elements in this deque in
	// proper sequence
	public static void iteratorLBD(LinkedBlockingDeque<Integer> LBD) {

		// Call iterator() method of LinkedBlockingDeque
		Iterator<Integer> iteratorVals = LBD.iterator();

		// Print elements of iterator
		// created from PriorityBlockingQueue
		System.out.println("\nThe iterator values" + " of LinkedBlockingDeque are:");

		// prints the elements using an iterator
		while (iteratorVals.hasNext()) {
			System.out.print(iteratorVals.next() + "\t");
		}
		System.out.println("");
	}

	// This method retrieves, but does not remove, the head of the queue represented
	public static void peekLBD(LinkedBlockingDeque<Integer> LBD) {
		// prints the Deque after removal
		System.out.println("Front element in Deque: " + LBD.peek());
	}

	// remove() method retrieves and removes the head of the queue represented by
	// this deque
	public static void removeLBD(LinkedBlockingDeque<Integer> LBD) throws InterruptedException {
		// removes the front element
		LBD.remove();
		System.out.println("Linked Blocking Deque after using remove() method: " + LBD);
	}

	// size() method returns the number of elements in this deque
	public static void sizeLBD(LinkedBlockingDeque<Integer> LBD) throws InterruptedException {
		// prints the Deque after removal
		System.out.println("Size of Linked Blocking Deque: " + LBD.size());
		System.out.println("");
	}

	// This method retrieves and removes the head of the queue represented by this
	// deque
	public static void takeLBD(LinkedBlockingDeque<Integer> LBD) throws InterruptedException {
		// print Dequeue
		System.out.println("\nLinked Blocking Deque: " + LBD);

		// removes the front element and prints it
		System.out.println("Head of Linked Blocking Deque: " + LBD.take());
		// prints the Deque
		System.out.println("Linked Blocking Deque after using take() method: " + LBD);
	}

	// This method returns a string representation of this collection
	public static void toStringLBD(LinkedBlockingDeque<Integer> LBD) {

		System.out.println("LBD in string " + LBD.toString());
	}

	// main
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LinkedBlockingDeque<Integer> LBD = new LinkedBlockingDeque<Integer>();

		addLBD(LBD);
		sizeLBD(LBD);

		addFirstLBD(LBD);
		System.out.println("LinkedBlockingDeque after using addFirst() method: ");
		showLBD(LBD);
		sizeLBD(LBD);

		addLastLBD(LBD);
		System.out.println("LinkedBlockingDeque after using addLast() method: ");
		showLBD(LBD);
		sizeLBD(LBD);

		showLBD(LBD);
		peekLBD(LBD);
		removeLBD(LBD);
		sizeLBD(LBD);

		takeLBD(LBD);
		sizeLBD(LBD);

		System.out.println("\nCreate copy deque to use clear() method");
		LinkedBlockingDeque<Integer> temp_deque = new LinkedBlockingDeque<Integer>();
		CopyLBD(LBD, (LinkedBlockingDeque<Integer>) temp_deque);
		System.out.println("LinkedBlockingDeque after using clear() method: ");
		clearLBD((LinkedBlockingDeque<Integer>) temp_deque);

		containsLBD(LBD);

		iteratorLBD(LBD);

		getElementLBD(LBD);
		getFirstElementLBD(LBD);
		getLastElementLBD(LBD);

		toStringLBD(LBD);
		sizeLBD(LBD);

		return;

	}

}
