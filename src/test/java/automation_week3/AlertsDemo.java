package automation_week3;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import teme.util.ta_utils.BaseTestClass;

public class AlertsDemo extends BaseTestClass {

    @Test
    public void alertBoxTriggered() {

        Alert simpleAlertBox = navigateAndOpenAlert();

        String alertText = simpleAlertBox.getText();

        Assert.assertTrue(alertText.contains("This is a simple alert box!"));
    }

    private Alert navigateAndOpenAlert() {

        driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");

        // click on a button to trigger the Alert dialog/pop-up
        driver.findElement(By.id("alertBox")).click();

        return driver.switchTo().alert();

        // Sau
        //
        // Alert alert = driver.switchTo().alert();
        //
        // return alert;
    }

    @Test(expected = NoAlertPresentException.class)
    public void alertBox(){

        Alert simpleAlertBox = navigateAndOpenAlert();

        //click on Ok on the Alert; closes the ALert pop-up
        simpleAlertBox.accept();

        //Try to Accept again, to cause an Error that actually confirms the closing of the Alert
        simpleAlertBox.accept();
    }

    @Test
    public void confirmationBoxAlert(){

        driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");

        driver.findElement(By.id("confirmBox")).click();

        Alert confirmationAlert = driver.switchTo().alert();

        confirmationAlert.dismiss();

        driver.findElement(By.id("confirmBox")).click();

        driver.switchTo().alert().accept();
    }

    @Test
    public void promptBoxAlert(){
        driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");

        driver.findElement(By.id("promptBox")).click();

        Alert promptAlertBox = driver.switchTo().alert();

        promptAlertBox.sendKeys("Selenium Webdriver");

        promptAlertBox.accept();
    }
}
