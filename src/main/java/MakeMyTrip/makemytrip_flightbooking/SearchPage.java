package MakeMyTrip.makemytrip_flightbooking;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClass{

	public SearchPage(WebDriver driver) {
 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[contains(@class,'bgProperties icon20 over')]")
    private WebElement notification;
	
	@FindBy(xpath = "//div[@id='premEcon']//following::div[@class='textRight flexOne']")
	private List<WebElement> prices;
	
	@FindBy(xpath = "(//div[@id='premEcon']//following::span[@class='appendRight8'])[1]")
	private WebElement viewPriceButton;
	
	@FindBy(xpath = "(//button[text()='Book Now'])[1]")
	private WebElement bookNowButton;
	
	public WebElement getNotification() {
		return notification;
	}

	public List<WebElement> getPrices() {
		return  prices;
	}

	public WebElement getViewPriceButton() {
		return viewPriceButton;
	}

	public WebElement getBookNowButton() {
		return bookNowButton;
	}
	
	
	
	
}
