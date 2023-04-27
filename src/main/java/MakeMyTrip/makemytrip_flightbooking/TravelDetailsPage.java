package MakeMyTrip.makemytrip_flightbooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravelDetailsPage extends BaseClass {

	public TravelDetailsPage(WebDriver driver) {
    PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),' I will risk my trip.')]")
	private WebElement radiobutton;
	
	@FindBy(xpath = "//div[@class='adultListWrapper']//following::button[@class='addTravellerBtn']")
	private WebElement addDetails;
	
	@FindBy(xpath = "//input[@placeholder='First & Middle Name']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement lastname;
	
	@FindBy(xpath = "//label[@tabindex='1']")
	private WebElement gender;
	
	@FindBy(xpath = "//input[@placeholder='Mobile No']")
	private WebElement mobileno;
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement email;
	
	@FindBy(xpath = "//div[@class='emailId']")
	private WebElement emailclick;
	
	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement continuebutton;
	
	@FindBy(xpath = "//button[text()='CONFIRM']")
	private WebElement confirmbutton;
	
	@FindBy(xpath = "//span[@class='fontSize16 linkText']")
	private WebElement letmechooseseat;
	
	@FindBy(xpath = "(//div[@class='seatBlock pointer'])[21]")
	private WebElement seatno;
	
	@FindBy(xpath = "//button[contains(@class,'lato-black button')]")
	private WebElement seatcontinuebutton;
	
	@FindBy(xpath = "//button[contains(@class,'lato-black button')]")
	private WebElement mealcontinuebutton;
	
	public WebElement getContinuebutton() {
		return continuebutton;
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getAddDetails() {
		return addDetails;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getMobileno() {
		return mobileno;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getEmailclick() {
		return emailclick;
	}

	public WebElement getConfirmbutton() {
		return confirmbutton;
	}

	public WebElement getLetmechooseseat() {
		return letmechooseseat;
	}

	public WebElement getSeatno() {
		return seatno;
	}

	public WebElement getSeatcontinuebutton() {
		return seatcontinuebutton;
	}

	public WebElement getMealcontinuebutton() {
		return mealcontinuebutton;
	}
	
	
	
	
}
