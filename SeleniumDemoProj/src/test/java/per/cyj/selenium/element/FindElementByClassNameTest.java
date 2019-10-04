package per.cyj.selenium.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import junit.framework.Assert;
import per.cyj.selenium.BaseTest;

/**
 * @author chenyongjun
 * @apiNote 通过By.className(className)定位页面元素
 * @since 2019-10-04
 */
public class FindElementByClassNameTest extends BaseTest {

	private static final String BASE_URL = "http://192.168.126.128:8080/selenium/html/class.html";
	
	@Test(description = "通过By.className(className)定位页面元素")
	public void testFindElementByClassName() throws Exception {
		driver.navigate().to(BASE_URL);
		WebElement inputBox = driver.findElement(By.className("spread"));
		Assert.assertTrue(inputBox.isDisplayed());
		inputBox.clear();
		inputBox.sendKeys("光荣之路自动化测试，让你飞起来！");
		Thread.sleep(1000);
	}
}
