package ex01;
//ex01: ��ü���� �������� �α� (���� ���շ�)
public class HelloApp {

	public static void main(String[] args) {
		/*HelloApp�� MessageBeanKo��ü�� ���(use)�Ѵ�
		 * ==> HelloApp�� MessageBeanKo�� �����Ѵ�(Dependency)
		 * : �� �� �������ִ� ��ü���� ���յ��� �߿��ϴ�
		 * ���յ��� ���ϸ� ���� ��ü�� ��ȯ�ϰ��� �� �� ������ �� �� �ִ�.
		 * 
		 * ==> �������ִ� ��ü�鳢���� ���յ��� ������ ���� ����
		 */
//		MessageBeanKo mb = new MessageBeanKo();
		MessageBeanEn mb = new MessageBeanEn();
		mb.sayHello("ȫ�浿");
		
		
	}
}
