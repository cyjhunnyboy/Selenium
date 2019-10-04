package per.cyj.selenium.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import per.cyj.selenium.BaseTest;

/**
 * @author chenyongjun
 * @apiNote 通过By.id(locatorName)定位页面元素
 * @since 2019-10-04
 */
public class FindElementByIdTest extends BaseTest {
	
	private static final String BASE_URL = "http://192.168.126.128:8080/selenium/html/id.html";
	
	@Test(description = "通过By.id(locatorName)定位页面元素", groups = {"元素定位方式"})
	public void testFindElementById() throws Exception {
		driver.navigate().to(BASE_URL);
		WebElement userName = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement submit = driver.findElement(By.id("submit"));
		if (userName.isDisplayed()) {
			userName.clear();
			userName.sendKeys("admin");
		}
		if (password.isDisplayed()) {
			password.clear();
			password.sendKeys("admin");
		}
		if (submit.isEnabled()) {
			submit.click();
		}
		Thread.sleep(1000);
	}

}
