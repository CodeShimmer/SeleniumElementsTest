import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AdminLogin {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//if you didn't update the Path system variable to add the full directory path to the executable as above mentioned then doing this directly through code
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares _ N_ Plugins_for_Programming\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // Launches Firefox Browser with blank url
		
		
		/*//if you update the Path system variable
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		*/
		
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();

		String url = driver.getCurrentUrl();
		if (url.equals("http://www.gcrit.com/build3/admin/index.php")) {
			System.out.println("Login Successful -Passed");
		} else {
			System.out.println("Login Unsuccessful -Failed");
		}
		
		driver.findElement(By.id("Email")).sendKeys("gcrindia");
		
		WebElement Email = driver.findElement(By.id("Email"));
		Email.sendKeys("gcrindia");
		
		//id locator for Button

		WebElement Email = driver.findElement(By.id("signIn"));
		Email.click();

		
		driver.findElement(By.id("signIn")).click();
//name

   		driver.findElement(By.name("Email")).sendKeys("gcrindia");
		       
		WebElement e = driver.findElement(By.name("Email"));
		e.sendKeys("gcrindia");
		
		WebElement e = driver.findElement(By.name("signIn"));
		e.click();
		//className

		driver.findElement(By.className("textboxcolor")).sendKeys("Hyderabad");
		//tagName

		driver.findElement(By.tagName("input")).sendKeys("Hyderabad");
		//linkText

		driver.findElement(By.linkText("Gmail")).click();
		// paritialLinkText

		driver.findElement(By.partialLinkText("Gma")).click();
		//cssSelector

		
		/*driver.close();*/ // Closes the Browser
		driver.quit();
	}

}
