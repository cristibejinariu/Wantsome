package automation_week3;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import teme.util.ta_utils.BaseTestClass;

import java.util.List;

public class ActionIntro extends BaseTestClass {

    @Test
    public void multiSelectWithActions(){
        driver.get("https://output.jsbin.com/osebed/2");

        WebElement bananaElement = driver.findElement(By.xpath("//option[.='Banana']"));
        WebElement orangeElement = driver.findElement(By.xpath("//option[text()='Orange']"));

        Actions actions = new Actions(driver);
        Action multiSelectAction = actions
                .keyDown(Keys.CONTROL)
                .click(bananaElement)
                .click(orangeElement)
                .build();

        multiSelectAction.perform();

        Select fruits = new Select(driver.findElement(By.id("fruits")));
        List<WebElement> selectedFruits = fruits.getAllSelectedOptions();

        Assert.assertEquals("Banana", selectedFruits.get(0).getText());
        Assert.assertEquals("Orange", selectedFruits.get(1).getText());
        Assert.assertEquals(2, selectedFruits.size());

        WebElement appleElement = driver.findElement(By.xpath("//option[text()='Apple']"));

        Action multiSelectAction2 = actions
                .keyDown(Keys.CONTROL)
                .click(bananaElement)
                .click(appleElement)
                .build();

        multiSelectAction2.perform();

        selectedFruits = fruits.getAllSelectedOptions();
        Assert.assertEquals("Apple", selectedFruits.get(0).getText());
        Assert.assertEquals("Orange", selectedFruits.get(1).getText());

    }
}
