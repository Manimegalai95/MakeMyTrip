package MakeMyTrip.makemytrip_flightbooking;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void browserLaunch(String name) {
		if (name.equalsIgnoreCase("chrome")) {
			ChromeOptions option = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			option.addArguments("incognito");
			driver = new ChromeDriver(option);
		} else if (name.equalsIgnoreCase("firefox")) {
			FirefoxOptions firefox = new FirefoxOptions();
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(firefox);
		}
	}

	public static void getUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	public static void navigateTo(String Url) {
		driver.navigate().to(Url);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void simpleAlert() {
		driver.switchTo().alert().accept();
	}

	public static void confirmAlert(String alert) {
		if (alert.equalsIgnoreCase("confirmAlertAccept")) {
			driver.switchTo().alert().accept();
		} else if (alert.equalsIgnoreCase("confirmAlertDismiss")) {
			driver.switchTo().alert().dismiss();
		}
	}

	public static void promptAlert(String text) {
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().accept();
	}

	public static void action(String actionname, WebElement element) {
		Actions action = new Actions(driver);
		if (actionname.equalsIgnoreCase("contextclick")) {
			action.contextClick(element).build().perform();
		} else if (actionname.equalsIgnoreCase("click")) {
			action.click(element).build().perform();
		} else if (actionname.equalsIgnoreCase("doubleclick")) {
			action.doubleClick(element).build().perform();
		} else if (actionname.equalsIgnoreCase("moveToElement")) {
			action.moveToElement(element).build().perform();
		} else if (actionname.equalsIgnoreCase("click")) {
			action.click(element).build().perform();
		}
	}

	public static void action(WebElement source, WebElement dest) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, dest).build().perform();
	}

	public static void windowHandle() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
		}
	}

	public static void frame(String option, String value) {
		if (option.equalsIgnoreCase("Index")) {
			int parseInt = Integer.parseInt(value);
			driver.switchTo().frame(parseInt);
		} else if (option.equalsIgnoreCase("Name")) {
			driver.switchTo().frame(value);
		}
	}

	public static void frame(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static String title() {
		return driver.getTitle();
	}

	public static void sendKeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void dropDown(WebElement element, String selectOption, String value) {
		Select s = new Select(element);
		if (selectOption.equalsIgnoreCase("index")) {
			int parseint = Integer.parseInt(value);
			s.selectByIndex(parseint);
		} else if (selectOption.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (selectOption.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
	}

	public static void radiobutton(WebElement element) {
		element.click();
	}

	public static void implicitWait() {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void screenShot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Manjunathan\\git\\pom\\pageobject\\screenshot//" + name + ".png");
		FileHandler.copy(source, destination);
	}

	public static void keyboard(String value) throws AWTException {
		Robot r = new Robot();
		if (value.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}

	}

	public static void javaScriptClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	    
	}
	public static void javaScriptScroll(String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if(value.equalsIgnoreCase("scrolldown")) {
			js.executeScript("window.scrollBy(0,1200)","");
		}
		else if(value.equalsIgnoreCase("scrollup")) {
			js.executeScript("window.scrollBy(0,-1200)","");
		}
	}
	public static void javaScriptScrollInto(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

}
