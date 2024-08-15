package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeOptions;



public class AppTest {
   WebDriver driver;

   @Test
   public void browser() throws InterruptedException {
    //  WebDriver  driver= new ChromeDriver();

      ChromeOptions options = new ChromeOptions();
      options.addArguments("--allow-running-insecure-content");
      options.addArguments("--ignore-certificate-errors");
      driver = new ChromeDriver(options);
      driver.manage().window().maximize();

      driver.get("https://calm-desert-0c018d900.3.azurestaticapps.net/");
      Thread.sleep(2000);

      WebElement logInButton = driver.findElement(By.xpath("//button[@class='ant-btn btn btn-primary w-100 font-weight-semibold mb-2 ng-tns-c1155736741-1 ant-btn-lg ng-star-inserted']"));
      logInButton.click();
      Thread.sleep(3000);
      /*WebElement AdvancedButton = driver.findElement(By.id("details-button"));
      AdvancedButton.click();
      WebElement ProceedButton = driver.findElement(By.id("proceed-link"));
      ProceedButton.click();*/
      WebElement UserName = driver.findElement(By.id("username"));
      UserName.sendKeys("nazmul.hossain.bs23@yopmail.com");
      Thread.sleep(2000);
      WebElement PasswordField = driver.findElement(By.id("password"));
      PasswordField.sendKeys("123456@Aa");
       Thread.sleep(1000);
      WebElement SignButton = driver.findElement(By.id("kc-login"));
      SignButton.click();
      Thread.sleep(10000);
      //WebElement
      WebElement ComplianceOfficerMenu = driver.findElement(By.xpath("//span[normalize-space()='Compliance Officers']"));
      ComplianceOfficerMenu.click();
      Thread.sleep(5000);
      WebElement InvitedComplianceOfficer = driver.findElement(By.xpath("//a[normalize-space()='Invited']"));
      InvitedComplianceOfficer.click();
      Thread.sleep(3000);
      WebElement AddNewButton = driver.findElement(By.cssSelector("button[type='button'] span[class='ng-star-inserted']"));
      AddNewButton.click();
      Thread.sleep(3000);
      WebElement TypeComMail =driver.findElement(By.xpath("//input[@name='email']"));
      TypeComMail.sendKeys("auto.com.bs23@ypmail.com");
      Thread.sleep(4000);
      WebElement AddButton =driver.findElement(By.xpath("//span[normalize-space()='Add']"));
      AddButton.click();

      closeBrowser(driver);

   }

   private static void closeBrowser(WebDriver driver) {
      driver.close();
   }
  /* @AfterMethod
   public void closeBrowser(){
     driver.close();
   }*/

}
