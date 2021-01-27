package JSE_Group10;

import java.util.*;

/**
 * <b>ArrayDeque</b> <br/>
 * <i>update 05/06/2020</i>
 * 
 * @author Group 10
 *
 */
public class arrayDeque {
	static Scanner sc = new Scanner(System.in);

	// intializing an integer Deque
	public static Deque<Integer> intializingIntegerDeque() {

		// Creating an empty ArrayDeque
		Deque<Integer> de_que = new ArrayDeque<Integer>();

		return de_que;
	}

	// add element into the ArrayDeque
	public static Deque<Integer> addDeque(Deque<Integer> de_que) {
		// Use add() method to add elements into the ArrayDeque

		System.out.println("Add value for the ArrayDeque (value = 000 to stop):");
		while (true) {
			System.out.print("Add value: ");
			int addValue = sc.nextInt();
			if (addValue == 000)
				break;
			de_que.add(addValue);
		}

		showDeque(de_que);

		return de_que;
	}

	// Displaying the ArrayDeque
	public static void showDeque(Deque<Integer> de_que) {
		System.out.println("ArrayDeque: " + de_que);
		System.out.println("");
	}

	// addFirstDeque() method to add element to the beginning of ArrayDeque
	public static Deque<Integer> addFirstDeque(Deque<Integer> de_que) {
		// n is the number of digits used for use with the addfirst () method
		System.out.print("Number of value to use with addFirst: ");
		int n = sc.nextInt();

		// Adding elements at the beggining
		System.out.println("Type value you want to use with addFirst(): ");
		for (int i = 0; i < n; i++) {
			de_que.addFirst(sc.nextInt());
		}

		return de_que;
	}

	// addLastDeque() method to add element to the end of ArrayDeque
	public static Deque<Integer> addLastDeque(Deque<Integer> de_que) {
		// n is the number of digits used for use with the addfirst () method
		System.out.print("Number of value to use with addLast: ");
		int n = sc.nextInt();

		// Adding elements at the beggining
		System.out.println("Type value you want to use with addLast(): ");
		for (int i = 0; i < n; i++) {
			de_que.addLast(sc.nextInt());
		}

		return de_que;
	}

	// create a deep copy ArrayDeque (new memory)
	public static Deque<Integer> deepCopyDeQue(Deque<Integer> de_que, Deque<Integer> copy_de_que) {

		for (int value : de_que) {
			copy_de_que.add(value);
		}

		showDeque(copy_de_que);

		return copy_de_que;
	}

	/*
	 * empty ArrayDeque / this method clears all element of array but does not
	 * delete Deque
	 */
	public static Deque<Integer> clearDeQue(Deque<Integer> de_que) {

		// Clearing the ArrayDeque
		de_que.clear();

		showDeque(de_que);
		return de_que;
	}

	// show size of ArrayDeque
	public static void sizeDeque(Deque<Integer> de_que) {

		// Displaying the size of ArrayDeque
		System.out.println("The size of de_que is: " + de_que.size());
	}

	// check or verify whether a specific element is present in the ArrayDeque or
	// not
	public static void containsDeque(Deque<Integer> de_que) {
		System.out.print("check deque with value: ");

		int x = sc.nextInt();

		System.out.println(de_que.contains(x));
		System.out.println("");
	}

	// return an iterator of the elements of the ArrayDeque.
	public static void iteratorDeque(Deque<Integer> de_que) {

		// Creating an iterator
		Iterator<Integer> value = de_que.iterator();

		// Displaying the values after iterating through the ArrayDeque
		System.out.println("The iterator values are: ");
		while (value.hasNext()) {
			System.out.print(value.next() + "\t");
		}
		System.out.println("");
	}

	// return an iterator of the elements of the ArrayDeque in descending order
	public static void descendingIteratorDeque(Deque<Integer> de_que) {

		// Creating a desc_iterator
		Iterator<Integer> value = de_que.descendingIterator();

		// Displaying the values after iterating through the ArrayDeque
		// in reverse order
		System.out.println("The iterator values are: ");
		while (value.hasNext()) {
			System.out.print(value.next() + "\t");
		}
		System.out.println("");
	}

	// retrieve or fetch the head of the ArrayDeque
	public static void fetchHeadArrayDeque(Deque<Integer> de_que) {
		// Displaying the head
		System.out.println("The head element is: " + de_que.element());
		System.out.println("");
	}

	// get the first element of ArrayDeque
	public static void getFirstElement(Deque<Integer> de_que) {
		// Displaying the first element
		System.out.println("The first element is: " + de_que.getFirst());
		System.out.println("");
	}

	// get the last element of ArrayDeque
	public static void getLastElement(Deque<Integer> de_que) {
		// Displaying the first element
		System.out.println("The last element is: " + de_que.getLast());
		System.out.println("");
	}

	// Verifying if the ArrayDeque is empty or not
	public static void isEmpty(Deque<Integer> de_que) {
		System.out.println("Check Deque empty: " + de_que.isEmpty());
		System.out.println("");
	}

	// form an array of the same elements as that of the ArrayDeque
	public static void toArray(Deque<Integer> de_que) {
		// Creating the array and using toArray()
		Object[] arr = de_que.toArray();

		System.out.println("The array is:");
		for (int j = 0; j < arr.length; j++)
			System.out.print(arr[j] + "\t");
		System.out.println("");
		System.out.println("");
	}

	// main
	public static void main(String[] args) {
		Deque<Integer> de_que = intializingIntegerDeque();

		addDeque(de_que);

		addFirstDeque(de_que);

		System.out.println("ArrayDeque after using addFirst() method: ");
		showDeque(de_que);

		addLastDeque(de_que);

		System.out.println("ArrayDeque after using addLast() method: ");
		showDeque(de_que);

		System.out.println("create copy deque to use clear() method: ");
		Deque<Integer> minor_de_que = intializingIntegerDeque();
		deepCopyDeQue(de_que, minor_de_que);
		System.out.println("deque after using clear():");
		clearDeQue(minor_de_que);

		sizeDeque(de_que);

		containsDeque(de_que);

		iteratorDeque(de_que);

		descendingIteratorDeque(de_que);

		fetchHeadArrayDeque(de_que);

		getFirstElement(de_que);

		getLastElement(de_que);

		// check empty
		System.out.println("create empty deque to use isEmpty() method: ");
		Deque<Integer> empty_de_que = intializingIntegerDeque();
		showDeque(empty_de_que);

		isEmpty(empty_de_que);

		toArray(de_que);

		return;
	}

}
