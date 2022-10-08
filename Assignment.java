package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\OneDrive\\Desktop\\6th Sem\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//Navigate to the url
		driver.get("https://vprismqc.vidgyor.com/");
		//finding the element
		//This Element is inside single shadow DOM.
		String cssSelectorForHost1 = "amplify-sign-in[class='hydrated']";
		Thread.sleep(1000);
		SearchContext shadow = driver.findElement(By.cssSelector("amplify-sign-in[class='hydrated']")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#email")).sendKeys("testing.123@gmail.com");;
		
		//for password
		//This Element is inside single shadow DOM.
		String cssSelectorForHost2 = "amplify-sign-in[class='hydrated']";
		Thread.sleep(1000);
		SearchContext shadow2 = driver.findElement(By.cssSelector("amplify-sign-in[class='hydrated']")).getShadowRoot();
		Thread.sleep(1000);
		shadow2.findElement(By.cssSelector("#password")).sendKeys("success12");
		
		//This Element is inside single shadow DOM.
		String cssSelectorForHost3 = "amplify-sign-in[class='hydrated']";
		Thread.sleep(1000);
		SearchContext shadow3 = driver.findElement(By.cssSelector("amplify-sign-in[class='hydrated']")).getShadowRoot();
		Thread.sleep(1000);
		shadow3.findElement(By.cssSelector(" amplify-form-section:nth-child(1) > form:nth-child(1) > amplify-section:nth-child(1) > section:nth-child(1) > div:nth-child(4) > div:nth-child(2) > slot:nth-child(1) > div:nth-child(2) > slot:nth-child(1) > amplify-button:nth-child(1) > button:nth-child(1)")).click();
	
	}

}
