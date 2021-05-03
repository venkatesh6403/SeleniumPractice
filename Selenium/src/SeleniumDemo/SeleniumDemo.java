package SeleniumDemo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumDemo {


public static void main(String[] args) throws InterruptedException, IOException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vpillare\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	BufferedReader ConsoleInputRead= new BufferedReader(new InputStreamReader(System.in));
	driver.get("https://www.google.com");
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("RCB");
	Thread.sleep(1000);

	int n = driver.findElements(By.xpath("//div[@class='aajZCb']/ul/li")).size();
	System.out.println(n);
	System.out.println("Search Results are, enter the number which you want to select");
	 String SearchResults = null;
	for(int i=1;i<n;i++)
	{
		System.out.println(i);
		 SearchResults = driver.findElement(By.xpath("//div[@class='aajZCb']/ul/li['"+i+"']")).getAttribute("placeholder"); 
		System.out.println("//div[@class='aajZCb']/ul/li['"+i+"']");
		System.out.println(i);
		System.out.println(SearchResults);
		
	}
	System.out.println(SearchResults);
	String UserInput = ConsoleInputRead.readLine();
	Thread.sleep(1000);
	System.out.println(UserInput);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[@class='aajZCb']/ul/li['"+UserInput+"'])")).click();
	
}
}
 