import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://practice.expandtesting.com/dynamic-table");	
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		List<WebElement>rows=driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
        
		for(int r=1;r<=rows.size();r++) {
			// //table[@class='table table-striped']/tbody/tr[2]/td[1]
			WebElement name=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr["+r+"]/td[1]"));
			if(name.getText().startsWith("C"))
			{
				// //td[starts-with(text(),'C')]/following-sibling::*[contains(text(),'%')]
				String cpuLoad=driver.findElement(By.xpath("//td[starts-with(text(),'C')]/following-sibling::*[contains(text(),'Mbps')]")).getText();
				System.out.println(cpuLoad);
			}
			
		}
		driver.quit();
	}

}
