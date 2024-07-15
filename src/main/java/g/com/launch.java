package g.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
		   
		   //get url

        driver.get("https://www.facebook.com/");
    
        //Maximize the window
      //Maximize the window
        driver.manage().window().maximize();
      
        // Verify the page titleeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        // Close the browser window
        driver.quit();
        driver.close();
       


	}

}
