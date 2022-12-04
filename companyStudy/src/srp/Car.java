package srp;

public class Car {
	//한 클래스는 한가지 역할만 책임지는 원칙
	//한 클래스가 많은 역할을 하는 경우
	private int four_engine = 4;
	private int six_engine = 6;
	private int eight_engine = 8;
	
	public void move(int engine) {
		if(engine == four_engine) {
			// 4기통 엔진을 가진 차
		}else if(engine == six_engine) {
			// 6기통 엔진을 가진 차
		}else if(engine == eight_engine) {
			// 8기통 엔진을 가진 차
		}else {
			// 그이상의 엔진을 가진 차
		}
	}
}
