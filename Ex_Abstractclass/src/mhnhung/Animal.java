package mhnhung;

abstract public class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}
	
	public abstract void greets();
}
