package MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import MyDriverFactory.ThreadLocalFactory;

public class GoogleTest extends TestBase {
	
	
	@Test
	public void googleTitleTest1(){
		ThreadLocalFactory.getDriver().get("http://www.google.com");
		String title = ThreadLocalFactory.getDriver().getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}
	
	
	@Test
	public void googleTitleTest2(){
		ThreadLocalFactory.getDriver().get("http://www.google.com");
		String title = ThreadLocalFactory.getDriver().getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}
	
	@Test
	public void googleTitleTest3(){
		ThreadLocalFactory.getDriver().get("http://www.google.com");
		String title = ThreadLocalFactory.getDriver().getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}
	
	
	@Test
	public void googleTitleTest4(){
		ThreadLocalFactory.getDriver().get("http://www.google.com");
		String title = ThreadLocalFactory.getDriver().getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}
	
	
	
	
	

}
