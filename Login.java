package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.Then;

public class Login {
	public static WebDriver ldriver;
	public Login(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id="input-1")
	WebElement textemail;
	
	@FindBy(id="input-2")
	WebElement textpassword;
	
	@FindBy(xpath="//*[@id=\"tab-1-content-1\"]/div[1]/form/div[4]/button/div/span")
	WebElement login;
	
	By search=By.xpath("/html/body/div[4]/div/div/div/div/div[1]/nav/div/div[2]/ul[1]/li/div/div/div/div/input");
			
	By clk=By.xpath("//*[@id=\"hr_v2\"]");
	
	public void setusername(String uname)
	{
		textemail.clear();
		textemail.sendKeys(uname);
	}
	public void setpassword(String pwd)
	{
		textpassword.clear();
		textpassword.sendKeys(pwd);
	}
	public void clicklog()
	{
		login.click();
	}
		public void searchclick(String java)
	{
		ldriver.findElement(search).sendKeys(java);
		
	}
		public void click2()
		{
			ldriver.findElement(clk).click();
		}
	}

	

