package automation_week4;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import teme.util.ta_utils.BaseTestClass;

public class ShopLoginTests extends BaseTestClass {

    @Test
    public void happyFlow() {
        driver.get("https://testare-automata.practica.tech/shop/");

        WebElement loginButton = driver.findElement(By.xpath("//div[@class = 'user-wrapper search-user-block']"));
        loginButton.click();

        driver.findElement(By.id("username")).sendKeys("123alina@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123alina@");
        driver.findElement(By.xpath("//*[@name='login']")).click();
        WebElement message = driver.findElement(By.xpath("//*[contains(@class, 'woocommerce-MyAccount-content')]/p"));
        Assert.assertEquals("Hello 123alina (not 123alina? Log out)", message.getText());
    }

    @Test
    public void unknownUsernameOrEmail() {
        driver.get("https://testare-automata.practica.tech/shop/");

        WebElement loginButton = driver.findElement(By.xpath("//div[@class = 'user-wrapper search-user-block']"));
        loginButton.click();

        driver.findElement(By.id("username")).sendKeys("somethingElse");
        driver.findElement(By.id("password")).sendKeys("123alina@");
        driver.findElement(By.xpath("//*[@name='login']")).click();
        WebElement errorMessage = driver.findElement(By.className("woocommerce-error"));
        Assert.assertEquals("Unknown username. Check again or try your email address.", errorMessage.getText());

        driver.findElement(By.id("username")).sendKeys("@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123alina@");
        driver.findElement(By.xpath("//*[@name='login']")).click();
        errorMessage = driver.findElement(By.className("woocommerce-error"));
        Assert.assertEquals("Unknown email address. Check again or try your username.", errorMessage.getText());
    }

    @Test
    public void missingUsername() {
        driver.get("https://testare-automata.practica.tech/shop/");

        WebElement loginButton = driver.findElement(By.xpath("//div[@class = 'user-wrapper search-user-block']"));
        loginButton.click();

        driver.findElement(By.id("password")).sendKeys("123alina@");
        driver.findElement(By.xpath("//*[@name='login']")).click();
        WebElement errorMessage = driver.findElement(By.className("woocommerce-error"));
        Assert.assertEquals("Error: Username is required.", errorMessage.getText());
    }

    @Test
    public void missingPassword() {
        driver.get("https://testare-automata.practica.tech/shop/");

        WebElement loginButton = driver.findElement(By.xpath("//div[@class = 'user-wrapper search-user-block']"));
        loginButton.click();

        driver.findElement(By.id("username")).sendKeys("123alina@gmail.com");
        driver.findElement(By.xpath("//*[@name='login']")).click();
        WebElement errorMessage = driver.findElement(By.className("woocommerce-error"));
        Assert.assertEquals("ERROR: The password field is empty.", errorMessage.getText());
    }

    @Test
    public void usernamePasswordMissmatch() {
        driver.get("https://testare-automata.practica.tech/shop/");

        WebElement loginButton = driver.findElement(By.xpath("//div[@class = 'user-wrapper search-user-block']"));
        loginButton.click();

        driver.findElement(By.id("username")).sendKeys("123alina");
        driver.findElement(By.id("password")).sendKeys("test1");
        driver.findElement(By.xpath("//*[@name='login']")).click();
        WebElement errorMessage = driver.findElement(By.className("woocommerce-error"));
        Assert.assertEquals("ERROR: The password you entered for the username 123alina is incorrect. Lost your password?", errorMessage.getText());
    }

    @Test
    public void emailPasswordMissmatch() {
        driver.get("https://testare-automata.practica.tech/shop/");

        WebElement loginButton = driver.findElement(By.xpath("//div[@class = 'user-wrapper search-user-block']"));
        loginButton.click();

        driver.findElement(By.id("username")).sendKeys("123alina@gmail.com");
        driver.findElement(By.id("password")).sendKeys("test2");
        driver.findElement(By.xpath("//*[@name='login']")).click();
        WebElement errorMessage = driver.findElement(By.className("woocommerce-error"));
        Assert.assertEquals("ERROR: The password you entered for the email address 123alina@gmail.com is incorrect. Lost your password?", errorMessage.getText());
    }
}
