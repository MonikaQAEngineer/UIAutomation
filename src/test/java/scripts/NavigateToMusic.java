package scripts;
import org.testng.annotations.Test;
import genericLibraries.BaseClass;
import pom.Navigation;

public class NavigateToMusic extends BaseClass{
	@Test (priority =-1)
	public void testcase6()
	{
		Navigation nav=new Navigation (driver);
		nav.menu();
		nav.music();
		nav.podcast();
	}

}
