package DesignPatterns.prototype;

public abstract class Profession implements Cloneable{
	public int id;
	public String name;

	abstract void print();

	public Object cloningMethod() throws CloneNotSupportedException {
		Object clone = null;
		return clone = super.clone();

	}

}
