package genericLibraries;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities 
{
	public void dropDown (WebElement ele, String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
}