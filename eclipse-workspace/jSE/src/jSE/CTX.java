package jSE;
import java.util.*;

public interface CTX {
	public ArrayList<Person> getListPerson();
	public ArrayList<Person> getListPerson(byte min_age, byte max_age);
	public ArrayList<Person> getListPerson(Address address);
}
