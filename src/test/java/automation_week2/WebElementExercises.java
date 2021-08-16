package automation_week2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import teme.util.ta_utils.BaseTestClass;

import java.util.List;

public class WebElementExercises extends BaseTestClass {

    // ex1
    @Test
    public void findText() {

        driver.get("https://testare-automata.practica.tech/blog/contact/");
        WebElement softwareTesting = driver.findElement(By.id("menu-item-115"));
        Assert.assertEquals("Software Testing",softwareTesting.getText());

    }

    // ex2
    @Test
    public void extractText() {
        driver.get("https://testare-automata.practica.tech/blog/contact/");
        WebElement fbButton = driver.findElement(By.id("menu-item-14"));
        Assert.assertEquals("", fbButton.getText());

    }

    // ex3
    @Test
    public void emailTag() {

        driver.get("https://testare-automata.practica.tech/blog/contact/");
        WebElement email = driver.findElement(By.name("your-email"));
        Assert.assertEquals("input", email.getTagName());
        Assert.assertTrue(email.isDisplayed());

    }

    // ex4
    @Test
    public void wordpressLink() {

        driver.get("https://testare-automata.practica.tech/blog/contact/");
        WebElement link = driver.findElement(By.linkText("WordPress"));
        String actual = link.getCssValue("text-decoration");
        Assert.assertTrue(actual.contains("underline"));

    }

    // ex5
    @Test
    public void inputNumber() {

        driver.get("https://testare-automata.practica.tech/blog/contact/");
        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        Assert.assertEquals(18, inputs.size());

    }

    // ex6
    @Test
    public void allAvailableSelections() {

        driver.get("https://testare-automata.practica.tech/blog/contact/");
        List<WebElement> options = driver.findElements(By.tagName("option"));
        Assert.assertEquals(4, options.size());
        WebElement firstOption = options.get(0);
        System.out.println(firstOption.getText());

        WebElement longest = options.get(0);
        for (WebElement element : options) {
            if(element.getText().length() > longest.getText().length()) {
                longest = element;
            }
        }

        System.out.println(longest.getText());

    }

    // ex7
    @Test
    public void allSocialMediaLinks() {
        driver.get("https://testare-automata.practica.tech/blog/contact/");
        List<WebElement> links = driver.findElement(By.id("menu-menu-1")).findElements(By.tagName("li"));
        Assert.assertEquals(4, links.size());

    }
}