package MakeMyTrip.makemytrip_flightbooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeMyTripHomePage extends BaseClass{

	public MakeMyTripHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[@for='fromCity']")
	private WebElement fromCity;
	
	@FindBy(xpath = "//input[@placeholder='From']")
	private WebElement fromName;
	
	@FindBy(xpath = "(//div[@class='calc60'])[1]")
	private WebElement selectfromplace;
	
	@FindBy(xpath = "//label[@for='toCity']")
	private WebElement toCity;
	
	@FindBy(xpath = "//input[@placeholder='To']")
	private WebElement toName;
	
	@FindBy(xpath = "(//div[@class='calc60'])[1]")
	private WebElement selecttoplace;
	
	@FindBy(xpath = "//div[@class='DayPicker-Day']//following::div[@aria-label='Fri May 26 2023']")
	private WebElement departuredate;
	
	@FindBy(xpath = "//label[@for='travellers']")
	private WebElement travellers;
	
	@FindBy(xpath = "//li[@data-cy='adults-1']")
	private WebElement adults;
	
	@FindBy(xpath = "//li[text()='Premium Economy']")
	private WebElement travelclass;
	
	@FindBy(xpath = "//button[text()='APPLY']")
	private WebElement applybutton;
	
	@FindBy(xpath = "//a[text()='Search']")
	private WebElement search;

	public WebElement getFromCity() {
		return fromCity;
	}

	public WebElement getFromName() {
		return fromName;
	}

	public WebElement getSelectfromplace() {
		return selectfromplace;
	}

	public WebElement getToCity() {
		return toCity;
	}

	public WebElement getToName() {
		return toName;
	}

	public WebElement getSelecttoplace() {
		return selecttoplace;
	}

	public WebElement getDeparture() {
		return departuredate;
	}

	public WebElement getTravellers() {
		return travellers;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getTravelclass() {
		return travelclass;
	}

	public WebElement getApplybutton() {
		return applybutton;
	}

	public WebElement getSearch() {
		return search;
	}

}
