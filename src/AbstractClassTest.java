/**
 * @author 전상훈
 * abstract class 추상클래스를 공부해보자.
 *
 */

//추상클래스
//1. 추상클래스는 추상 메서드를 가지고, 추상클래스를 상속받은 자식클래스는 추상메서드를 반드시 구현해야 한다.
//2. 추상클래스는 인터페이스와 다르게 추상메서드 외에, 일반메서드를 가질 수 있다.
abstract class Animal {
	abstract void speak(); //추상메서드 : 몸체({})가 없고, 해당 클래스를 상속받은 자식 클래스는 무조건 추상메서드를 구현해야 한다.
	void hello() {
		System.out.println("Hello"); //추상클래스는 인터페이스와 다르게 일반 메서드를 가질 수 있다.
	}
}

//추상클래스를 상속받은 자식 클래스는 부모의 추상메서드를 반드시 구현해야한다. 그렇지 않으면 에러가 난다.
class Dog extends Animal{

	//부모의 메서드를 무시하고 내 메서드를 사용 = 동적 바인딩
	@Override
	void speak() {
		System.out.println("멍멍");
	}
	
}

class Cat extends Animal{

	//부모의 메서드를 무시하고 내 메서드를 사용 = 동적 바인딩 
	@Override
	void speak() {
		System.out.println("야옹");
	}
	
}
public class AbstractClassTest {

	public static void main(String[] args) {
		Animal dog = new Dog(); //애니멀 객체에 Dog 인스턴스를 생성
		Animal cat = new Cat();
		
		//추상클래스는 인스턴스화 될 수 없다. 의자,책상은 존재하지만 가구라는 건 실제로 존재하지 않는 추상적 개념이기 때문이다.
		//Animal a = new Animal();
		
		dog.speak();
		cat.speak();
	}

}
