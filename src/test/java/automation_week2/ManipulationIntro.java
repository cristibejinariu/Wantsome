package automation_week2;

import org.eclipse.jetty.websocket.common.extensions.compress.XWebkitDeflateFrameExtension;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import teme.util.ta_utils.BaseTestClass;

public class ManipulationIntro extends BaseTestClass {
    @Test
    public void manipulation(){
        driver.get("https://testare-automata.practica.tech/blog/");

        WebElement facebookBtn = driver.findElement(By.id("menu-item-14"));
        facebookBtn.click();

        Assert.assertEquals("https://www.facebook.com/wantsomeiasi", driver.getCurrentUrl());
    }
    @Test
    public void sendKeysDemo(){
        driver.get("https://testare-automata.practica.tech/blog/");

        WebElement search = driver.findElement(By.name("s"));

        //verific valoarea din input
        search.sendKeys("Testare");
        Assert.assertEquals("Testare", search.getAttribute("value"));

        //nu suprascriu, ci concatenez la ce era deja in input
        search.sendKeys("Testare");
        Assert.assertEquals("Testare", search.getAttribute("value"));

        search.clear();
        Assert.assertEquals("", search.getAttribute("value"));
    }

    @Test
    public void sendKeysCick(){
        driver.get("https://testare-automata.practica.tech/blog/");
        WebElement search = driver.findElement(By.name("s"));
        search.sendKeys("Testare Manuala si Automata");

        WebElement searchBtn = driver.findElement(By.xpath("//*[@id='search-3']/form/button"));
        searchBtn.click();

        Assert.assertTrue(driver.getCurrentUrl().endsWith("?s=Testare+Manuala+si+Automata"));

        WebElement searchTitle = driver.findElement(By.tagName("h1"));
        Assert.assertEquals("Nothing Found", searchTitle.getText());
    }

    @Test
    public void sendKeysSubmit(){
        driver.get("https://testare-automata.practica.tech/blog/");
        WebElement search = driver.findElement(By.name("s"));
        search.sendKeys("Testare Manuala si Automata");

        search.submit();

        Assert.assertTrue(driver.getCurrentUrl().endsWith("?s=Testare+Manuala+si+Automata"));

        WebElement searchTitle = driver.findElement(By.tagName("h1"));
        Assert.assertEquals("Nothing Found", searchTitle.getText());
    }

    @Test
    public void badClick(){
        driver.get("https://testare-automata.practica.tech/blog/");
        driver.findElement(By.className("screen-reader-text")).click();
    }

    @Test
    public void badSendKeys(){
        driver.get("https://testare-automata.practica.tech/blog/");
        driver.findElement(By.id("menu-item-35")).sendKeys("Whoops!");
    }

    @Test
    public void keysDemo(){
        driver.get("https://testare-automata.practica.tech/blog/");
        driver.findElement(By.id("menu-item-35")).click();
        WebElement nameInput = driver.findElement(By.name("your-name"));
        nameInput.sendKeys("John Doe" + Keys.TAB + "john.doe@email.com");

        // Thread.sleep(5000);

        WebElement emailInput = driver.findElement(By.name("your-email"));
        Assert.assertEquals("john.doe@email.com", emailInput.getAttribute("value"));
    }
}
