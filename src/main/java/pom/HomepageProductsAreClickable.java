package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageProductsAreClickable {
@FindBy(xpath="//img[@alt=\"Keyboards\"]")
private WebElement keyboard;
public HomepageProductsAreClickable(WebDriver driver) {
PageFactory.initElements(driver,this);}
public void keyboard() {
keyboard.click();}}


