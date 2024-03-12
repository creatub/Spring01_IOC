package ex07;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
/* @Value :�⺻�ڷ���, String ������ ������ �� ���
 * @Autowired : byType���� �����Ѵ�. �ڷ������� ���� ��ü�� ������ �����Ѵ�. ã�¼���: �ڷ���> @Qualifier("���̸�")
 * @Resource  : byName���� �����Ѵ�. pom.xml�� ���̺귯���� ����ؾ� ��� �����ϴ�.
 * @Inject : ==>pom.xml�� ���̺귯���� ����ؾ� ��� �����ϴ�. byType> @Qualifier
 * 
 * */
public class ServiceImpl implements Service {

//	@Autowired // Emp ��ü�� �������ش�
	@Inject // byType���� ������
	@Qualifier("emp2")
	private Emp emp;
	
	@Resource(name="member")//byName���� �����Ѵ�. �� ���� �̸��� member�� ��ü�� ������ �����Ѵ�.
	private Member user;
	
	@Override
	public void info1() {
		System.out.println("Name: "+emp.getName());
		System.out.println("Dept: "+emp.getDept());
		System.out.println("Salary: "+emp.getSal());
	}

	@Override
	public void info2() {
		user.showInfo();
	}



}
