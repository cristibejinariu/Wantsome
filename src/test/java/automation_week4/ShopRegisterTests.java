package automation_week4;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import teme.util.ta_utils.BaseTestClass;

public class ShopRegisterTests extends BaseTestClass {

    @Test
    public void happyFlow() {
        driver.get("https://testare-automata.practica.tech/shop/");

        WebElement regButton = driver.findElement(By.xpath("//div[@class = 'user-wrapper search-user-block']"));
        regButton.click();

        String random = String.valueOf(System.currentTimeMillis());

        driver.findElement(By.id("reg_email")).sendKeys("dude" + random + "@gmail.com");
        driver.findElement(By.id("reg_password")).sendKeys("dude" + random + "@gmail.com");
        driver.findElement(By.id("registration_field_1")).sendKeys("Gigi");
        driver.findElement(By.id("registration_field_2")).sendKeys("Minescu");
        driver.findElement(By.id("registration_field_3")).sendKeys("0741261588");
        driver.findElement(By.name("register")).click();

        WebElement Slider = driver.findElement(By.className("big-slider"));
        Assert.assertTrue(Slider.isDisplayed());
    }

    @Test
    public void missingEmail() {
        driver.get("https://testare-automata.practica.tech/shop/");

        WebElement regButton = driver.findElement(By.xpath("//div[@class = 'user-wrapper search-user-block']"));
        regButton.click();

        String random = String.valueOf(System.currentTimeMillis());

        driver.findElement(By.id("reg_password")).sendKeys("dude" + random + "@gmail.com");
        driver.findElement(By.id("registration_field_1")).sendKeys("Gigi");
        driver.findElement(By.id("registration_field_2")).sendKeys("Minescu");
        driver.findElement(By.id("registration_field_3")).sendKeys("0741261588");
        driver.findElement(By.name("register")).click();

        WebElement errorMessage = driver.findElement(By.className("woocommerce-error"));
        Assert.assertEquals("Error: Please provide a valid email address.", errorMessage.getText());
    }

    @Test
    public void missingPassword() {
        driver.get("https://testare-automata.practica.tech/shop/");

        WebElement regButton = driver.findElement(By.xpath("//div[@class = 'user-wrapper search-user-block']"));
        regButton.click();

        String random = String.valueOf(System.currentTimeMillis());

        driver.findElement(By.id("reg_email")).sendKeys("dude" + random + "@gmail.com");
        driver.findElement(By.id("registration_field_1")).sendKeys("Gigi");
        driver.findElement(By.id("registration_field_2")).sendKeys("Minescu");
        driver.findElement(By.id("registration_field_3")).sendKeys("0741261588");
        driver.findElement(By.name("register")).click();

        WebElement errorMessage = driver.findElement(By.className("woocommerce-error"));
        Assert.assertEquals("Error: Please enter an account password.", errorMessage.getText());
    }

    @Test
    public void missingFirstName() {
        driver.get("https://testare-automata.practica.tech/shop/");

        WebElement regButton = driver.findElement(By.xpath("//div[@class = 'user-wrapper search-user-block']"));
        regButton.click();

        String random = String.valueOf(System.currentTimeMillis());

        driver.findElement(By.id("reg_email")).sendKeys("dude" + random + "@gmail.com");
        driver.findElement(By.id("reg_password")).sendKeys("dude" + random + "@gmail.com");
        driver.findElement(By.id("registration_field_2")).sendKeys("Minescu");
        driver.findElement(By.id("registration_field_3")).sendKeys("0741261588");
        driver.findElement(By.name("register")).click();

        WebElement errorMessage = driver.findElement(By.className("woocommerce-error"));
        Assert.assertEquals("Error: First name is required!", errorMessage.getText());
    }

    @Test
    public void missingLastName() {
        driver.get("https://testare-automata.practica.tech/shop/");

        WebElement regButton = driver.findElement(By.xpath("//div[@class = 'user-wrapper search-user-block']"));
        regButton.click();

        String random = String.valueOf(System.currentTimeMillis());

        driver.findElement(By.id("reg_email")).sendKeys("dude" + random + "@gmail.com");
        driver.findElement(By.id("reg_password")).sendKeys("dude" + random + "@gmail.com");
        driver.findElement(By.id("registration_field_1")).sendKeys("Gigi");
        driver.findElement(By.id("registration_field_3")).sendKeys("0741261588");
        driver.findElement(By.name("register")).click();

        WebElement errorMessage = driver.findElement(By.className("woocommerce-error"));
        Assert.assertEquals("Error: Last name is required!", errorMessage.getText());
    }

    @Test
    public void missingPhoneNumber() {
        driver.get("https://testare-automata.practica.tech/shop/");

        WebElement regButton = driver.findElement(By.xpath("//div[@class = 'user-wrapper search-user-block']"));
        regButton.click();

        String random = String.valueOf(System.currentTimeMillis());

        driver.findElement(By.id("reg_email")).sendKeys("dude" + random + "@gmail.com");
        driver.findElement(By.id("reg_password")).sendKeys("dude" + random + "@gmail.com");
        driver.findElement(By.id("registration_field_1")).sendKeys("Gigi");
        driver.findElement(By.id("registration_field_2")).sendKeys("Minescu");
        driver.findElement(By.name("register")).click();

        WebElement errorMessage = driver.findElement(By.className("woocommerce-error"));
        Assert.assertEquals("Error: Phone number is required!", errorMessage.getText());
    }

    @Test
    public void emailAlreadyUsed() {
        driver.get("https://testare-automata.practica.tech/shop/");

        WebElement regButton = driver.findElement(By.xpath("//div[@class = 'user-wrapper search-user-block']"));
        regButton.click();

        String random = String.valueOf(System.currentTimeMillis());

        driver.findElement(By.id("reg_email")).sendKeys("dude@gmail.com");
        driver.findElement(By.id("reg_password")).sendKeys("dude" + random + "@gmail.com");
        driver.findElement(By.id("registration_field_1")).sendKeys("Gigi");
        driver.findElement(By.id("registration_field_2")).sendKeys("Minescu");
        driver.findElement(By.id("registration_field_3")).sendKeys("0741261588");
        driver.findElement(By.name("register")).click();

        WebElement errorMessage = driver.findElement(By.className("woocommerce-error"));
        Assert.assertEquals("Error: An account is already registered with your email address. Please log in.", errorMessage.getText());
    }

    @Test
    public void weakPassword() {
        driver.get("https://testare-automata.practica.tech/shop/");

        WebElement regButton = driver.findElement(By.xpath("//div[@class = 'user-wrapper search-user-block']"));
        regButton.click();

        String random = String.valueOf(System.currentTimeMillis());

        driver.findElement(By.id("reg_email")).sendKeys("dude" + random + "@gmail.com");
        driver.findElement(By.id("reg_password")).sendKeys("dd");
        driver.findElement(By.id("registration_field_1")).sendKeys("Gigi");
        driver.findElement(By.id("registration_field_2")).sendKeys("Minescu");
        driver.findElement(By.id("registration_field_3")).sendKeys("0741261588");

        WebElement registerButton = driver.findElement(By.name("register"));
        Assert.assertFalse(registerButton.isEnabled());

        WebElement message = driver.findElement(By.className("woocommerce-password-strength"));
        Assert.assertEquals("Very weak - Please enter a stronger password.", message.getText());
    }

    @Test
    public void passwordStrength() {
        driver.get("https://testare-automata.practica.tech/shop/");
        WebElement regButton = driver.findElement(By.xpath("//div[@class = 'user-wrapper search-user-block']"));
        regButton.click();

        driver.findElement(By.id("reg_password")).sendKeys("12");
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.textToBe(By.className("woocommerce-password-strength"), "Very weak - Please enter a stronger password."));

        WebElement message = driver.findElement(By.className("woocommerce-password-strength"));
        Assert.assertEquals("Very weak - Please enter a stronger password.", message.getText());

        WebElement registerButton = driver.findElement(By.name("register"));
        Assert.assertFalse(registerButton.isEnabled());

        driver.findElement(By.id("reg_password")).sendKeys("345@");
        wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.textToBe(By.className("woocommerce-password-strength"), "Weak - Please enter a stronger password."));

        message = driver.findElement(By.className("woocommerce-password-strength"));
        Assert.assertEquals("Weak - Please enter a stronger password.", message.getText());

        registerButton = driver.findElement(By.name("register"));
        Assert.assertFalse(registerButton.isEnabled());

        driver.findElement(By.id("reg_password")).sendKeys("gmail");
        wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.textToBe(By.className("woocommerce-password-strength"), "Medium"));

        message = driver.findElement(By.className("woocommerce-password-strength"));
        Assert.assertEquals("Medium", message.getText());

        registerButton = driver.findElement(By.name("register"));
        Assert.assertTrue(registerButton.isEnabled());

        driver.findElement(By.id("reg_password")).sendKeys("12345@gmail.com");
        wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.textToBe(By.className("woocommerce-password-strength"), "Strong"));

        message = driver.findElement(By.className("woocommerce-password-strength"));
        Assert.assertEquals("Strong", message.getText());

        registerButton = driver.findElement(By.name("register"));
        Assert.assertTrue(registerButton.isEnabled());
    }
}