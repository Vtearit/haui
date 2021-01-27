package ArrayDeque;

import java.util.*;

public class MainClass {

	//intializing an integer Deque
	public static Deque<Integer> intializingIntegerDeque() {
		
		// Creating an empty ArrayDeque 
        Deque<Integer> de_que = new ArrayDeque<Integer>(); 
  
        // Use add() method to add elements into the Deque 
        de_que.add(10); 
        de_que.add(15); 
        de_que.add(30); 
        de_que.add(20); 
        de_que.add(5); 
  
        showDeque(de_que);
        
		return de_que;
	}
	
	// Displaying the ArrayDeque
	public static void showDeque(Deque<Integer> de_que) {
		System.out.println("ArrayDeque: " + de_que);
		System.out.println("");
	}
	
	//addFirstDeque() method to add element to the beginning of the Deque
	public static Deque<Integer> addFirstDeque(Deque<Integer> de_que) {
		//Adding elements at the beggining
		de_que.addFirst(40); 
        de_que.addFirst(50); 
        de_que.addFirst(60); 
        de_que.addFirst(70);
        
		return de_que; 
	}
	
	//addLastDeque() method to add element to the end of the Deque
	public static Deque<Integer> addLastDeque(Deque<Integer> de_que) {
		// Adding elements at the end 
		de_que.addLast(120);
        de_que.addLast(110); 
        de_que.addLast(100); 
        de_que.addLast(90); 
        de_que.addLast(80); 
        
		return de_que; 
	}
	
	//empty ArrayDeque / this method clears all element of array but does not delete Deque
	public static Deque<Integer> clearDeQue(Deque<Integer> de_que) { 
  
        // Clearing the Deque 
        de_que.clear(); 
  
        showDeque(de_que);
        return de_que;
    }
	
	//show size of Deque
	public static void sizeDeque(Deque<Integer> de_que) {
  
        // Displaying the size of Deque 
        System.out.println("The size of de_que is: " + de_que.size());
    }
	
	//check or verify whether a specific element is present in the Deque or not
	public static void containsDeque(Deque<Integer> de_que){
		System.out.print("check deque with value: ");
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		System.out.println(de_que.contains(x));
		System.out.println("");
		
		sc.close();
	}
	
	//return an iterator of the elements of the ArrayDeque.
	public static void iteratorDeque(Deque<Integer> de_que) {  
  
        // Creating an iterator 
        Iterator<Integer> value = de_que.iterator(); 
  
        // Displaying the values after iterating through the Deque 
        System.out.println("The iterator values are: "); 
        while (value.hasNext()) { 
            System.out.print(value.next() + "\t"); 
        } 
        System.out.println("");
    }
	
	//return an iterator of the elements of the ArrayDeque in descending order
	public static void descendingIteratorDeque(Deque<Integer> de_que) { 
  
        // Creating a desc_iterator 
        Iterator<Integer> value = de_que.descendingIterator(); 
  
        // Displaying the values after iterating through the Deque 
        // in reverse order 
        System.out.println("The iterator values are: "); 
        while (value.hasNext()) { 
            System.out.print(value.next() + "\t"); 
        } 
        System.out.println("");
    }
	
	//retrieve or fetch the head of the ArrayDeque
	public static void fetchHeadArrayDeque(Deque<Integer> de_que) 
    { 
        // Displaying the head 
        System.out.println("The head element is: " + de_que.element()); 
        System.out.println("");
    }
	
	//get the first element of ArrayDeque
	public static void getFirstElement(Deque<Integer> de_que) 
    { 
		// Displaying the first element 
        System.out.println("The first element is: " + de_que.getFirst()); 
        System.out.println("");
    }
	
	//get the last element of ArrayDeque
	public static void getLastElement(Deque<Integer> de_que) 
    { 
		// Displaying the first element 
        System.out.println("The last element is: " + de_que.getLast()); 
        System.out.println("");
    }
	
	// Verifying if the Deque is empty or not
	public static void isEmpty(Deque<Integer> de_que) 
    { 
		 System.out.println("Check Deque empty: " + de_que.isEmpty());
		 System.out.println("");
    }
	
	//form an array of the same elements as that of the Deque
	public static void toArray(Deque<Integer> de_que) 
    { 
		// Creating the array and using toArray() 
	    Object[] arr = de_que.toArray(); 

	    System.out.println("The array is:"); 
	    for (int j = 0; j < arr.length; j++) 
	        System.out.print(arr[j] + "\t");
		 System.out.println("");
    }
    
	//main
	public static void main(String[] args) {
		Deque<Integer> de_que = intializingIntegerDeque();
		
		addFirstDeque(de_que);
		
		System.out.println("ArrayDeque after using addFirst() method: ");
		showDeque(de_que);
		
		addLastDeque(de_que);
		
		System.out.println("ArrayDeque after using addLast() method: ");
		showDeque(de_que);
		
		System.out.println("create copy deque to use clear() method");
		Deque<Integer> minor_de_que = intializingIntegerDeque();
		System.out.println("deque after using clear():");
		clearDeQue(minor_de_que);
		
		sizeDeque(de_que);
		
		containsDeque(de_que);
		
		iteratorDeque(de_que);
		
		descendingIteratorDeque(de_que);
		
		fetchHeadArrayDeque(de_que);
		
		getFirstElement(de_que);
		
		getLastElement(de_que);
		
		//check empty
		System.out.println("create copy deque to use clear() method");
		Deque<Integer> copy_de_que = intializingIntegerDeque();
		System.out.println("deque after using clear():");
		clearDeQue(copy_de_que);
		isEmpty(copy_de_que);
		
		toArray(de_que);
		
		return;
	}
	
}
