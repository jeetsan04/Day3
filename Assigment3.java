package assignment2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment3 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement elementUserName = driver.findElement(By.id("username"));
		elementUserName.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("TestLeaf Pvt.Ltd");
		
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Sanjeet");
		
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Kumar");
		
		WebElement elementLocalName = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementLocalName.sendKeys("Jeet");
		
		WebElement elementLocalLastName = driver.findElement(By.id("createLeadForm_lastNameLocal"));
		elementLocalLastName.sendKeys("Mahato");
		
		
		WebElement elementSalutation = driver.findElement(By.id("createLeadForm_personalTitle"));
		elementSalutation.sendKeys("formal address");
		
		WebElement elementBirth = driver.findElement(By.name("birthDate"));
		elementBirth.sendKeys("20-04-1997");
		
		driver.findElement(By.className("smallSubmit")).click();
		
	}
	

}
