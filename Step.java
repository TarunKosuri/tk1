package StepDefinitionss;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import page.Login;

public class Step 
{
	public WebDriver Driver;
	public Login lp;
	@Given("user opens firefox browser")
	public void user_opens_firefox_browser()
		{
// 			System.setProperty("webdriver.firefox.marionette",".//Drivers.geckodriver.exe");	
//			System.setProperty("webdriver.edge.driver","C:\\Users\\I-Ray\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//			WebDriverManager.firefoxdriver().setup();
//			Driver = new FirefoxDriver();
			WebDriverManager.chromedriver().setup();
			Driver = new ChromeDriver();
			lp=new Login(Driver);
//			Driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}

//			@When("user opens url\"https:\\/\\/www.udemy.com\\/join\\/login-popup\\/?locale=en_US&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2F\"")
//			public void user_opens_url_https_www_udemy_com_join_login_popup_locale_en_us_response_type_html_next_https_3a_2f_2fwww_udemy_com_2f() {
		
//		}
			@When("user opens url {string}")
			public void user_opens_url(String url)
			{
				Driver.get(url);
				Driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			}
			@When("user enters email as {string} and password as {string}")
			public void user_enters_email_as_and_password_as(String textemail, String textpassword)
			{
				lp.setusername(textemail);
				lp.setpassword(textpassword);
			}
			@When("click on login")
			public void click_on_login() 
			{
				lp.clicklog();
			}
			

			@Then("go to search bar and click and then enter java")
			public void go_to_search_bar_and_click_and_then_enter_java() 
			{
				lp.searchclick("java");
			}
			
	/*		@Then("page title should be {string}")
			public void page_title_should_be(String title)
			{
				if(Driver.getPageSource().contains("Dashboard | HackerRank")) {
					//Driver.close();
					Assert.assertTrue(true);
			} 
				else
				{
					Assert.assertEquals(title,Driver.getTitle());
				}	   
			}
			
			@Then("select java inheritance from the dropdown")
			public void select_java_inheritance_from_the_dropdown()
			{
			   lp.click2();
			}	
				
			*/
			
			@Then("close browser")
			public void close_browser() {
//  		Driver.close();
	}
}
