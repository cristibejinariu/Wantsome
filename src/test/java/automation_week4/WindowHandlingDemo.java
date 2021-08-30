package automation_week4;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import teme.util.ta_utils.BaseTestClass;

import java.util.Set;

public class WindowHandlingDemo extends BaseTestClass {

    @Test
    public void handlingWindows(){
        driver.get("https://www.testandquiz.com/selenium/testing.html");
        WebElement link = driver.findElement(By.linkText("This is a link"));

        System.out.println("initially");
        Set<String> windowHandles = driver.getWindowHandles();
        for(String fereastra : windowHandles){
            System.out.println(fereastra);
        }
        System.out.println("=========================================");


        new Actions(driver)
                .keyDown(Keys.CONTROL)
                .click(link)
                .keyUp(Keys.CONTROL)
                .build()
                .perform();

        String firstTab = driver.getWindowHandle();
        String secondTab = null;

        System.out.println("after new tab...");
        windowHandles = driver.getWindowHandles();
        for(String fereastra : windowHandles){
            System.out.println(fereastra);
            if(!fereastra.equals(firstTab)){
                secondTab = fereastra;
            }
        }
        System.out.println("=========================================");
        System.out.println("al doilea tab are id-ul -> " + secondTab);

        driver.switchTo().window(secondTab);
        System.out.println(driver.getTitle());
        System.out.println("ma intorc pe primul tab");
        driver.switchTo().window(firstTab);
        System.out.println(driver.getTitle());

    }
}
