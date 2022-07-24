package scripts;
import org.testng.annotations.Test;
import genericLibraries.BaseClass;
import pom.AmazonLogin;
public class InvalidLogin extends BaseClass{
 @Test
 public void testcase1()
 {
	AmazonLogin al= new AmazonLogin(driver);
	al.signIn();
	al.user();
	al.contnue();
	al.pswd();
	al.login();
 }
}
