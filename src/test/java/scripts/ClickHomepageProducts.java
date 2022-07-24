package scripts;

import org.testng.annotations.Test;
import genericLibraries.BaseClass;
import pom.HomepageProductsAreClickable;
public class ClickHomepageProducts extends BaseClass{
	@Test (priority=-1)
public void testcase5()
{
HomepageProductsAreClickable hpprc= new HomepageProductsAreClickable(driver);
hpprc.keyboard();
}
}