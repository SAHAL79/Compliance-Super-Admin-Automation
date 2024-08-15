package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

// LogXpath=By.ByXPath("//button[@class='ant-btn btn btn-primary w-100 font-weight-semibold mb-2 ng-tns-c1155736741-1 ant-btn-lg ng-star-inserted']");
public class AppTest2 extends AppTest{

    @Test
    public void LogIn() throws InterruptedException {
        driver.get("https://calm-desert-0c018d900.3.azurestaticapps.net/");
        Thread.sleep(5000);
        WebElement logInButton = driver.findElement(By.xpath("//button[@class='ant-btn btn btn-primary w-100 font-weight-semibold mb-2 ng-tns-c1155736741-1 ant-btn-lg ng-star-inserted']"));
    logInButton.click();
    }


}
