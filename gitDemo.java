
public class GenericMethodsTest
{

	public static void main(String[] args) 
	{

		GenericMethods key = new GenericMethods();
		key.openBrowser("edge");//chrome, firefox,edge,
		key.enterURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		key.enterData("xpath", "//input[@name='username']", "Admin");
		key.enterData("name", "password", "admin123");
		key.clickOnElement("tagName", "button");

	}

}
