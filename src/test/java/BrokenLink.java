import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");	
		
		HttpURLConnection conn=null;
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.id("a"));
		for(WebElement link:links) {
			String urlName=link.getAttribute("href");
			if(urlName!=null || urlName.isEmpty()) {
				System.out.println("Empty url");
				continue;
			}
			try {
				URL linkUrl=new URL(urlName);
			    conn=(HttpURLConnection)linkUrl.openConnection();
				conn.connect();
				
				if(conn.)
			}
			catch(Exception e) {
				
			}
			
		}
		
		
		
		
		
		
	}

}
