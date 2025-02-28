package Random;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class R006_lot_sizes {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		   
	       driver.get("https://dhan.co/nse-fno-lot-size/");
	    
	      
	      //Dynamic web table 
	      System.out.println("Dynamic table ");
	   List<WebElement> rowsd =    driver.findElements(By.xpath("//*[@id=\"__next\"]/section[3]/section[1]/div/div/main[1]/article/div[2]/div/table/tbody/tr[1]"));
	   List<WebElement> columnsd =    driver.findElements(By.xpath("//*[@id=\"__next\"]/section[3]/section[1]/div/div/main[1]/article/div[2]/div/table/tbody/tr[1]//td"));
	   
	   for(int i=1;i<rowsd.size();i++)
	   {
		   if(i==1)
		   {
			   for(int j=1;j<=columnsd.size();j++) {
					 WebElement cont=  driver.findElement(By.xpath("//*[@id=\\\"__next\\\"]/section[3]/section[1]/div/div/main[1]/article/div[2]/div/table/tbody/tr["+i+"]//td["+j+"]"));
					 
					 System.out.print(cont.getText()+"\t");
					 
					 if(j==columnsd.size())
						 System.out.println();
					}
		   }
		   
		 /*  for(int j=1;j<=columnsd.size();j++) {
			 WebElement cont=  driver.findElement(By.xpath("//table[@id=\"taskTable\"]//tr["+i+"]//td["+j+"]"));
			 
			System.out.print(cont.getText()+"\t");
			}*/
		   
		   System.out.println();
	   }
	   
	 
	   
	}
}
