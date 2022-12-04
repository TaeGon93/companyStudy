package characteristic;

public class Dog extends Animal{ //상속

	public Dog(String animalType, String anymalName, String weight) {
		super(animalType, anymalName, weight);
	}
	@Override //오버라이드를 통해 sleep메서드의 기능을 재정의함
		public void sleep() {
		System.out.println("강아지가 잠을잔다");
	}
	public static void main(String[] args) {
		Animal dog = new Dog("강아지", "말티즈", "2.6kg");
		dog.eat();
		dog.move();
		dog.move("말티즈");
		dog.sleep();
		
		//정보의 직접적인 접근을 막아 get메서드를 통해 변수에 저장된 값을 불러와야 한다.
		System.out.println(dog.getAnimalType()+", "+dog.getName()+", "+dog.getWeight());
	}
}
