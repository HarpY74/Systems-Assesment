package Pages;

import org.openqa.selenium.By;

public class Register extends OpenBrowser{

    public void register(){
driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
driver.findElement(By.id("customer.firstName")).sendKeys("Mohamed");
driver.findElement(By.id("customer.lastName")).sendKeys("Elsaeed");
driver.findElement(By.id("customer.address.street")).sendKeys("Horria");
driver.findElement(By.id("customer.address.city")).sendKeys("Cairo");
driver.findElement(By.id("customer.address.state")).sendKeys("Cairo");
driver.findElement(By.id("customer.address.zipCode")).sendKeys("12345");
driver.findElement(By.id("customer.phoneNumber")).sendKeys("01123061620");
driver.findElement(By.id("customer.ssn")).sendKeys("1215");
driver.findElement(By.id("customer.username")).sendKeys("test");
driver.findElement(By.id("customer.password")).sendKeys("123456");
driver.findElement(By.id("repeatedPassword")).sendKeys("123456");
driver.findElement(By.xpath("//input[@value='Register']")).click();








}}
