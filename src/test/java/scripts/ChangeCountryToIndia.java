package scripts;
import org.testng.annotations.Test;
import genericLibraries.BaseClass;
import pom.ChangeCountry;

public class ChangeCountryToIndia extends BaseClass {
@Test
public void testcase4()
{
	ChangeCountry cc= new ChangeCountry(driver);
	cc.country();
	cc.dropdown();
	cc.option();
	cc.submit();
}
}
