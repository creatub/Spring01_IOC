package ex06;
//ex06: xml이 아닌 Java 클래스를 이용해 빈을 생성하고 주입 (Java 기반)
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloAppEx06 {

	public static void main(String[] args) {
		//FileSystemXmlApplicationContext, ClassPathXmlApplicationContext ==> xml설정 시
		//AnnotationConfigApplicationContext ==> 자바로 설정 시
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
		Emp e1 = ctx.getBean("e1", Emp.class);
		System.out.println(e1.getName()+"/"+e1.getDept()+"/"+e1.getSal());
		
		Emp e2 = ctx.getBean("empInfo2", Emp.class);
		System.out.println(e2.getName()+"/"+e2.getDept()+"/"+e2.getSal());
		System.out.println("*********************************");
		
		Service service = ctx.getBean("service", Service.class);
		service.info();
	}
}
