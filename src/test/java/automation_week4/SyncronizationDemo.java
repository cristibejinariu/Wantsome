package automation_week4;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import teme.util.ta_utils.BaseTestClass;

import java.util.concurrent.TimeUnit;

public class SyncronizationDemo extends BaseTestClass {

    @Test
    public void unconditional() throws InterruptedException {
        driver.get("https://testare-automata.practica.tech/automation/countdown/");
        // vrem sa gasim elementul cu textul 01:01:08

        Thread.sleep(4000);  // not recommended

        WebElement desiredElement = driver.findElement(By.xpath("//div[text() = '01:01:08']"));

        // apoi sa gasim elementul cu textul 01:01:06

        Thread.sleep(2000);  // not recommended

        WebElement desiredElement2 = driver.findElement(By.xpath("//div[text() = '01:01:06']"));

        Assert.assertTrue(desiredElement.isDisplayed());
    }

    @Test
    public void implicitWait(){
        driver.get("https://testare-automata.practica.tech/automation/countdown/");

        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        WebElement desiredElement = driver.findElement(By.xpath("//div[text() = '01:01:08']"));

        WebElement desiredElement2 = driver.findElement(By.xpath("//div[text() = '01:01:06']"));

        Assert.assertTrue(desiredElement.isDisplayed());
    }

    @Test
    public void explicitWait(){
        driver.get("https://testare-automata.practica.tech/automation/countdown/");

        WebDriverWait wait = new WebDriverWait(driver,6);
        WebElement desiredElement = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[text() = '01:01:08']")));

        Assert.assertTrue(desiredElement.isDisplayed());

        boolean didTheElementAppear = wait.until(ExpectedConditions.textToBe(
                By.xpath("//div"), "01:01:02"));

        System.out.println("A aparut elementul? " + didTheElementAppear);
    }
}
