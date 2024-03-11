package ex02;
//ex02: 객체간의 의존관계 맺기-의존관계를 약간 느슨하게 맺기 (약한 결합력)
public class HelloApp {

	public static void main(String[] args) {
		//인터페이스타입 변수 = 자식객체()
		MessageBean mb = new MessageBeanEn();//부모타입 선언, 자식 객체로 생성
		mb.sayHello("Peter");
		//객체 간의 결합력이 다소 느슨해짐. HelloApp과 MessageBean구현 객체 간의 의존성이 약함
	}

}
