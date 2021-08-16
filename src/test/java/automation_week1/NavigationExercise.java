package automation_week1;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationExercise {

    WebDriver driver;

    @BeforeClass
    public static void setupBeforeAllTests() {
        System.out.println("--- Starting Navigation tests ---");
    }

    @Before
    public void setupForEachTest() {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Wantsome\\IdeaProjects\\teme_cristi_bejinariu\\src\\test\\resources\\drivers\\windows\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    /**
     * ● Build a test that navigates to https://www.wantsome.ro/
     * ● Then go to https://wantsome.ro/cursuri/testare-manuala-si-intro-in-testare-automata/
     * while maintaining the browser history and cookies.
     * ● Go back.
     * ● Go forward.
     * ● Refresh the page.
     * ● After each step, find verify that you are on the correct page by checking the title.
     */

    @Test
    public void navigation1() {

        // Step 1. Open wantsome page
        driver.get("https://wantsome.ro");

        Assert.assertEquals("Wantsome", driver.getTitle());

        // Step 2. Navigate to the course page
        driver.navigate().to("https://wantsome.ro/cursuri/testare-manuala-si-intro-in-testare-automata/");

        String expectedCourseTitle = "Testare Manuală și Introducere în Testare Automată - Wantsome";

        Assert.assertEquals(expectedCourseTitle, driver.getTitle());

        // Step 3. Go back
        driver.navigate().back();

        //  System.out.println("Titlul pagini dupa actiunea 'Back': " + driver.getTitle());
        Assert.assertEquals( "Verificam titlul paginii dupa 'Back': ","Wantsome", driver.getTitle());

        // Step 4. Go forward
        driver.navigate().forward();
        System.out.println("Titlul paginii dupa 'Forward': " + driver.getTitle());

        Assert.assertEquals(expectedCourseTitle, driver.getTitle());

        // Step 5. Refresh the page
        driver.navigate().refresh();
        System.out.println("Titlul paginii dupa 'Refresh': " + driver.getTitle());

        Assert.assertEquals(expectedCourseTitle, driver.getTitle());

    }

    @Test
    public void navigation2() {

        // Step 1. Open wantsome page
        driver.get("https://wantsome.ro");
    }

    @After
    public void cleanupAfterEachTest() {
        driver.quit();
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("-=-= End of all Navigation Tests =-=-");
    }
}
