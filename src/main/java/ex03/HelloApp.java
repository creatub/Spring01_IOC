package ex03;
//ex03: ��ü���� �������� �α�- ���������� ������ �����̳ʸ� ���� ������ (IOC -������) DL
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		//������ �����̳ʸ� ���� �ʿ��� ��ü�� DL(Dependency Lookup)�غ���
		String resource="src/main/java/ex03/applicationContext.xml";
		
		//������ �����̳� ����
		ApplicationContext ctx=new FileSystemXmlApplicationContext(resource);//������ �����̳�
		
		//�ʿ��� ��ü�� ã�´�
		MessageBean mb = (MessageBean) ctx.getBean("mbEn"); //Lookup, ��ȯŸ�� Object
		mb.sayHello("������");
	}

}
