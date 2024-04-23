package Daily_Readings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhishreshthag\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		System.out.println("Abhi is my priority");

		System.out.println("Roli is my priority");
		
		System.out.println("Payal is my priority");
		
		System.out.println("ABC is my priority");

	}

}
