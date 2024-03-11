package ex03;
//ex03: 객체간의 의존관계 맺기- 의존설정을 스프링 컨테이너를 통해 설정함 (IOC -역제어) DL
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		//스프링 컨테이너를 통해 필요한 객체를 DL(Dependency Lookup)해보자
		String resource="src/main/java/ex03/applicationContext.xml";
		
		//스프링 컨테이너 생성
		ApplicationContext ctx=new FileSystemXmlApplicationContext(resource);//스프링 컨테이너
		
		//필요한 객체를 찾는다
		MessageBean mb = (MessageBean) ctx.getBean("mbEn"); //Lookup, 반환타입 Object
		mb.sayHello("김지수");
	}

}
