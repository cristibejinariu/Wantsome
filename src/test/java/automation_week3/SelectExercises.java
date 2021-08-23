package automation_week3;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import teme.util.ta_utils.BaseTestClass;

public class SelectExercises extends BaseTestClass {

    // Selectam tara cu codul 'GR'
    // Sa verificam ca numele tarii este Greece

    @Test
    public void ex1(){
        driver.get("https://www.mediacollege.com/internet/samples/html/country-list.html");
        Select countriesDropdown = new Select(driver.findElement(By.name("country")));
        countriesDropdown.selectByValue("GR");
        Assert.assertEquals("Greece", countriesDropdown.getFirstSelectedOption().getText());
    }
}
