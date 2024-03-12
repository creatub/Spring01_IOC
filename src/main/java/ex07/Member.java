package ex07;

import org.springframework.beans.factory.annotation.Value;

public class Member {

	//Field Injection
	@Value("hong") //annotation을 이용한 주입 ==> private String userId="hong";
	private String userId;
	@Value("010-1234-1111")
	private String tel;
	
	public void showInfo() {
		System.out.println("UserId: "+userId);
		System.out.println("Tel   : "+tel);
	}
}
