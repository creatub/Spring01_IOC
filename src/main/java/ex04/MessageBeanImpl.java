package ex04;
import java.util.*;

public class MessageBeanImpl implements MessageBean {

	//property: �������
	private String greeting; //default��: null <= ������Ƽ���� �������� (appContext.xml)���� �־��� ���� (setter injection)
	private String name;
	
	private Date today;
	private Random ran;
	
	@Override
	public void sayHello() {
		System.out.println(greeting+" "+name+"^^");
		if(today!=null) {
			System.out.println("���� ��¥�� :"+ today.toString());
		}
		
		System.out.println("--------------------");
	}

	@Override
	public void sayHi(String... names) {
		System.out.println(greeting);
		if(names!=null) {
			for(String name: names) {
				System.out.print(name + ", ");
			}
		}
		System.out.println("\n*********************");
		if(ran!=null)
			System.out.println("������ ����� ���ڴ�: "+ran.nextInt(100));
	}
	//setter, getter
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
		System.out.println("setGreeting(): "+greeting);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getToday() {
		return today;
	}

	public void setToday(Date today) {
		this.today = today;
	}

	public Random getRan() {
		return ran;
	}

	public void setRan(Random ran) {
		this.ran = ran;
	}

	
	
}/////////////////////////////////
