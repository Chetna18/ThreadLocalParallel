package MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import MyDriverFactory.ThreadLocalFactory;

public class FaceBookTest extends TestBase{
	
	@Test
	public void faceBookTitleTest1(){
		ThreadLocalFactory.getDriver().get("http://www.Facebook.com");
		String title = ThreadLocalFactory.getDriver().getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Facebook");
	}
	
	
	@Test
	public void faceBookTitleTest2(){
		ThreadLocalFactory.getDriver().get("http://www.Facebook.com");
		String title = ThreadLocalFactory.getDriver().getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Facebook");
	}
	
	
	
	
	
	
	
	

}
