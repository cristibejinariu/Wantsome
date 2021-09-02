package automation_week4;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import teme.util.ta_utils.BaseTestClass;

public class ShopCartTests extends BaseTestClass {

    @Test
    public void addToCart() throws InterruptedException {
        driver.get("https://testare-automata.practica.tech/shop/");
        driver.findElement(By.className("category-toggle")).click();
        driver.findElement(By.id("menu-item-509")).click();
        System.out.println(driver.getTitle());

        WebElement watch = driver.findElement(By.className("products-img"));
        WebElement watch2 = driver.findElement(By.className("products-hover-wrapper"));
        Actions actions = new Actions(driver);
        actions.moveToElement(watch).moveToElement(watch2)
                .build()
                .perform();

        driver.findElement(By.className("add_to_cart_button")).click();

        WebElement cart = driver.findElement(By.className("cart-wrapper"));
        actions.moveToElement(cart)
                .build().
                perform();

        Assert.assertEquals("70,00 lei", driver.findElement(By.className("woocommerce-Price-amount")).getText());
    }
}
