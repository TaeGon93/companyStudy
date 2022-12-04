package isp;

public class Dog implements Cry, Sleep{

	@Override
	public void sleep() {
		System.out.println("잠잔다");
	}

	@Override
	public void cry() {
		System.out.println("멍멍");
	}


}
