package jSE;

public interface CTT extends CTX, GDS, TPGD {
	public boolean addPerson(Person p);
	public boolean addPerson(Person p,Address address);
	public boolean editPerson(Person p);
	public boolean editPerson(Person p,Address address);
	public boolean delPerson(Person p);
}
