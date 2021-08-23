package automation_week3;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import teme.util.ta_utils.BaseTestClass;

import java.util.List;
import java.util.Locale;

public class SelectDemo extends BaseTestClass {

    /**
     * Go to https://www.mediacollege.com/internet/samples/html/country-list.html
     * Verify that the default selected option is Country...
     * Check that Romania is present
     * Check that the last option is Zimbabwe
     * Check that there are no countries starting with X
     */

    @Test
    public void selectExercises() {
        driver.get("https://www.mediacollege.com/internet/samples/html/country-list.html");
        WebElement dropdownElement1 = driver.findElement(By.name("country"));
        WebElement dropdownElement2 = driver.findElement(By.xpath("//select[@name='country']"));
        WebElement dropdownElement3 = driver.findElement(By.tagName("select"));

        Select countries = new Select(dropdownElement1);

        // Verify that the default selected option is Country...
        WebElement firstSelectedOption = countries.getFirstSelectedOption();
        Assert.assertEquals("Country...", firstSelectedOption.getText());
        Assert.assertEquals(1, countries.getAllSelectedOptions().size());

        // Check that Romania is present

        // not recommended, because it alters the precondition for the next step
        // countries.selectByValue("RO");
        // countries.selectByVisibleText("Romania");

        // optimal version
        List<WebElement> allCountries = countries.getOptions();

        boolean isRomaniaInList = false;
        for (WebElement countryElement : allCountries) {

            String countryName = countryElement.getText();

            if (countryName.equals("Romania")) {
                System.out.println("Am gasit 'Romania' in lista");
                isRomaniaInList = true;
                break;
            }
        }

        Assert.assertTrue(isRomaniaInList);

        // alternative: with a dedicated method
        Assert.assertTrue(isRomaniaInListV2(allCountries));

    }

    private boolean isRomaniaInListV2(List<WebElement> allCountries) {
        for (WebElement countryElement : allCountries) {

            String countryName = countryElement.getText();

            if (countryName.equals("Romania")) {
                System.out.println("Am gasit 'Romania' in lista");

            }
        }

        return true;
    }

    // Check that the last option is Zimbabwe
    @Test
    public void checkForZimbabwe(){
        driver.get("https://www.mediacollege.com/internet/samples/html/country-list.html");
        WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='country']"));
        Select countries = new Select(dropdownElement);
        List<WebElement> countriesList = countries.getOptions();
        WebElement lastOption = countriesList.get(countriesList.size() -1);
        Assert.assertEquals("Zimbabwe", lastOption.getText());

    }

    // Check that there are no countries starting with X
    @Test
    public void noXInText(){
        driver.get("https://www.mediacollege.com/internet/samples/html/country-list.html");
        WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='country']"));
        Select countries = new Select(dropdownElement);
        List<WebElement> countriesList = countries.getOptions();

        boolean isCountryWithX = false;
        for (WebElement countryElement : countriesList){
            if (countryElement.getText().startsWith("X") || countryElement.getText().startsWith("x")){
                isCountryWithX = true;
                break;
            }
        }

        Assert.assertFalse(isCountryWithX);

    }

    @Test
    public void noXInTextV2(){
        driver.get("https://www.mediacollege.com/internet/samples/html/country-list.html");
        Select countries = new Select(driver.findElement(By.xpath("//select[@name='country']")));

        for (WebElement countryElement : countries.getOptions()){

            if (countryElement.getText().toUpperCase().startsWith("X")){
                Assert.fail("Found country with X, but it should be any. The country is: " + countryElement.getText());
            }
        }
    }
}
