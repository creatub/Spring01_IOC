package ex06;
//ex06: xml�� �ƴ� Java Ŭ������ �̿��� ���� �����ϰ� ���� (Java ���)
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloAppEx06 {

	public static void main(String[] args) {
		//FileSystemXmlApplicationContext, ClassPathXmlApplicationContext ==> xml���� ��
		//AnnotationConfigApplicationContext ==> �ڹٷ� ���� ��
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
