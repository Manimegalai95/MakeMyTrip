package MakeMyTrip.makemytrip_flightbooking;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebElement;

public class RunnerClass extends BaseClass {
	public static PageObjectManager pom = new PageObjectManager(driver);

	public static void browser() {
		browserLaunch("chrome");
		getUrl("https://www.makemytrip.com/");
		implicitWait();
	}

	public static void fromTo() throws InterruptedException {
		click(pom.getHom().getFromCity());
		sendKeys(pom.getHom().getFromName(), "chennai");
		Thread.sleep(1000);
		click(pom.getHom().getSelectfromplace());
		click(pom.getHom().getToCity());
		sendKeys(pom.getHom().getToName(), "mumbai");
		Thread.sleep(1000);
		click(pom.getHom().getSelecttoplace());
	}

	public static void departureReturn() throws InterruptedException {
		action("click", pom.getHom().getDeparture());
	}

	public static void traveller() throws IOException, InterruptedException {
		Thread.sleep(3000);
		click(pom.getHom().getTravellers());
		click(pom.getHom().getAdults());
		click(pom.getHom().getTravelclass());
		click(pom.getHom().getApplybutton());

	}

	public static void search() throws IOException, InterruptedException {
		click(pom.getHom().getSearch());
		Thread.sleep(3000);

	}

	public static void selectFlightWithMinPrice() throws InterruptedException {
		javaScriptClick(pom.getSp().getNotification());
		List<WebElement> prices = pom.getSp().getPrices();
		for (WebElement webElement : prices) {
			String text = webElement.getText();
			System.out.println(text);
		}
		click(pom.getSp().getViewPriceButton());
		Thread.sleep(2000);
		click(pom.getSp().getBookNowButton());
		windowHandle();
	}

	private static void travellingDetails() throws InterruptedException, AWTException {
		Thread.sleep(3000);
		javaScriptScroll("scrolldown");
		click(pom.getTp().getRadiobutton());
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		action("click", pom.getTp().getAddDetails());
		sendKeys(pom.getTp().getFirstname(), "mani");
		sendKeys(pom.getTp().getLastname(), "megalai");
		click(pom.getTp().getGender());
		sendKeys(pom.getTp().getMobileno(), "9876543210");
		sendKeys(pom.getTp().getEmail(), "xyz@gmail.com");
		click(pom.getTp().getEmailclick());
		click(pom.getTp().getContinuebutton());
		click(pom.getTp().getConfirmbutton());
		javaScriptClick(pom.getTp().getLetmechooseseat());
		click(pom.getTp().getSeatno());
		javaScriptClick(pom.getTp().getSeatcontinuebutton());
		javaScriptClick(pom.getTp().getMealcontinuebutton());
		Thread.sleep(2000);
		javaScriptScroll("scrolldown");
		
	}

	public static void closebrowser() throws IOException {
		screenShot("flightbooking");
		quit();
	}

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		browser();
		fromTo();
		departureReturn();
		traveller();
		search();
		selectFlightWithMinPrice();
		travellingDetails();
		closebrowser();
	}

}
