package Pages;

import org.openqa.selenium.By;

public class AccountServices extends OpenBrowser {
    public void settranferloan() {
        driver.findElement(By.linkText("Transfer Funds")).click();
        driver.findElement(By.id("amount")).sendKeys("1000");
        driver.findElement(By.xpath("//input[@value='Transfer']")).click();


    }
    public void Requestloan(){
        driver.findElement(By.linkText("Request Loan")).click();
        driver.findElement(By.id("amount")).sendKeys("1000");
        driver.findElement(By.id("downPayment")).sendKeys("10");
        driver.findElement(By.xpath("//input[@value='Apply Now']")).click();

    }
    public void OpenNewacc(){
        driver.findElement(By.linkText("Open New Account")).click();
        driver.findElement(By.xpath("//input[@value='Open New Account']")).click();
    }
    public void Logout(){
        driver.findElement(By.linkText("Log Out")).click();

    }
}