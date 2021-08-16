package automation_week1;

import org.junit.Assert;
import org.junit.Test;
import utils.BaseTestClass;

public class InterrogationDemo extends BaseTestClass {

    /**
     * 1. Navigate to wantsome.ro
     * 2. Verify that the page source contains "Vezi cum te inscrii la Wantsome!" text
     * 3. Navigate to our course page (https://wantsome.ro/cursuri/testare-manuala-si-intro-in-testare-automata/)
     * 4. Check the URL of the page
     * 5. Go Back
     * 6. Check the URL of the page
     */

    @Test
    public void findInPageSource() {

        // Step 1
        driver.navigate().to("https://wantsome.ro");

        // Step 2
        String pageSource = driver.getPageSource();

        boolean containsPhrase = pageSource.contains("Vezi cum te înscrii la Wantsome!");
        System.out.println("Contine sau nu? Raspunsul: " + containsPhrase);

        Assert.assertTrue("Verify page source contains...", containsPhrase);


        // Step 3
        String courseURL = "https://wantsome.ro/cursuri/testare-manuala-si-intro-in-testare-automata/";
        driver.navigate().to(courseURL);

        // Step 4
        Assert.assertEquals(courseURL, driver.getCurrentUrl() );

        // Step 5
        driver.navigate().back();

        // Step 6
        Assert.assertEquals("https://wantsome.ro/", driver.getCurrentUrl());
    }
}
