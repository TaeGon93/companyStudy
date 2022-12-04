package lsp;

public class Whale implements Animal{
	
	@Override
	public void eat() {
		System.out.println("먹이를 먹다");
	}

	@Override
	public void sleep() {
		System.out.println("잠을자다");
	}

	public static void main(String[] args) {
		Animal whale = new Whale();
		whale.eat();
		whale.sleep();
	}
}
