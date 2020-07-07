package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class corsaSelenium {
	
	public Float test(String value1, String value2) {

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://convertlive.com/it/u/convertire/miglia-allora/a/chilometri-allora");
		
		driver.findElement(By.xpath("//*[@id=\"convert-value\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"convert-value\"]")).sendKeys(value1);
		driver.findElement(By.xpath("//*[@id=\"convert-submit\"]")).click();
		WebElement box1 = driver.findElement(By.xpath("//*[@id=\"converter\"]/div[4]/p/span[4]"));
		String s1 = box1.getText();
				
		driver.findElement(By.xpath("//*[@id=\"convert-value\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"convert-value\"]")).sendKeys(value2);
		driver.findElement(By.xpath("//*[@id=\"convert-submit\"]")).click();
		WebElement box2 = driver.findElement(By.xpath("//*[@id=\"converter\"]/div[4]/p/span[4]"));
		String s2 = box2.getText();
		
		// calcoli usando i m/s
		Float n1 = 1000*Float.parseFloat(s1);
		Float n2 = 1000*Float.parseFloat(s2);
		Float t1 = (20000*3600)/n1; // t = x/v
		Float t2 = (20000*3600)/n2;
		
		System.out.println(t2-t1);
		
		Float t = (t2-t1)/60; // tempo risparmiato in minuti
		
		System.out.println(t);
		driver.close();

		return t;
	
	}

}
