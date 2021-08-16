package automation_week1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseTestClass;

import java.util.List;

public class WebElementsIntro extends BaseTestClass {

    @Test
    public void webElementIntro() {

        driver.get("https://testare-automata.practica.tech/blog/");

        WebElement logoElement = driver.findElement(By.id("logo"));

        String logoText = logoElement.getText();

        System.out.println(logoText);

        Assert.assertTrue(logoText.contains("My CMS"));
    }

    @Test
    public void webElementFindByLinkText() {

        driver.get("https://testare-automata.practica.tech/blog/");

        WebElement logoLink = driver.findElement(By.linkText("My CMS"));

        System.out.println( logoLink.getAttribute("href") );
    }

    @Test
    public void webElementFindByName() {

        driver.get("https://testare-automata.practica.tech/blog/contact/");

        WebElement nameInput = driver.findElement(By.name("your-name"));

        System.out.println(nameInput.getAttribute("type"));

        WebElement emailInput = driver.findElement(By.name("your-email"));

        Assert.assertEquals("email", emailInput.getAttribute("type"));
    }

    @Test
    public void webElementFindByTagName() {

        driver.get("https://testare-automata.practica.tech/blog/contact/");

        WebElement headerSection = driver.findElement(By.tagName("header"));

        Assert.assertEquals("banner",headerSection.getAttribute("role") );

        // findElements (retrieves all matching elements, in a List<WebElements>)
        List<WebElement> allHeaders = driver.findElements(By.tagName("YYYYheader"));

        System.out.println("Number of headers: " + allHeaders.size());

        Assert.assertEquals(0, allHeaders.size());
    }

    @Test
    public void webElementFindByPartialLinkText() {

        driver.get("https://testare-automata.practica.tech/blog/contact/");

        WebElement first2017Link = driver.findElement(By.partialLinkText("2017"));

        System.out.println("Textul primului link: " + first2017Link.getText() );


        List<WebElement> all2017Link = driver.findElements(By.partialLinkText("2017"));

        for (WebElement linkElement : all2017Link) {

            System.out.println(linkElement.getText() + " --- " + linkElement.getAttribute("href") );
        }
    }
}
