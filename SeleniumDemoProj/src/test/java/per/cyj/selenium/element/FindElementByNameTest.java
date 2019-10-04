package per.cyj.selenium.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import junit.framework.Assert;
import per.cyj.selenium.BaseTest;

/**
 * @author chenyongjun
 * @apiNote 通过By.name(name)定位页面元素
 * @since 2019-10-04
 */
public class FindElementByNameTest extends BaseTest {

	private static final String BASE_URL = "http://192.168.126.128:8080/selenium/html/name.html";
	
	@Test(description = "通过By.name(name)定位页面元素")
	public void testFindElementByName() throws Exception {
		// 我的注释
		driver.navigate().to(BASE_URL);
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement submit = driver.findElement(By.name("submit"));
		Assert.assertTrue(username.isDisplayed());
		username.clear();
		username.sendKeys("admin");
		Assert.assertTrue(password.isDisplayed());
		password.clear();
		password.sendKeys("admin");
		Assert.assertTrue(submit.isEnabled());
		submit.click();
		Thread.sleep(1000);
	}
	
}
