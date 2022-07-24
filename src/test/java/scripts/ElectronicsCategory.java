package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;
import genericLibraries.BaseClass;
import pom.ProductCategories;

public class ElectronicsCategory extends BaseClass{
@Test
public void testcase3() throws FileNotFoundException, IOException
  {
	ProductCategories pc= new ProductCategories(driver);
	utilities.dropDown(pc.getSearchdropdown(), pdata.getData("Category"));
	pc.searchbox();
	pc.submit();
 }
}