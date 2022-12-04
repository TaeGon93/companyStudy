package ocp;

public class Dog extends Animal{
	@Override
	public void cry() {
		System.out.println("멍멍");
	}
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.cry();
	}
}
