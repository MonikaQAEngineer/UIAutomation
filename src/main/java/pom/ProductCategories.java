package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCategories 
{			
	@FindBy(id="searchDropdownBox")
	private WebElement searchdropdown;
	public WebElement getSearchdropdown() {
		return searchdropdown;}
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchbox;
	@FindBy(id="nav-search-submit-button")
	private WebElement submit;
	
	public ProductCategories(WebDriver driver) {
		PageFactory.initElements(driver,this);}
	
	public void searchbox() {
		searchbox.sendKeys("Laptop");}
	public void submit() {
		submit.click();}	
}
