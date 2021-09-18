package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDif {

	WebDriver driver;

	@Given("^Launch chrome browser$")
	public void launch_chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ashique\\eclipse\\java-2021-03\\eclipse\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

	}

	@Then("^Open orange hrm homepage$")
	public void open_orange_hrm_homepage() throws Throwable {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

	}

	@Then("^Verify that the logo present on page$")
	public void verify_that_the_logo_present_on_page() throws Throwable {
		boolean status = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
		Assert.assertTrue(status);
		Thread.sleep(2000);
	}

	@Then("^Close Browser$")
	public void close_Browser() throws Throwable {
		driver.quit();

	}

}
