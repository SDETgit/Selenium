package P001_Practice_1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class P002_WebTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		   
	       driver.get("https://testautomationpractice.blogspot.com/");
	       //static web table 
	      List<WebElement> rows =  driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr"));
	      List<WebElement> columns =  driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr[2]//td"));
	      
	      for(int i=1;i<rows.size();i++)
	      {
	    	  for(int j=1;j<=columns.size();j++)
	    	  {
	    		  if(i==1)
	    		  {
	    			  WebElement content = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+i+"]//th["+j+"]"));
		    		  System.out.print(content.getText()+"\t");
	    		  }
	    		  if(i>1) {
	    		  WebElement content = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+i+"]//td["+j+"]"));
	    		  System.out.print(content.getText()+"\t");
	    		  }
	    	  }
	    	  System.out.println();
	    	  
	      }
	      
	      //Dynamic web table 
	      System.out.println("Dynamic table ");
	   List<WebElement> rowsd =    driver.findElements(By.xpath("//table[@id=\"taskTable\"]//tr"));
	   List<WebElement> columnsd =    driver.findElements(By.xpath("//table[@id=\"taskTable\"]//tr[1]//td"));
	   
	   for(int i=1;i<rowsd.size();i++)
	   {
		   if(i==1)
		   {
			   for(int j=1;j<=columnsd.size();j++) {
					 WebElement cont=  driver.findElement(By.xpath("//table[@id=\"taskTable\"]//tr["+i+"]//th["+j+"]"));
					 
					 System.out.print(cont.getText()+"\t");
					 
					 if(j==columnsd.size())
						 System.out.println();
					}
		   }
		   
		   for(int j=1;j<=columnsd.size();j++) {
			 WebElement cont=  driver.findElement(By.xpath("//table[@id=\"taskTable\"]//tr["+i+"]//td["+j+"]"));
			 
			 System.out.print(cont.getText()+"\t");
		   }
		   System.out.println();
	   }
	   
	   //Pagination table 
	   System.out.println("Pagination table ");
	   List<WebElement> rowsp = driver.findElements(By.xpath("//table[@id=\"productTable\"]//tr"));
	   List<WebElement> columnsp = driver.findElements(By.xpath("//table[@id=\"productTable\"]//tr[1]//td"));
	   List<WebElement> pages = driver.findElements(By.xpath("//ul[@class=\"pagination\"]//li"));
	   System.out.println(rowsp.size());
	   for(int i=1;i<=pages.size();i++)
	   {
		   if(i>1)
		   {
			   Thread.sleep(200);
			   driver.findElement(By.xpath("//ul[@class=\"pagination\"]//li["+i+"]")).click();
		   }
		   
		   for(int k=1;k<rowsp.size();k++) {
			   for(int j=1;j<=columnsp.size();j++)
			   {
				   WebElement pag=driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+k+"]//td["+j+"]"));
				   System.out.print(pag.getText()+"\t");
				   if(j==4) {
					   driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+k+"]//td["+j+"]//input")).click();
				   }
				   
			   }
			   System.out.println();
		   }
		   
	   }
	   
	}

}
