package lsp;

public interface Animal {
	//자식 클래스는 최소한 자신의 부모 클래스에서 가능한 행위는 수행이 보장되어야 한다는 의미 // 다형성 원리
	void eat();
	void sleep();
}
