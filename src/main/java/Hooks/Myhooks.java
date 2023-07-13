package Hooks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Myhooks 
{
   public WebDriver driver;
   @Before
   public void setup() throws IOException
   {
	   FileInputStream f=new FileInputStream("D:\\lang\\Java\\Demo100\\src\\Config\\config.properties");
	   System.out.println(f);
	   Properties p=new Properties();
	   p.load(f);

	   if(p.getProperty("browser").equals("chrome"))
	   {
		   driver=new ChromeDriver();
	   }
	   else if(p.getProperty("browser").equals("Edge"))
	   {
		   driver=new EdgeDriver();
	   }
	   else
	   {
		   driver=new FirefoxDriver();
	   }
	   driver.get(p.getProperty("url"));
   }
    @After
    public void tearDown(Scenario scenario)
    {
    	String scenarioName=scenario.getName().replaceAll(" "," _");
    	if(scenario.isFailed())
    	{
    		byte[] srcScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    		scenario.attach(srcScreenshot, "image/jpj", scenarioName);
    	}
    	 driver.quit();
    }
		   
}
