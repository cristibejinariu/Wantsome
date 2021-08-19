package automation_week2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import teme.util.ta_utils.BaseTestClass;

import java.util.List;

public class XpathExercises extends BaseTestClass {

    // ex 1
    @Test
    public void exercises1(){
        driver.get("https://testare-automata.practica.tech/shop/");
        String title = driver.getTitle();
        Assert.assertEquals("Wantsome Shop – Wantsome? Come and get some!", title);
        driver.get("https://testare-automata.practica.tech/shop/?product_cat=men-collection");
        title = driver.getTitle();
        Assert.assertEquals("Men Collection – Wantsome Shop", title);
        WebElement dropDown = driver.findElement(By.xpath("//select[@name='orderby']"));
        Assert.assertTrue(dropDown.isDisplayed());
        List<WebElement> options = driver.findElements(By.xpath("//select[@name='orderby']/option"));
        Assert.assertEquals(6, options.size());
        Assert.assertEquals("Default sorting", options.get(0).getText());

    }

    //ex 3
    @Test
    public void exercises3(){
        driver.get("https://testare-automata.practica.tech/shop/?product_cat=men-collection");
        WebElement firstProduct = driver.findElement(By.xpath("//ul[contains(@class, 'products')]/li[1]"));
        WebElement title = firstProduct.findElement(By.xpath(".//h3[@class = 'products-title']"));
        WebElement price = firstProduct.findElement(By.xpath(".//span[contains(@class, 'amount')]"));
        Assert.assertEquals("Classic Watch", title.getText());
        Assert.assertEquals("70,00 lei", price.getText());

    }

}
