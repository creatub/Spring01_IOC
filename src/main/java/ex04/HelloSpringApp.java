package ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		String resource = "src/main/java/ex04/appContext.xml";
		
		//스프링 컨테이너 생성
		ApplicationContext ctx=new FileSystemXmlApplicationContext(resource);//스프링 컨테이너

		//mb1을 찾아서 sayHello()호출해보세요
//		MessageBean mb1 = (MessageBean) ctx.getBean("mb1"); // 아래와 동일
		MessageBean mb1 = ctx.getBean("mb1", MessageBean.class);
		mb1.sayHello();
		mb1.sayHi("BTS", "뉴진스", "르세라핌");
		
		
		System.out.println(" ");
		//mb2를 찾아서 sayHello()호출해보세요
		MessageBean mb2 = (MessageBean) ctx.getBean("mb3");
		mb2.sayHello();
		mb2.sayHi("BTS", "손흥민", "제이팍");
	}

}
