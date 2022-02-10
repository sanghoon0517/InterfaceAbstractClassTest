
/**
 * @author 전상훈
 * 
 * 인터페이스를 이용해보자
 * 
 * 인터페이스는 기본적으로 행동에 제약을 걸기 위해 사용된다.
 * 공통적인 부분은 추상클래스에서 구현하고, 개별적인(구체적인) 내용은 상속받은 자식클래스에서 구현한다.
 *
 */


interface Moveable {
	//public abstract가 생략되어있음
	void 위();
	void 아래();
	void 왼쪽();
	void 오른쪽();
	void 냄새맡기();
}
interface Moveable2 {
	void 위();
	void 아래();
	void 왼쪽();
	void 오른쪽();
	void 숨기();	
}
abstract class 사나운동물 implements Moveable{
	abstract void 공격();

	@Override
	public void 위() {
		System.out.println("위쪽으로 이동");
	}

	@Override
	public void 아래() {
		System.out.println("아래쪽으로 이동");
	}

	@Override
	public void 왼쪽() {
		System.out.println("왼쪽으로 이동");
	}

	@Override
	public void 오른쪽() {
		System.out.println("오른쪽으로 이동");
	}

	@Override
	public void 냄새맡기() {
		System.out.println("냄새맡기");
	}
	
}
abstract class 온순한동물 implements Moveable2{
	abstract void 채집();

	@Override
	public void 위() {
		System.out.println("위쪽으로 이동");
	}

	@Override
	public void 아래() {
		System.out.println("아래쪽으로 이동");
	}

	@Override
	public void 왼쪽() {
		System.out.println("왼쪽으로 이동");
	}

	@Override
	public void 오른쪽() {
		System.out.println("오른쪽으로 이동");
	}	
}

class 사자 extends 사나운동물{

	@Override
	void 공격() {
		System.out.println("깨물기");
	}
	
}

class 호랑이 extends 사나운동물{
	
	@Override
	void 공격() {
		System.out.println("목덜미물기");
	}
	
}

class 원숭이 extends 온순한동물{

	@Override
	public void 숨기() {
		System.out.println("나무에 숨기");
	}

	@Override
	void 채집() {
		System.out.println("열매 따먹기");
	}
	
}

class 소 extends 온순한동물 {

	@Override
	public void 숨기() {
		System.out.println("땅파서 숨기");
	}

	@Override
	void 채집() {
		System.out.println("풀 뜯어먹기");
	}
	
}

public class InterfaceTest {
	static void 조이스틱(온순한동물 o1) {
		o1.위();
		o1.아래();
		o1.왼쪽();
		o1.오른쪽();
		o1.채집();
		o1.숨기();
		System.out.println("===========================");
	}
	static void 조이스틱(사나운동물 o1) {
		o1.위();
		o1.아래();
		o1.왼쪽();
		o1.오른쪽();
		o1.냄새맡기();
		o1.공격();
		System.out.println("===========================");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		사나운동물 lion = new 사자();
		사나운동물 호랑이 = new 호랑이();
		
		온순한동물 원숭이 = new 원숭이();
		온순한동물 소 = new 소();
		
		조이스틱(lion);
		조이스틱(호랑이);
		조이스틱(원숭이);
		조이스틱(소);
	}

}
