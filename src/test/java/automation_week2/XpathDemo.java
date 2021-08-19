package automation_week2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import teme.util.ta_utils.BaseTestClass;

import java.util.List;

public class XpathDemo extends BaseTestClass {
    @Test
    public void xpathDemo(){
        driver.get("https://testare-automata.practica.tech/blog/");

        //I want to know how many span elements are on the website
        List<WebElement> spans = driver.findElements(By.xpath("//span"));
        System.out.println("Avem " + spans.size() + " spanuri");

        //I want to see the text of the Login button
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id = 'menu-item-77']"));
        System.out.println("Textul butonului este: " + loginBtn.getText());

        //I want to check how many elements have an 'alt' attribute
        List<WebElement> elementsWithAlt = driver.findElements(By.xpath("//*[@alt]"));
        //I want to check how many 'img' elements have an 'alt' attribute
        List<WebElement> imgsWithAlt = driver.findElements(By.xpath("//img[@alt]"));

        //full path
        WebElement fullXpathTitle = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div[1]/h1/a"));
        WebElement simpleXpathTitle = driver.findElement(By.xpath("//header//h1/a"));


    }
}
