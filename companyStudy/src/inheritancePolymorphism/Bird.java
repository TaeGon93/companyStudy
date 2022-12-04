package inheritancePolymorphism;


public class Bird extends Animal{ //상속

	public Bird(String animalType, String anymalName, String weight) {
		super(animalType, anymalName, weight);
	}
	@Override //오버라이드를 통해 sleep메서드의 기능을 재정의함
		public void sleep() {
			System.out.println("새가 잠을잔다");
		}
	public static void main(String[] args) {
		Animal bird = new Bird("새", "독수리", "5kg");
		
		bird.eat();
		bird.move();
		bird.move("독수리");
		bird.sleep();
		
		//정보의 직접적인 접근을 막아 get메서드를 통해 변수에 저장된 값을 불러와야 한다.
		System.out.println(bird.getAnimalType()+", "+bird.getName()+", "+bird.getWeight());
		
	}

}
