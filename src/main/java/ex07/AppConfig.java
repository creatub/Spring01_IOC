package ex07;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	//Emp���� ��ȯ�ϴ� �޼��带 �����ϼ���. id�� emp1�� �ּ���
	@Bean(name="emp1")
	@Scope("prototype")
	public Emp getEmp() {
		return new Emp("����","������",7000);
	}
	
	@Bean(name="emp2")
	public Emp getEmp2() {
		Emp e = this.getEmp();
		e.setName("�ֻ��");
		e.setDept("�λ��");
		e.setSal(5000);
		return e;
	}
	
	@Bean
	public Member member() {
		return new Member();
	}
	
	@Bean
	public ServiceImpl service() {
		return new ServiceImpl();
	}
	
}///////////////
