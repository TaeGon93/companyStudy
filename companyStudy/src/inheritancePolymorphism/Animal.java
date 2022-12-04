package inheritancePolymorphism;

public class Animal {
	//추상화 : 필수적(공통)으로 사용되는 요소들만 표현해둔 것
	private String animalType; //동물Type(새,강아지)
	private String animalName; //동물 이름
	private String weight; //동물의 무게
	
	public void eat() {
		System.out.println(animalName+"가 먹이를 먹는다");
	}
	public void sleep() {
		System.out.println("동물은 잠을잔다");
	}
	public void move() {
		System.out.println("동물이 움직인다.");
	}
	
	public void move(String animalName) {//메서드 오버로딩 : 매서드명이 같지만 매개변수의 수와 매개변수의 타입이 달라야한다(다형성)
		System.out.println(animalName+"가 움직인다.");
	}
	
	public Animal(String animalType, String name, String weight) {
		super();
		this.animalType = animalType;
		this.animalName = name;
		this.weight = weight;
	}

	//캡슐화(정보은닉) //변수와 메서드를 하나로 패키징
	public String getAnimalType() {
		return "동물의 종류 : "+animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public String getName() {
		return animalName;
	}

	public void setName(String name) {
		this.animalName = name;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	
	
}
