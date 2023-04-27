package MakeMyTrip.makemytrip_flightbooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager extends BaseClass {
	
	public PageObjectManager(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	private MakeMyTripHomePage hom;
	private SearchPage sp;
	private TravelDetailsPage tp;
	public MakeMyTripHomePage getHom() {
		hom=new MakeMyTripHomePage(driver);
		return hom;
	}
	public SearchPage getSp() {
		sp=new SearchPage(driver);
		return sp;
	}
	public TravelDetailsPage getTp() {
		tp=new TravelDetailsPage(driver);
		return tp;
	}
	

}
