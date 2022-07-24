package scripts;
import org.testng.annotations.Test;
import genericLibraries.BaseClass;
import pom.BeautyProduct;
public class AddToCart extends BaseClass{
	@Test
public void testcase2()
{
	BeautyProduct bp=new BeautyProduct(driver);
	bp.beauty();
	bp.product();
	bp.addtocart();
}
}
