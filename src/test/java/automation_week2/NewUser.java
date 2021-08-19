package automation_week2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import teme.util.ta_utils.BaseTestClass;

public class NewUser extends BaseTestClass {
    @Test
    public void registerLogin(){
        driver.get("https://testare-automata.practica.tech/blog/");
        driver.findElement(By.id("menu-item-73")).click();

        String random = String.valueOf(System.currentTimeMillis());
        driver.findElement(By.id("username")).sendKeys("Gica123" + random);
        driver.findElement(By.id("email")).sendKeys("gica" + random + "@gmail.com");
        driver.findElement(By.id("passw1")).sendKeys("parola33");
        driver.findElement(By.id("passw2")).sendKeys("parola33");
        driver.findElement(By.id("register")).click();
        WebElement successMessage = driver.findElement(By.id("wppb_form_general_message"));
        Assert.assertEquals("The account Gica123" + random + " has been successfully created!", successMessage.getText());
        System.out.println(successMessage.getText());

        driver.findElement(By.id("menu-item-77")).click();
        WebElement usernameEmail = driver.findElement(By.id("user_login"));
        usernameEmail.sendKeys("Gica123" + random + Keys.TAB + "parola33");
        usernameEmail.submit();

        WebElement loginMessage = driver.findElement(By.id("wp-admin-bar-my-account"));
        Assert.assertEquals("Howdy, Gica123" + random, loginMessage.getText());

    }
}
