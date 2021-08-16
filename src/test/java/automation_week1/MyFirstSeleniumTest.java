package automation_week1;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MyFirstSeleniumTest {

    @Test
    public void openABrowser() {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Wantsome\\IdeaProjects\\teme_cristi_bejinariu\\src\\test\\resources\\drivers\\windows\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://wantsome.ro");
    }
    @Test
    public void openEdgeBrowser() {

        System.setProperty("webdriver.edge.driver",
                "C:\\Wantsome\\IdeaProjects\\teme_cristi_bejinariu\\src\\test\\resources\\drivers\\windows\\edgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("https://wantsome.ro");
    }

}
