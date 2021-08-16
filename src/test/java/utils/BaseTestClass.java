package utils;

import org.apache.commons.lang3.SystemUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestClass {

    public WebDriver driver;

    @Before
    public void setUpTest() {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Wantsome\\IdeaProjects\\teme_cristi_bejinariu\\src\\test\\resources\\drivers\\windows\\chromedriver.exe");

        driver = new ChromeDriver();

        if (SystemUtils.IS_OS_WINDOWS) {
            driver.manage().window().maximize();
        }
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
