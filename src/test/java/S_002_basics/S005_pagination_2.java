package S_002_basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class S005_pagination_2 {
	private static final String Interger = null;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
	//	options.addArguments("headless");
//it is complete
		 ChromeDriver driver = new ChromeDriver(options) ;
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.navigate().to("https://www.ecomdeveloper.com/demo/admin/index.php");


		
		 driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("demoadmin");
				 
		 driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("demopass");
		 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		 driver.findElement(By.xpath("//*[text()=\" Customers\"]")).click();
		
		 driver.findElement(By.xpath("//ul[@id=\"collapse9\"]//a[text()='Customers']")).click();
		 
		 
		String page_text =  driver.findElement(By.xpath("//div[@class=\"col-sm-6 text-right\"]")).getText();
		String page_s = page_text.substring(page_text.indexOf('(')+1, page_text.indexOf("Pages")-1);
		int pages = Integer.parseInt(page_s);
		System.out.println(pages);
		
		for(int i=1;i<=pages;i++)
		{
			if(i>1) {
				
				driver.findElement(By.xpath("//ul[@class=\"pagination\"]//li//a[text()="+i+"]")).click();
			}
			//table[@class="table table-bordered table-hover"]//tr//td
			//rows
			List<WebElement> rows = driver.findElements(By.xpath("//table[@class=\"table table-bordered table-hover\"]//tr"));
			
			//columns
			List<WebElement> columns = driver.findElements(By.xpath("//table[@class=\"table table-bordered table-hover\"]//tr[2]//td"));
			
			System.out.println("Rows size is :- "+rows.size()+"Columns size is :- "+columns.size());
			
			Thread.sleep(2000);
			for(int j=1;j<=rows.size()-1;j++)
			{				
				for(int k=1;k<=columns.size();k++)
				{
				String text=	driver.findElement(By.xpath("//table[@class=\"table table-bordered table-hover\"]//tr["+j+"]//td["+k+"]")).getText();
				System.out.print(text+"\t");
				}
				System.out.println();
			}
			
		
		}
		
	}
}
