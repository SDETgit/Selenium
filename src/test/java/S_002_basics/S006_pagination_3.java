package S_002_basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class S006_pagination_3 {
	private static final String Interger = null;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
	//	options.addArguments("headless");

		 ChromeDriver driver = new ChromeDriver(options) ;
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.navigate().to("https://datatables.net/examples/advanced_init/dt_events.html");
		
	 
		String page_text =  driver.findElement(By.xpath("//div[@class=\"dt-info\"]")).getText();
		System.out.println(page_text);
		String page_s = page_text.substring(page_text.indexOf("f")+2, page_text.indexOf("entries")-1);
		int pages = Integer.parseInt(page_s);
		System.out.println(pages);
		
		for(int i=1;i<=6;i++)
		{
			if(i>1) {
				if(driver.findElement(By.xpath("//button[@class=\"dt-paging-button\" and text()="+i+"]")).isDisplayed()==true) {
				driver.findElement(By.xpath("//button[@class=\"dt-paging-button\" and text()="+i+"]")).click();}
				else 
				{
					driver.findElement(By.xpath("//button[@class=\"dt-paging-button disabled next\"]")).click();
					continue;
				}
			}
			//table[@class="table table-bordered table-hover"]//tr//td
			//rows
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id=\"example\"]//tbody//tr"));
			
			//columns
			List<WebElement> columns = driver.findElements(By.xpath("//table[@id=\"example\"]//tbody//tr[2]//td"));
			
			System.out.println("Rows size is :- "+rows.size()+"Columns size is :- "+columns.size());
			
			Thread.sleep(2000);
			for(int j=1;j<=rows.size();j++)
			{				
				for(int k=1;k<=columns.size();k++)
				{
				String text=	driver.findElement(By.xpath("//table[@id=\"example\"]//tbody//tr["+j+"]//td["+k+"]")).getText();
				System.out.print(text+"\t");
				}
				System.out.println();
			}
			
		
		}
		
	}
}
