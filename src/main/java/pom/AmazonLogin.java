package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin {
	@FindBy(id="nav-link-accountList-nav-line-1")
	private WebElement signin;
	@FindBy(id="ap_email")
	private WebElement userid;
	@FindBy(id="continue")
	private WebElement proceed;
	@FindBy(id="ap_password")
	private WebElement pswd;
	@FindBy(id="signInSubmit")
	private WebElement submit;
	
	public AmazonLogin(WebDriver driver) {
	PageFactory.initElements(driver,this);}
	
	public void signIn() {
		signin.click();}
	public void user() {
		userid.sendKeys("monikaagrawal111@gmail.com");}
	public void contnue() {
		proceed.click();}
	public void pswd() {
		pswd.sendKeys("InvalidPswd!");}
	public void login() {
	submit.click();}
}
	