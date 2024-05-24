package learningtestng;

import org.testng.annotations.Test;

public class TestNGAttributes {
	
	@Test(priority=1, invocationCount=5, threadPoolSize=2, invocationTimeOut=1000)
	public void createLead() {
		System.out.println("Create Lead");
	}
	@Test(priority=2)
	public void editLead() {
		System.out.println("Edit Lead");
	}
	@Test(priority=3)
	public void deleteLead() {
		System.out.println("Delete Lead");
	}
	@Test(enabled=false)
	public void duplicateLead() {
		System.out.println("Duplicate Lead");
	}
	@Test(priority=-1)
	public void login() {
		System.out.println("Login");
	
	}
}
