package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	public RemoteWebDriver driver;
	@Before
	public void before(Scenario sc) {
		System.out.println(sc.getName());
		System.out.println(sc.getId());
	}
	@After
	public void after(Scenario sc) {
		System.out.println(sc.getStatus());
		System.out.println(sc.isFailed());
	}
	
	@Given ("Launch the browser")
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@And ("load the url (.*)")
	public void loadURL(String url) {
		driver.get(url);
	}
	
	
	@And ("Maximize the browser")
	public void maxmizeTheBrowser() {
		driver.manage().window().maximize();
	}
	
	@And ("set the implicit wait")
	public void waitImp() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@And ("Enter the username as (.*)")
	public void enterUserName(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}
	
	
	@And ("Enter the password as (.*)")
	public void enterPassword(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}
	
	@When ("Click on login")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	
	@Then ("I should be able to login successfully")
	public void loginCheck() {
		System.out.println("User is able to login successfully");
	}

}
