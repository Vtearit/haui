package LinkedBlockingDeque_Topic;
import java.util.concurrent.*;
import java.lang.Object;

public class ConcurrentLinkedDeque {

	/**
	 * <b>java.util.concurrent.ConcurrentLinkedDeque.add():</b><br>
	 * is an in-built function in Java which inserts the specified element at the
	 * end of the deque.<br>
	 * <b>Syntax:</b><br>
	 * <u>conn_linked_deque.add(elem)</u><br>
	 * <b> Return Value:</b> The function has no return value.<br>
	 * <b>Exception:</b> The method will throw NullPointerException when the
	 * parameter passed to the function is null. Due to its bounded nature, this
	 * method will never throw IllegalStateException or return false.
	 * 
	 * @param cld The method accepts only a single parameter elem which is to be
	 *            added to tail of the ConcurentLinkedDeque.
	 */

	public static void add() {
		ConcurrentLinkedDeque<Integer> cld = new ConcurrentLinkedDeque<Integer>();

		cld.add(12);
		cld.add(110);
		cld.add(55);
		cld.add(76);

		// Displaying the existing LinkedDeque
		System.out.println("Initial Elements in" + "the LinkedDeque: " + cld);

		// Insert a new element in the LinkedDeque
		cld.add(21);

		// Displaying the modified LinkedDeque
		System.out.println("Initial Elements in" + "the LinkedDeque: " + cld);
	}

	/**
	 * <b>jjava.util.concurrent.ConcurrentLinkedDeque.add():</b><br>
	 * is an in-built function in Java which inserts the specified element at the
	 * end of the deque.<br>
	 * <b>Syntax:</b><br>
	 * <u>conn_linked_deque.add(elem)</u><br>
	 * <b> Return Value:</b> The function has no return value.<br>
	 * <b>Exception:</b> The method will throw NullPointerException when the
	 * parameter passed to the function is null. Due to its bounded nature, this
	 * method will never throw IllegalStateException or return false.
	 * 
	 * @param cld The method accepts only a single parameter elem which is to be
	 *            added to tail of the ConcurentLinkedDeque.
	 */

	public static void addString() {
		ConcurrentLinkedDeque<String> cld = new ConcurrentLinkedDeque<String>();

		cld.add("Gfg");
		cld.add("GFG");
		cld.add("Geeksforgeeks");
		cld.add("Contribute");

		// Displaying the existing LinkedDeque
		System.out.println("Initial Elements in" + "the LinkedDeque: " + cld);

		/*
		 * Exception thrown when null is passed as parameter
		 */
		try {
			cld.add(null);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException" + "thrown");
		}

		// Insert a new element in the LinkedDeque
		cld.add("Geek Classes");
		// Displaying the modified LinkedDeque
		System.out.println("Initial Elements in" + "the LinkedDeque: " + cld);
	}

	/**
	 * <b> java.util.concurrent.ConcurrentLinkedDeque.addLast():</b><br>
	 * is an in-built function in Java which inserts the specified element to the
	 * end of the deque.<br>
	 * <b>Syntax:</b><br>
	 * <u>conn_linked_deque.addLast(elem)</u><br>
	 * <b> Return Value:</b> The function has no return value.<br>
	 * <b>Exception:</b> The method will throw NullPointerException when the
	 * parameter passed to the function is null. Due to its bounded nature, this
	 * method will never throw IllegalStateException or return false.
	 * 
	 * @param cld The method accepts only a single parameter elem which is to be
	 *            added to the end of the ConcurrentLinkedDeque.
	 */

	public static void addLast() {
		ConcurrentLinkedDeque<Integer> cld = new ConcurrentLinkedDeque<Integer>();
		cld.addLast(12);
		cld.addLast(110);
		cld.addLast(55);
		cld.addLast(76);

		// Displaying the existing LinkedDeque
		System.out.println("Initial Elements in" + "the LinkedDeque: " + cld);

		// Insert a new element in the LinkedDeque
		cld.addLast(21);

		// Displaying the modified LinkedDeque
		System.out.println("Initial Elements in" + "the LinkedDeque: " + cld);
	}

	/**
	 * <b> java.util.concurrent.ConcurrentLinkedDeque.addLast():</b><br>
	 * is an in-built function in Java which inserts the specified element to the
	 * end of the deque.<br>
	 * <b>Syntax:</b><br>
	 * <u>conn_linked_deque.addLast(elem)</u><br>
	 * <b> Return Value:</b> The function has no return value.<br>
	 * <b>Exception:</b> The method will throw NullPointerException when the
	 * parameter passed to the function is null. Due to its bounded nature, this
	 * method will never throw IllegalStateException or return false.
	 * 
	 * @param cld The method accepts only a single parameter elem which is to be
	 *            added to the end of the ConcurrentLinkedDeque.
	 */

	public static void addLastString() {
		ConcurrentLinkedDeque<String> cld = new ConcurrentLinkedDeque<String>();

		cld.addLast("Geeks");
		cld.addLast("Geek");
		cld.addLast("Gfg");
		cld.addLast("Contribute");

		// Displaying the existing LinkedDeque
		System.out.println("Initial Elements in" + "the LinkedDeque: " + cld);

		/*
		 * Exception thrown when null is passed as parameter
		 */
		try {
			cld.addLast(null);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException" + "thrown");
		}

		// Insert a new element in the LinkedDeque
		cld.addLast("Sudo Placement");

		// Displaying the modified LinkedDeque
		System.out.println("Initial Elements in" + "the LinkedDeque: " + cld);
	}

	/**
	 * <b>java.util.concurrent.ConcurrentLinkedDeque.getFirst():</b><br>
	 * method is an in-built method in Java which returns the first element of the
	 * deque container.<br>
	 * <b>Syntax:</b><br>
	 * <u>Conn_Linked_Deque.getFirst()</u><br>
	 * <b> Return Value:</b> The method returns the first element present in the
	 * Deque. <br>
	 * <b>Exception:</b>The function throws a NoSuchElementException when the deque
	 * is empty.
	 * 
	 * 
	 * @param cld The method does not accept any parameter.
	 * 
	 */

	public static void getFirst() {
		// Creating an empty Deque
		ConcurrentLinkedDeque<Integer> cld = new ConcurrentLinkedDeque<Integer>();

		try {
			// Displaying the first element
			System.out.println("The first element " + "is: " + cld.getFirst());
		} catch (Exception e) {
			System.out.println(e);
		}

		// Add elements into the Deque
		cld.add(12);
		cld.add(43);
		cld.add(29);
		cld.add(16);
		cld.add(70);

		// Displaying the Deque
		System.out.println("Elements in the Deque: " + cld);

		// Displaying the first element
		System.out.println("The first element is: " + cld.getFirst());
	}

	/**
	 * <b>java.util.concurrent.ConcurrentLinkedDeque.getFirst():</b><br>
	 * method is an in-built method in Java which returns the first element of the
	 * deque container.<br>
	 * <b>Syntax:</b><br>
	 * <u>Conn_Linked_Deque.getFirst()</u><br>
	 * <b> Return Value:</b> The method returns the first element present in the
	 * Deque. <br>
	 * <b>Exception:</b>The function throws a NoSuchElementException when the deque
	 * is empty.
	 * 
	 * 
	 * @param cld The method does not accept any parameter.
	 * 
	 */

	public static void getFirstString() {
		// Creating an empty Deque
		ConcurrentLinkedDeque<String> cld = new ConcurrentLinkedDeque<String>();

		// Add elements into the Deque
		cld.add("Welcome");
		cld.add("To");
		cld.add("Geeks");
		cld.add("4");
		cld.add("Geeks");

		// Displaying the Deque
		System.out.println("Elements in the Deque: " + cld);

		// Displaying the first element
		System.out.println("The first element is: " + cld.getFirst());
	}

	/**
	 * <b>java.util.concurrent.ConcurrentLinkedDeque.getLast():</b><br>
	 * method is an in-built method in Java which returns the last element of the
	 * deque container.<br>
	 * <b>Syntax:</b><br>
	 * <u>Conn_Linked_Deque.getLast()</u><br>
	 * <b> Return Value:</b> The method returns the last element present in the
	 * Deque. <br>
	 * <b>Exception:</b>The function throws a NoSuchElementException when the deque
	 * is empty.
	 * 
	 * @param cld The method does not accept any parameter.
	 */

	public static void getlast() {
		// Creating an empty Deque
		ConcurrentLinkedDeque<Integer> cld = new ConcurrentLinkedDeque<Integer>();

		try {
			// Displaying the Last element
			System.out.println("The Last element " + "is: " + cld.getLast());
		} catch (Exception e) {
			// Displaying the Exception
			System.out.println(e);
		}

		// Add elements into the Deque
		cld.add(12);
		cld.add(43);
		cld.add(29);
		cld.add(16);
		cld.add(70);

		// Displaying the Deque
		System.out.println("Elements in " + "Deque: " + cld);

		// Displaying the Last element
		System.out.println("The Last element is: " + cld.getLast());
	}

	/**
	 * <b>java.util.concurrent.ConcurrentLinkedDeque.getLast():</b><br>
	 * method is an in-built method in Java which returns the last element of the
	 * deque container.<br>
	 * <b>Syntax:</b><br>
	 * <u>Conn_Linked_Deque.getLast()</u><br>
	 * <b> Return Value:</b> The method returns the last element present in the
	 * Deque. <br>
	 * <b>Exception:</b>The function throws a NoSuchElementException when the deque
	 * is empty.
	 * 
	 * @param cld The method does not accept any parameter.
	 */

	public static void getlastString() {

		// Creating an empty Deque
		ConcurrentLinkedDeque<String> cld = new ConcurrentLinkedDeque<String>();

		// Add elements into the Deque
		cld.add("Welcome");
		cld.add("To");
		cld.add("Geeks");
		cld.add("4");
		cld.add("Geeks");

		// Displaying the Deque
		System.out.println("Elements in Deque: " + cld);

		// Displaying the Last element
		System.out.println("The Last element is: " + cld.getLast());
	}

	/**
	 * <b>java.util.concurrent.ConcurrentLinkedDeque.removeFirstOccurrence():</b><br>
	 * mmethod is an in-built method in Java which accepts a parameter and removes
	 * the first appearance of that element in the deque. Thus, in case the element
	 * is not present in the deque, it remains unchanged.<br>
	 * <b>Syntax:</b><br>
	 * <u>public_boolean_removeFirstOccurrence(Object o)</u><br>
	 * <b> Return Value:</b> The function returns true if elem is present in th
	 * edeque and returns false otherwise. <br>
	 * <b>Exception:</b>The function throws NullPointerException if the specified
	 * element passed as parameter to the function is null.
	 * 
	 * @param cld The function accepts an object elem as parameter which denotes the
	 *            object whose first appearance from the deque is to be removed.
	 */

	public static void removeFirstOccurrence() {

		ConcurrentLinkedDeque<Integer> cld = new ConcurrentLinkedDeque<Integer>();

		cld.addFirst(12);
		cld.addFirst(280);
		cld.addFirst(1008);
		cld.addFirst(1050);
		cld.addFirst(379);

		// Displaying the existing LinkedDeque
		System.out.println("Elements in " + "the LinkedDeque: " + cld);
		try {
			// Remove first occurrence of element
			cld.removeFirstOccurrence(null);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	/**
	 * <b>java.util.concurrent.ConcurrentLinkedDeque.removeFirstOccurrence():</b><br>
	 * mmethod is an in-built method in Java which accepts a parameter and removes
	 * the first appearance of that element in the deque. Thus, in case the element
	 * is not present in the deque, it remains unchanged.<br>
	 * <b>Syntax:</b><br>
	 * <u>public_boolean_removeFirstOccurrence(Object o)</u><br>
	 * <b> Return Value:</b> The function returns true if elem is present in th
	 * edeque and returns false otherwise. <br>
	 * <b>Exception:</b>The function throws NullPointerException if the specified
	 * element passed as parameter to the function is null.
	 * 
	 * @param cld The function accepts an object elem as parameter which denotes the
	 *            object whose first appearance from the deque is to be removed.
	 */


	public static void removeFirstOccurrenceString() {
		ConcurrentLinkedDeque<String> cld = new ConcurrentLinkedDeque<String>();

		cld.addFirst("GFG");
		cld.addFirst("Geeks");
		cld.addFirst("Gfg");
		cld.addFirst("gfg");
		cld.addFirst("Geeks");

		// Displaying the existing LinkedDeque
		System.out.println("Elements in " + "the LinkedDeque: " + cld);

		// Remove first occurrence of element
		cld.removeFirstOccurrence("Geeks");

		// Displaying the modified LinkedDeque
		System.out.println("Elements in " + "the LinkedDeque: " + cld);
	}

	public static void main(String[] args) {
		removeFirstOccurrence();
		removeFirstOccurrenceString();
		add();
		addString();
		addLast();
		addLastString();
		getFirst();
		getFirstString();
		getlast();
		getlastString();


		}

	}

