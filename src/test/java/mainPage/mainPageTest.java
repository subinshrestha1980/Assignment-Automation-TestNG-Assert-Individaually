package mainPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.MainPage;

import util.BrowserFactory;

@Test
public class mainPageTest {

	WebDriver driver;
	String enterName;

	public void mainPageTest1() throws InterruptedException {
		driver = BrowserFactory.init();

		MainPage login = PageFactory.initElements(driver, MainPage.class); // this will pass driver to LoginPage
		login.AddCategory_Cell("Kathmandu");
		login.AddCategory_CellButton();
		// login.verifyEnteredName(enterName);
		login.verifyEnteredName(enterName);
		login.duplicate_validationPage();

		login.Month("Jan");
		login.Month_Feb("Feb");
		login.Month_Mar("Mar");
		login.Month_Apr("Apr");
		login.Month_May("May");
		login.Month_Jun("Jun");
		login.Month_Jul("Jul");
		login.Month_Aug("Aug");
		login.Month_Sep("Sep");
		login.Month_Oct("Oct");
		login.Month_Nov("Nov");
		login.Month_Dec("Dec");
		
		BrowserFactory.tearDown();
		
	}
}
