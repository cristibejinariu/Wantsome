package automation_week3;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import teme.util.ta_utils.BaseTestClass;

public class ActionsExercises extends BaseTestClass {

    /**
     * GO to https://testare-automata.practica.tech/blog
     * Assert on the initial color of the title
     * Assert on the color of the title when hovering over it
     * Test that if the user types "wantsome" while holding
     * the sift key in the search input, the search will be performed
     * for "WANTSOME" (make the search and find a way to assert)
     */

    @Test
    public void hoverAction(){
        driver.get("https://testare-automata.practica.tech/blog");

        WebElement title = driver.findElement(By.linkText("My CMS"));

        String initialColor = title.getCssValue("color");

        System.out.println(initialColor);

        Assert.assertEquals("rgba(48, 48, 48, 1)", initialColor);

        verifyColor(initialColor, "48, 48, 48, 1");

        Actions hover = new Actions(driver);

        Action hoverAction = hover.moveToElement(title).build();

        hoverAction.perform();

        String hoverColor = title.getCssValue("color");

        verifyColor(hoverColor, "238, 51, 51, 1");
    }

      private void verifyColor(String initialColor, String colorCode){

        if(driver instanceof ChromeDriver){
            Assert.assertEquals("rgba(" + colorCode + ")", initialColor);
                }else{
                Assert.assertEquals("rgb(" + colorCode + ")", initialColor);
        }
    }

    @Test
    public void holdingSfift(){
        driver.get("https://testare-automata.practica.tech/blog");

        WebElement search = driver.findElement(By.xpath("//input[@name='s']"));

        Actions actions = new Actions(driver);

        Action searchAction = actions
                .click(search)
                .keyDown(Keys.SHIFT)
                .sendKeys("wantsome")
                .keyUp(Keys.SHIFT)
                .sendKeys(Keys.ENTER)
                .build();

        searchAction.perform();

        WebElement searchResultWord = driver.findElement(By.xpath("//header[@class='page-header']/h1/span"));

        Assert.assertEquals("WANTSOME", searchResultWord.getText());

    }
}
