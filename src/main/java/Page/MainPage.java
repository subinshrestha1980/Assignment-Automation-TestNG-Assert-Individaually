package Page;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MainPage extends BasePage {

	WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "categorydata")
	WebElement AddCategory;

	@FindBy(how = How.CSS, using = "input[value='Add category']")
	WebElement AddCategory_Button;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[37]/span")
	WebElement Validation;

	@FindBy(how = How.XPATH, using = "/html/body/span[2]")
	WebElement Duplicate_Validation;

	@FindBy(how = How.XPATH, using = "/html/body/div[4]/span/select[3]")
	WebElement Month_DropDownValidation;

	@FindBy(how = How.XPATH, using = "/html/body/div[4]/span/select[3]/option[2]")
	WebElement Month_January;

	@FindBy(how = How.XPATH, using = "/html/body/div[4]/span/select[3]/option[3]")
	WebElement Month_Feburary;

	@FindBy(how = How.XPATH, using = "/html/body/div[4]/span/select[3]/option[4]")
	WebElement Month_March;

	@FindBy(how = How.XPATH, using = "/html/body/div[4]/span/select[3]/option[5]")
	WebElement Month_April;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/span/select[3]/option[6]")
	WebElement Month_May;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/span/select[3]/option[7]")
	WebElement Month_June;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/span/select[3]/option[8]")
	WebElement Month_July;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/span/select[3]/option[9]")
	WebElement Month_August;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/span/select[3]/option[10]")
	WebElement Month_September;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/span/select[3]/option[11]")
	WebElement Month_October;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/span/select[3]/option[12]")
	WebElement Month_November;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/span/select[3]/option[13]")
	WebElement Month_December;
	
	public void AddCategory_Cell(String Category) {
		AddCategory.sendKeys(Category);
	}

	public void AddCategory_CellButton() {
		AddCategory_Button.click();
	}

	public void Month(String Monthly) {
		waitforElement(driver, 2, Month_DropDownValidation);
		Month_DropDownValidation.click();
		selectFromDropdown(Month_DropDownValidation, Monthly);
		Assert.assertEquals(Month_January.getText(), "Jan", "January not found !!");
		System.out.println("Element found: " + Month_January.getText());
		waitforElement(driver, 5, Month_DropDownValidation);
	}

	public void Month_Feb(String Monthly2) {
		Month_DropDownValidation.click();
		selectFromDropdown(Month_DropDownValidation, Monthly2);
		waitforElement(driver, 5, Month_DropDownValidation);
		Assert.assertEquals(Month_Feburary.getText(), "Feb", "Feburary not found !!");
		System.out.println("Element found: " + Month_Feburary.getText());
	}

	public void Month_Mar(String Monthly3) {
		Month_DropDownValidation.click();
		selectFromDropdown(Month_DropDownValidation, Monthly3);
		Assert.assertEquals(Month_March.getText(), "Mar", "March not found !!");
		System.out.println("Element found: " + Month_March.getText());
		Month_DropDownValidation.click();
			}
	public void Month_Apr(String Monthly4) {
		Month_DropDownValidation.click();
		selectFromDropdown(Month_DropDownValidation, Monthly4);
		Assert.assertEquals(Month_April.getText(), "Apr", "April not found !!");
		System.out.println("Element found: " + Month_April.getText());
		Month_DropDownValidation.click();
	}
		public void Month_May(String Monthly5) {
			Month_DropDownValidation.click();
			selectFromDropdown(Month_DropDownValidation, Monthly5);
			waitforElement(driver, 5, Month_DropDownValidation);
			Assert.assertEquals(Month_May.getText(), "May", "May not found !!");
			System.out.println("Element found: " + Month_May.getText());
		}

		public void Month_Jun(String Monthly6) {
			Month_DropDownValidation.click();
			selectFromDropdown(Month_DropDownValidation, Monthly6);
			Assert.assertEquals(Month_June.getText(), "Jun", "June not found !!");
			System.out.println("Element found: " + Month_June.getText());
			Month_DropDownValidation.click();
				}
		public void Month_Jul(String Monthly7) {
			Month_DropDownValidation.click();
			selectFromDropdown(Month_DropDownValidation, Monthly7);
			Assert.assertEquals(Month_July.getText(), "Jul", "July not found !!");
			System.out.println("Element found: " + Month_July.getText());
			Month_DropDownValidation.click();
	}
		public void Month_Aug(String Monthly8) {
			Month_DropDownValidation.click();
			selectFromDropdown(Month_DropDownValidation, Monthly8);
			Assert.assertEquals(Month_August.getText(), "Aug", "August not found !!");
			System.out.println("Element found: " + Month_August.getText());
			Month_DropDownValidation.click();
	}
		public void Month_Sep(String Monthly9) {
			Month_DropDownValidation.click();
			selectFromDropdown(Month_DropDownValidation, Monthly9);
			Assert.assertEquals(Month_September.getText(), "Sep", "September not found !!");
			System.out.println("Element found: " + Month_September.getText());
			Month_DropDownValidation.click();
	}
		public void Month_Oct(String Monthly10) {
			Month_DropDownValidation.click();
			selectFromDropdown(Month_DropDownValidation, Monthly10);
			Assert.assertEquals(Month_October.getText(), "Oct", "October not found !!");
			System.out.println("Element found: " + Month_October.getText());
			Month_DropDownValidation.click();
	}
		public void Month_Nov(String Monthly11) {
			Month_DropDownValidation.click();
			selectFromDropdown(Month_DropDownValidation, Monthly11);
			Assert.assertEquals(Month_November.getText(), "Nov", "November not found !!");
			System.out.println("Element found: " + Month_November.getText());
			Month_DropDownValidation.click();
	}
		public void Month_Dec(String Monthly12) {
			Month_DropDownValidation.click();
			selectFromDropdown(Month_DropDownValidation, Monthly12);
			Assert.assertEquals(Month_December.getText(), "Dec", "December not found !!");
			System.out.println("Element found: " + Month_December.getText());
			Month_DropDownValidation.click();
	}
	// div[3]/a[47]/span

	public void verifyEnteredName(String enterName) {
		
		List<WebElement> mainpageText = driver.findElements(By.xpath("//div/a/span"));

		for (WebElement lookingforKathmandu : mainpageText) {

			String abc = lookingforKathmandu.getText();

			// System.out.println(abc);

			if (lookingforKathmandu.getText().equalsIgnoreCase("Kathmandu")) {

				System.out.println("Element Present: " + abc);

			} else {
				// System.out.println("Element Not Present");
				// }
			}
		}
	}

	public void duplicate_validationPage() throws InterruptedException {

		MainPage loginvalidation = PageFactory.initElements(driver, MainPage.class);

		loginvalidation.AddCategory_Cell("Kathmandu");
		loginvalidation.AddCategory_CellButton();
		Assert.assertEquals(Duplicate_Validation.getText(), "Kathmandu", "Kathmandu Not Found");
		System.out.println("The category you want to add already exists: " + Duplicate_Validation.getText());
		driver.navigate().back();

//		Assert.assertEquals(Month_DropDownValidation.getText(), "Jan", "January month Not Found");
//		System.out.println("Month:"  + Month_DropDownValidation);

	}
}

//		List<WebElement> mainpageText = driver.findElements(By.tagName("span"));
//		System.out.println("This List of Web Element is :" + mainpageText.size());;
//		
//				
//		if(mainpageText.size()>1)
//		{
//			mainpageText.get(0).click();
//			String text =mainpageText.get(0), getText();
//			System.out.println("The clicked element is: " +text));
//
//			if (text.equalsIgnoreCase("This is Add Category"));
//			{
//				System.out.println("Element Kathmandu Found !");
//			}
//			else {
//				System.out.println("Element not Found ! SOORY!!");
//			}
//		}
//	}

//		String abc= driver.findElement(By.xpath("//div[3]/a[47]/span")).getText();
//		System.out.println(abc);
//		
//		String before_xpath = "//div[3]/a[";
//		String after_xpath = "]/span";
//
//		for (int i = 1; i <= 60; i++) {
//			// @findBy(how=How.XPATH, using ="before_xpath" +i+"after_xpath").getText();
//			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
//			// Assert.assertEquals(name, enterName, "Entered name doesnot exist");
//			System.out.println(name);
//
//			if (name.contains(enterName)) {
//				System.out.println("entered name exist");
//				driver.findElement(By.xpath("//div[3]/a[" + i + "]/span")).getText();
//
//				System.out.println(AddCategory.getText());
//				Assert.assertEquals(Validation.getText(), "Kathmandu", " Kathmandu not found");
