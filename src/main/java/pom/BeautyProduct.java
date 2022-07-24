package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeautyProduct{
	    @FindBy(xpath="//img[@alt=\"Beauty picks\"]")
	    private WebElement beauty;
	    @FindBy(xpath="//img[contains(@alt,'Hydrocolloid Acne Pimple')]")
		private WebElement product;
        @FindBy(id="add-to-cart-button")
        private WebElement addtocart;
        public BeautyProduct(WebDriver driver) {
        PageFactory.initElements(driver,this);}
	   	public void beauty() {
		beauty.click();}
	   	public void product() {
    	product.click();}
	   	public void addtocart() {
	   	addtocart.click();}
	}
