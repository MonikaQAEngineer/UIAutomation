package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation {
	@FindBy(id="nav-hamburger-menu")
	private WebElement Allmenu;
	@FindBy(xpath="//div[text()='Amazon Music']")
	private WebElement Music;
	@FindBy(xpath="//a[text()='Podcasts']")
	private WebElement Podcast;
	public Navigation(WebDriver driver) {
    PageFactory.initElements(driver,this);}
	public void menu() {
	Allmenu.click();}
	public void music() {
    Music.click();}
	public void podcast() {
	Podcast.click();}
}