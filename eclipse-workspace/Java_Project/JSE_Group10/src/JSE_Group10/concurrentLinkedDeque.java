package JSE_Group10;

import java.util.Deque;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedDeque;

public class concurrentLinkedDeque {

	static Scanner sc = new Scanner(System.in);

	// intializing an integer Deque
	public static Deque<Integer> intializingIntegerCld() {

		// Creating an empty ArrayDeque
		Deque<Integer> cld = new ConcurrentLinkedDeque<Integer>();

		return cld;
	}

	/**
	 * <b>Display on the console screen </b>
	 * 
	 * @param cld
	 */
	// Displaying the ConcurrentLinkedDeque
	public static void showCld(Deque<Integer> cld) {
		// Displaying the existing LinkedDeque
		System.out.println("Initial Elements in" + "the LinkedDeque: " + cld);
		System.out.println("");
	}

	/**
	 * <b>Add 1 or more elements (entered by the user) and display them on the
	 * Console.</b>
	 * 
	 * @param cld The method accepts only a single parameter elem which is to be
	 *            added to tail of the ConcurentLinkedDeque.
	 * @return The function has no return value.
	 */

	// add element into the Deque
	public static Deque<Integer> addCld(Deque<Integer> cld) {

		System.out.println("Add value for the ConcurrentLinkedDeque (If value = 0 => Stop).");
		while (true) {
			System.out.print("Add value: ");
			int addValue = sc.nextInt();
			if (addValue == 0)
				break;
			cld.add(addValue);
		}

		showCld(cld);

		return cld;
	}

	/**
	 * <b> Add 1 or more elements (entered by the user) that are entered at the
	 * beginning of the deque.</b>
	 * 
	 * @param cld The method accepts only a single parameter elem which is to be
	 *            added to at the front of the ConcurentLinkedDeque.
	 * @return The function has no return value.
	 */

	// addFirstCld() method to add element to the beginning of the Deque
	public static Deque<Integer> addFirstCld(Deque<Integer> cld) {
		// n is the number of digits used for use with the addFirst () method
		System.out.print("Number of value to use with addFirst: ");
		int n = sc.nextInt();

		// Adding elements at the begining
		System.out.println("Type value you want to use with addFirst(): ");
		for (int i = 0; i < n; i++) {
			cld.addFirst(sc.nextInt());
		}
		return cld;
	}

	/**
	 * <b>add 1 or more elements (entered by the user) that are entered at the end
	 * of the deque</b>
	 * 
	 * @param cld The method accepts only a single parameter elem which is to be
	 *            added to tail of the ConcurentLinkedDeque.
	 * @return The function has no return value.
	 */

	// addLastCld() method to add element to the end of the Deque
	public static Deque<Integer> addLastCld(Deque<Integer> cld) {
		// n is the number of digits used for use with the addlast () method
		System.out.print("Number of value to use with addLast: ");
		int n = sc.nextInt();

		// Adding elements at the begining
		System.out.println("Type value you want to use with addLast(): ");
		for (int i = 0; i < n; i++) {
			cld.addLast(sc.nextInt());
		}

		return cld;
	}

	/**
	 * <b> This method Retrieves, but does not remove, the first element of this
	 * deque.</b>
	 * 
	 * @param cld The method does not accept any parameter.
	 * @return The method returns the first element present in the Deque.
	 */

	public static void getFirstCld(Deque<Integer> cld) {
		try {
			// Displaying the first element
			System.out.println("The first element " + "is: " + cld.getFirst());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * <b>This method Retrieves, but does not remove, the last element of this
	 * deque.</b>
	 * 
	 * @param cld The method does not accept any parameter.
	 * @return The method returns the last element present in the Deque.
	 */

	public static void getLastCld(Deque<Integer> cld) {
		try {
			// Displaying the Last element
			System.out.println("The Last element " + "is: " + cld.getLast());
		} catch (Exception e) {
			// Displaying the Exception
			System.out.println(e);
		}
	}

	/**
	 * <b>This method Inserts the specified element at the tail of this deque.</b>
	 * 
	 * @param cld The method accepts a parameter elem which species the element to
	 *            be inserted to the front of the deque.
	 * @return The function returns True if the element is successfully added into
	 *         the deque and returns False otherwise.
	 */
	public static void offerCld(Deque<Integer> cld) {

		System.out.print("Value to use with offer: ");
		int x = sc.nextInt();

		// Using offer() to add elements
		cld.offer(x);
		System.out.println("");
		// Displaying the ArrayDeque
		showCld(cld);
	}

	/**
	 * <b>Insert the entered element in front of the deque</b>
	 * 
	 * @param cld The method accepts a parameter elem which species the element to
	 *            be inserted to the end of the deque.
	 * @return The function returns True if the element is successfully added into
	 *         the deque and returns False otherwise.
	 */

	public static void offerFirstCld(Deque<Integer> cld) {

		System.out.print("Value to use with offerFirst: ");
		int y = sc.nextInt();
		// Displaying the First element

		try {
			cld.offerFirst(null);
		} catch (Exception e) {
			System.out.println(e);
		}

		/*
		 * Insert an element at the front of the deque
		 */
		if (cld.offerFirst(y)) {
			// Displaying the First element
			System.out.println("The Inserted element is: " + cld.getFirst());
		}

		// Displaying the Deque
		System.out.println("Elements in Deque: " + cld);

		// Displaying the First element
		System.out.println("The First element is: " + cld.getFirst());
	}

	/**
	 * <b> Insert the entered element at the end of the deque</b>
	 * 
	 * @param cld The method accepts a parameter elem which species the element to
	 *            be inserted to the end of the deque.
	 * @return The function returns True if the element is successfully added into
	 *         the deque and returns False otherwise.
	 */

	public static void offerLastCld(Deque<Integer> cld) {

		System.out.print("Value to use with offerLast: ");
		int z = sc.nextInt();

		try {
			cld.offerLast(null);
		} catch (Exception e) {
			System.out.println(e);
		}

		/*
		 * Insert an element at the tail of the deque
		 */
		if (cld.offerLast(z)) {
			// Displaying the Last element
			System.out.println("The Inserted element is: " + cld.getLast());
		}

		// Displaying the Deque
		System.out.println("Elements in Deque: " + cld);

		// Displaying the Last element
		System.out.println("The Last element is: " + cld.getLast());
	}

	/**
	 * <b>This method Retrieves, but does not remove, the first element of this
	 * deque, or returns null if this deque is empty.</b>
	 * 
	 * @param cld This function does not accepts any parameter.
	 * @return The function returns the first element present in this deque and
	 *         returns NULL when the deque is empty.
	 */

	public static void peekFirstCld(Deque<Integer> cld) {

		// Displaying the first element
		System.out.println("First Element in" + "the LinkedDeque: " + cld.peekFirst());
	}

	/**
	 * <b>This method Retrieves, but does not remove, the last element of this
	 * deque, or returns null if this deque is empty.</b>
	 * 
	 * @param cld This function does not accepts any parameter.
	 * @return The function returns the last element present in this deque and
	 *         returns NULL when the deque is empty.
	 */

	public static void peekLastCld(Deque<Integer> cld) {

		// Displaying the last element
		System.out.println("Last Element in" + "the LinkedDeque: " + cld.peekLast());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> cld = intializingIntegerCld();
		addCld(cld);

		addFirstCld(cld);
		System.out.println("ArrayDeque after using addFirst() method: ");
		showCld(cld);

		addLastCld(cld);
		System.out.println("ArrayDeque after using addLast() method: ");
		showCld(cld);

		getFirstCld(cld);
		getLastCld(cld);
		offerCld(cld);
		offerFirstCld(cld);
		offerLastCld(cld);
		System.out.println("\nElements in" + "the LinkedDeque: " + cld);
		peekFirstCld(cld);
		peekLastCld(cld);

		return;
	}
}
