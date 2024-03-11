package ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		String resource = "src/main/java/ex04/appContext.xml";
		
		//������ �����̳� ����
		ApplicationContext ctx=new FileSystemXmlApplicationContext(resource);//������ �����̳�

		//mb1�� ã�Ƽ� sayHello()ȣ���غ�����
//		MessageBean mb1 = (MessageBean) ctx.getBean("mb1"); // �Ʒ��� ����
		MessageBean mb1 = ctx.getBean("mb1", MessageBean.class);
		mb1.sayHello();
		mb1.sayHi("BTS", "������", "��������");
		
		
		System.out.println(" ");
		//mb2�� ã�Ƽ� sayHello()ȣ���غ�����
		MessageBean mb2 = (MessageBean) ctx.getBean("mb3");
		mb2.sayHello();
		mb2.sayHi("BTS", "�����", "������");
	}

}
