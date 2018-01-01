import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares _ N_ Plugins_for_Programming\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // Launches Firefox Browser with blank url
		
		/*System.setProperty("webdriver.chrome.driver", "D:\\Softwares _ N_ Plugins_for_Programming\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/

		
		
		

		driver.get("https://www.google.co.in");
		
		driver.get("https://www.google.co.in");
		String Title = driver.getTitle();
		System.out.println(Title);
		
		driver.get("https://www.google.co.in");
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		
		driver.get("https://www.google.co.in");
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.get("https://www.google.co.in");
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		driver.navigate().to("https://login.yahoo.com/");
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.get("https://www.google.co.in");
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		driver.navigate().to("https://login.yahoo.com/");
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		driver.navigate().back();
		URL = driver.getCurrentUrl();
		System.out.println(URL);

		driver.get("https://www.google.co.in");
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		driver.navigate().to("https://login.yahoo.com/");
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		driver.navigate().to("https://www.google.co.in");
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.get("https://www.google.co.in");
		URL = driver.getCurrentUrl();
		System.out.println(URL);

		driver.navigate().to("https://login.yahoo.com/");
		URL = driver.getCurrentUrl();
		System.out.println(URL);

		driver.navigate().back();
		URL = driver.getCurrentUrl();
		System.out.println(URL);

		driver.navigate().forward();
		URL = driver.getCurrentUrl();
		System.out.println(URL);

		driver.get("https://www.google.co.in");
		URL = driver.getCurrentUrl();
		System.out.println(URL);

		driver.navigate().to("https://login.yahoo.com/");
		URL = driver.getCurrentUrl();
		System.out.println(URL);

		driver.navigate().to("https://www.google.co.in");
		URL = driver.getCurrentUrl();
		System.out.println(URL);

		driver.navigate().to("https://login.yahoo.com/");
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		/*driver = new FirefoxDriver();*/
		driver.get("https://www.google.co.in");
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		driver.navigate().refresh();
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		driver.quit();
		
		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.close();
				
		driver = new FirefoxDriver();
		driver.get("file:///D://Users//HTML5//LoginPage.html");
		driver.findElement(By.xpath("/html/body/form/div[1]/button")).click();
		driver.quit();
		
		driver = new FirefoxDriver();
		driver.get("file:///D://Users//HTML5//LoginPage.html");
		driver.findElement(By.name("uname")).sendKeys("abcd");
		driver.quit();
		
		driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		WebElement Email = driver.findElement(By.id("identifierId"));
		Email.sendKeys("India");
		
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("India");
		
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("India");
		Thread.sleep(5000);
		driver.findElement(By.id("identifierId")).clear();
		
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		
		driver.get("https://www.gmail.com");
		boolean a = driver.findElement(By.id("identifierNext")).isEnabled();
		System.out.println(a);
		
		driver.get("https://www.gmail.com");
		a = driver.findElement(By.id("identifierNext")).isDisplayed();
		System.out.println(a);
		
		driver.get("file:///D://Users//HTML5//MultipleCheckbox.html");
		a = driver.findElement(By.xpath("//*[@id=\"chk2\"]")).isSelected();
		System.out.println(a);//false
		driver.get("file:///D://Users//HTML5//MultipleCheckbox.html");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"chk2\"]")).click();
		a = driver.findElement(By.xpath("//*[@id=\"chk2\"]")).isSelected();
		System.out.println(a);//true
		
		driver.get("file:///D://Users//HTML5//MultipleCheckbox.html");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.quit();
				
		System.out.println("Session complete");
		
		
		
	}

}
