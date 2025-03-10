package Pages;

import org.openqa.selenium.By;

public class LogIn extends OpenBrowser {
    public void setlogin(){
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("testaccount");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();


    }
}
