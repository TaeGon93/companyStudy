package ocp;

public class Cat extends Animal{
	@Override
	public void cry() {
		System.out.println("야옹");
	}
	public static void main(String[] args) {
		Animal cat = new Cat();
		cat.cry();
	}
	
}
