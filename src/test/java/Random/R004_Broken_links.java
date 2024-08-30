package Random;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class R004_Broken_links {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		int resCode = 200;
		int brokenl = 0;
   
		List <WebElement> links = driver.findElements(By.tagName("a"));
        for(WebElement l : links)
		 {
		               String url = l.getAttribute("href");
		               if(url== null || url.isEmpty())
		               {
		                              System.out.println("Cannot validate as url is null or empty ");
		                              continue;
		               }
		               try {
		                              URL urlLink = new URL(url);
		                              HttpURLConnection huc = (HttpURLConnection) urlLink.openConnection();  //open connection to the server
		                              huc.setRequestMethod("HEAD");
		                              huc.connect(); //connect to server and send request
		                             resCode = huc.getResponseCode();

		                             if(resCode>400)
		                              {
		                                            System.out.println(url+" is broken and rescode is "+resCode);
		                                            brokenl++;
		                             }
		                             else {
		                                            System.out.println(url + " Link is working fine and rescode is "+resCode);
		                              }
		              }catch(MalformedURLException e) {
		              }
		               catch(Exception e)
		               {
		              }
		 }
		 System.out.print("Total links in the webpage is :- "+links.size());
		 System.out.print("Total broken links in the webpage is :- "+brokenl);
         System.out.print("Total fine links in the webpage is :- " + (links.size()-brokenl));
		 driver.quit();
		
		
	}	

}
