
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import Hooks.Myhooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login2
{

	static WebDriver driver;
    @FindBy(id="email")
	By Txt_username;
    By Txt_password=By.name("pass");
    By Txt_button=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");

    



@Given("I want to open browser")
public void i_want_to_open_browser() 
{
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 }
Login l;
@And("i am on the login page")
public void i_am_on_the_login_page() 
{
	   Myhooks h=new Myhooks();
	   driver=(WebDriver)h.driver;
	   l=new Login();

}

@When("I want to enter username and password")
public void i_want_to_enter_username_and_password() 
{
  l.i_want_to_enter_username_and_password();
}

@And("I want to click an login button")
public void i_want_to_click_an_loginbutton() 
{
  l.i_want_to_click_an_loginbutton();
}

@Then("I should be logged in")
public void i_should_be_logged_in() 
{
  String title=driver.getTitle();
  System.out.println(title);
}


}

