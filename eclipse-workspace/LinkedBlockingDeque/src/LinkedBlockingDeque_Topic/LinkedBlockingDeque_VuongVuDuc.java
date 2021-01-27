package LinkedBlockingDeque_Topic;
//Edit: Group of 10

import java.lang.Object;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.*;

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

public class LinkedBlockingDeque_VuongVuDuc {
	/**
	 * 
	 * Java Program Demonstrate add() method of LinkedBlockingDeque
	 * 
	 * @throws IllegalStateException
	 * 
	 * 
	 */

	public static LinkedBlockingDeque<Integer> intializingIntegerLinkedBlockingDeque() {

		// Creating an empty ArrayDeque
		LinkedBlockingDeque<Integer> LBD = new LinkedBlockingDeque<Integer>();

		// Use add() method to add elements into the Deque
		LBD.add(7855642);
		LBD.add(35658786);
		LBD.add(5278367);
		LBD.add(74381793);

		showDeque(LBD);

		return LBD;
	}
	
    // Displaying the LinkedBlockingDeque
    public static void showDeque(LinkedBlockingDeque<Integer> LBD) {
        System.out.println("ArrayDeque: " + LBD);
        System.out.println("");
    }

	public static void add() {
		// create object of LinkedBlockingDeque
		LinkedBlockingDeque<Integer> LBD = new LinkedBlockingDeque<Integer>();

		// Add numbers to end of LinkedBlockingDeque
		LBD.add(7855642);
		LBD.add(35658786);
		LBD.add(5278367);
		LBD.add(74381793);

		// before removing print queue
		System.out.println("Linked Blocking Deque: " + LBD);
	}

	/**
	 * 
	 * Java Program Demonstrate addFirst() method of LinkedBlockingDeque
	 * 
	 * @throws IllegalStateException
	 */

	public static void addFirst() throws IllegalStateException {

		// create object of LinkedBlockingDeque
		LinkedBlockingDeque<Integer> LBD = new LinkedBlockingDeque<Integer>();

		// Add numbers to front of LinkedBlockingDeque
		LBD.addFirst(1234);
		LBD.addFirst(2345);
		LBD.addFirst(3456);
		LBD.addFirst(4567);

		// before removing print queue
		System.out.println("Linked Blocking Deque: " + LBD);
	}

	/**
	 * Java Program Demonstrate addLast() method of LinkedBlockingDeque
	 * 
	 * @throws IllegalStateException
	 */

	public static void addLast() throws IllegalStateException {

		// create object of LinkedBlockingDeque
		LinkedBlockingDeque<Integer> LBD = new LinkedBlockingDeque<Integer>();

		// Add numbers to end of LinkedBlockingDeque
		LBD.addLast(7855642);
		LBD.addLast(35658786);
		LBD.addLast(5278367);
		LBD.addLast(74381793);

		// before removing print queue
		System.out.println("Linked Blocking Deque: " + LBD);
	}

	/**
	 * Java Program Demonstrate add() method of LinkedBlockingDeque
	 * 
	 * @throws IllegalStateException
	 */
	public static void clear() throws IllegalStateException {

		// create object of LinkedBlockingDeque
		LinkedBlockingDeque<Integer> LBD = new LinkedBlockingDeque<Integer>();

		// Add numbers to end of LinkedBlockingDeque
		LBD.add(7855642);
		LBD.add(35658786);
		LBD.add(5278367);
		LBD.add(74381793);

		// before using erase() function
		System.out.println("Linked Blocking Deque: " + LBD);

		LBD.clear();
		// after using erase() function
		System.out.println("Linked Blocking Deque: " + LBD);
	}

	/**
	 * Java Program Demonstrate contains() method of LinkedBlockingDeque
	 * 
	 * @throws IllegalStateException
	 */
	public static void contains() throws IllegalStateException {

		// create object of LinkedBlockingDeque
		LinkedBlockingDeque<Integer> LBD = new LinkedBlockingDeque<Integer>();

		// Add numbers to end of LinkedBlockingDeque
		LBD.add(10);
		LBD.add(20);
		LBD.add(30);
		LBD.add(40);

		// before removing print queue
		System.out.println("Linked Blocking Deque: " + LBD);

		// check for presence using function
		if (LBD.contains(10)) {
			System.out.println("Linked Blocking Deque contains 10");
		} else {
			System.out.println("Linked Blocking Deque does not contain 10");
		}
	}

	/**
	 * Java Program Demonstrate element() method of LinkedBlockingDeque
	 * 
	 * @throws IllegalStateException
	 */
	public static void element() throws IllegalStateException {

		// create object of LinkedBlockingDeque
		LinkedBlockingDeque<Integer> LBD = new LinkedBlockingDeque<Integer>();

		// Add numbers to end of LinkedBlockingDeque
		LBD.add(10);
		LBD.add(20);
		LBD.add(30);
		LBD.add(40);

		// before removing print queue
		System.out.println("Linked Blocking Deque: " + LBD);

		System.out.println("Linked Blocking Deque front element: " + LBD.element());
	}

	/**
	 * Java Program Demonstrate getFirst() method of LinkedBlockingDeque
	 * 
	 * @throws IllegalStateException
	 */
	public static void getFirst() throws IllegalStateException {

		// create object of LinkedBlockingDeque
		LinkedBlockingDeque<Integer> LBD = new LinkedBlockingDeque<Integer>();

		// Add numbers to front of LinkedBlockingDeque
		LBD.addFirst(7855642);
		LBD.addFirst(35658786);
		LBD.addFirst(5278367);
		LBD.addFirst(74381793);

		// before removing print queue
		System.out.println("Linked Blocking Deque: " + LBD);

		// prints the first element
		System.out.println("Linked Blocking Deque first element: " + LBD.getFirst());
	}

	/**
	 * Java Program Demonstrate getLast() method of LinkedBlockingDeque
	 * 
	 * @throws IllegalStateException
	 */

	public static void getLast() throws IllegalStateException {

		// create object of LinkedBlockingDeque
		LinkedBlockingDeque<Integer> LBD = new LinkedBlockingDeque<Integer>();

		// Add numbers to front of LinkedBlockingDeque
		LBD.addFirst(7855642);
		LBD.addFirst(35658786);
		LBD.addFirst(5278367);
		LBD.addFirst(74381793);

		// before removing print queue
		System.out.println("Linked Blocking Deque: " + LBD);

		// prints the last element
		System.out.println("Linked Blocking Deque first element: " + LBD.getLast());
	}

	/**
	 * Java Program Demonstrate iterator() method of LinkedBlockingDeque
	 * 
	 * 
	 */
	public static void iterator() {

		// create object of LinkedBlockingDeque
		LinkedBlockingDeque<Integer> LBD = new LinkedBlockingDeque<Integer>();

		// Add numbers to front of LinkedBlockingDeque
		LBD.addFirst(7855642);
		LBD.addFirst(35658786);
		LBD.addFirst(5278367);
		LBD.addFirst(74381793);

		// Call iterator() method of LinkedBlockingDeque
		Iterator iteratorVals = LBD.iterator();

		// Print elements of iterator
		// created from PriorityBlockingQueue
		System.out.println("The iterator values" + " of LinkedBlockingDeque are:");

		// prints the elements using an iterator
		while (iteratorVals.hasNext()) {
			System.out.println(iteratorVals.next());
		}
	}

	/**
	 * Java Program Demonstrate offer() method of LinkedBlockingDeque
	 * 
	 * This method inserts the specified element into the queue represented by this
	 * deque (in other words, at the tail of this deque) if it is possible to do so
	 * immediately without violating capacity restrictions, returning true upon
	 * success and false if no space is currently available
	 * 
	 * @param args
	 * @throws IllegalStateException
	 */
	public static void offer() throws IllegalStateException {

		// create object of LinkedBlockingDeque
		LinkedBlockingDeque<Integer> LBD = new LinkedBlockingDeque<Integer>(4);

		// Add numbers to end of LinkedBlockingDeque
		LBD.offer(7855642);
		LBD.offer(35658786);
		LBD.offer(5278367);
		LBD.offer(74381793);

		// Cannot be inserted
		LBD.offer(10);

		// cannot be inserted hence returns false
		if (!LBD.offer(10))
			System.out.println("The element 10 cannot be inserted" + " as capacity is full");

		// before removing print queue
		System.out.println("Linked Blocking Deque: " + LBD);
	}

	public static void toString(String[] args)

	{

		// create object of LinkedBlockingDeque
		LinkedBlockingDeque<Integer> LBD = new LinkedBlockingDeque<Integer>();

		// Add numbers to end of LinkedBlockingDeque
		LBD.add(7855642);
		LBD.add(35658786);
		LBD.add(5278367);
		LBD.add(74381793);

		// Print the queue
		System.out.println("Linked Blocking Deque: " + LBD);

		System.out.println("LBD in string " + LBD.toString());
	}

	public static void put(String[] args) throws InterruptedException {

		// create object of LinkedBlockingDeque
		LinkedBlockingDeque<Integer> LBD = new LinkedBlockingDeque<Integer>();

		// Add numbers to end of LinkedBlockingDeque
		LBD.put(7855642);
		LBD.put(35658786);
		LBD.put(5278367);
		LBD.put(74381793);

		// print Dequeue
		System.out.println("Linked Blocking Deque: " + LBD);
	}

	public static void remove(String[] args) throws InterruptedException {

		// create object of LinkedBlockingDeque
		LinkedBlockingDeque<Integer> LBD = new LinkedBlockingDeque<Integer>();

		// Add numbers to end of LinkedBlockingDeque
		LBD.add(7855642);
		LBD.add(35658786);
		LBD.add(5278367);
		LBD.add(74381793);

		// print Dequeue
		System.out.println("Linked Blocking Deque: " + LBD);

		// removes the front element
		LBD.remove();
		System.out.println("Linked Blocking Deque: " + LBD);
	}

	public static void size(String[] args) throws InterruptedException {

		// create object of LinkedBlockingDeque
		LinkedBlockingDeque<Integer> LBD = new LinkedBlockingDeque<Integer>();

		// Add numbers to end of LinkedBlockingDeque
		LBD.add(15);
		LBD.add(20);
		LBD.add(20);
		LBD.add(15);
		LBD.add(15);
		LBD.add(20);
		LBD.add(20);
		LBD.add(15);

		// print Dequeue
		System.out.println("Linked Blocking Deque: " + LBD);

		// prints the Deque after removal
		System.out.println("Size of Linked Blocking Deque: " + LBD.size());
	}

	public static void take(String[] args) throws InterruptedException {

		// create object of LinkedBlockingDeque
		LinkedBlockingDeque<Integer> LBD = new LinkedBlockingDeque<Integer>();

		// Add numbers to end of LinkedBlockingDeque
		LBD.add(7855642);
		LBD.add(35658786);
		LBD.add(5278367);
		LBD.add(74381793);

		// print Dequeue
		System.out.println("Linked Blocking Deque: " + LBD);

		// removes the front element and prints it
		System.out.println("Head of Linked Blocking Deque: " + LBD.take());

		// prints the Deque
		System.out.println("Linked Blocking Deque: " + LBD);
	}
	
	
	//addFirstDeque() method to add element to the beginning of the array
    public static LinkedBlockingDeque<Integer> addFirstLinkedBlockingDeque(LinkedBlockingDeque<Integer> LBD) {
        //Adding elements at the beggining
        LBD.addFirst(40); 
        LBD.addFirst(50); 
        LBD.addFirst(60); 
        LBD.addFirst(70);
        
        return LBD; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedBlockingDeque<Integer> LBD = intializingIntegerLinkedBlockingDeque();
		
		System.out.println("LinkedBlockingDeque after using addFirst() method: ");
        showDeque(LBD);
        
        return;
	}

}
