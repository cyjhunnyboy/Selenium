package per.cyj.selenium;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * @author chenyongjun
 * @apiNote 测试基类
 * @since 2019-10-04
 */
public class BaseTest {

	/**
	 * driver成员
	 */
	protected WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	protected void init() {
		try {
			ChromeDriverService service = new ChromeDriverService.Builder()
					.usingDriverExecutable(new File("d:/tools/driver/chromedriver.exe"))
					.usingAnyFreePort().build();
			service.start();
			driver = new ChromeDriver(service);
			driver.manage().window().maximize();
		} catch (Exception e) {
			Assert.fail("WebDriver初始化失败：", e);
		}
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
}
