import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowserTest {
	public static WebDriver driver;
	public static int browser;
	public static String BrowserName;

	public static void main(String[] args) {

		for (browser = 1; browser <= 3; browser++) {
			if (browser == 1) {
				driver = new FirefoxDriver();
				BrowserName = "Mozilla Firefox Browser: ";
			} else if (browser == 2) {
				System.setProperty("webdriver.chrome.driver",
						"D:\\Softwares _ N_ Plugins_for_Programming\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				BrowserName = "Google Chrome Browser: ";
			} else if (browser == 3) {
				System.setProperty("webdriver.ie.driver",
						"D:\\Softwares _ N_ Plugins_for_Programming\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				BrowserName = "Internet Explorer Browser: ";
			}
			driver.get("https://www.google.com");

			String PageTitle = driver.getTitle();

			if (PageTitle.equals("Google")) {
				System.out.println(BrowserName + " - Google Application Launched - Passed");
			} else {
				System.out.println(BrowserName + " - Google Application Not Launched -Failed");
			}
			driver.close();
		}
	}
}
