package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangeCountry 	{
	@FindBy(xpath="(//span[text()='United States'])")
	    private WebElement country;
	@FindBy(xpath="//span[@data-action='a-dropdown-button']")
		private WebElement dropdown;
	@FindBy(id="icp-dropdown_7")
		private WebElement option;
	@FindBy(xpath="(//input[@type='submit'])[2]")
		private WebElement submit;
		
	public ChangeCountry(WebDriver driver) {
		PageFactory.initElements(driver,this);}
			
	public void country() {
		country.click();}
	public void dropdown() {
		dropdown.click();}
	public void option() {
		option.click();}
	public void submit() {
		submit.click();}
}