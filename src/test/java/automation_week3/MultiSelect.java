package automation_week3;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import teme.util.ta_utils.BaseTestClass;

import java.util.List;

public class MultiSelect extends BaseTestClass {

    /**
     * https://output.jsbin.com/osebed/2
     */
    @Test
    public void multiSelectDemo(){
        driver.get("https://output.jsbin.com/osebed/2");
        Select fruits = new Select(driver.findElement(By.id("fruits")));
        Assert.assertTrue("Check that this Select allows multiple selection", fruits.isMultiple());

        // select 2 options and verify selection (banana, orange)
        fruits.selectByValue("banana");
        fruits.selectByIndex(2); // Orange
        List<WebElement> selectedFruits = fruits.getAllSelectedOptions();

        Assert.assertEquals("Banana", selectedFruits.get(0).getText());
        Assert.assertEquals("Orange", selectedFruits.get(1).getText());
        Assert.assertEquals(2, selectedFruits.size());

        fruits.deselectByIndex(0); // deselect Banana
        selectedFruits = fruits.getAllSelectedOptions();
        Assert.assertEquals("Orange", selectedFruits.get(0).getText());
        Assert.assertEquals(1, selectedFruits.size());

        fruits.deselectAll(); // deselectam toate optiunile
        selectedFruits = fruits.getAllSelectedOptions();
        Assert.assertEquals(0, selectedFruits.size());

    }
}
