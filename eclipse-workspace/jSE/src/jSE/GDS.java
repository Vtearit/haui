package jSE;
import java.util.*;

public interface GDS {
	public ArrayList<Person> searchPerson(Person[] list, String name);
	public ArrayList<Person> searchPerson(Person[] list, Address address);
	public ArrayList<Person> searchPerson(Person[] list, byte max_age);
}
