import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


/**
 * Created by ds on 2/4/15.
 */
public class Selenium {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver(); // Version 1.1 :: Firefox

        String test_case_id = "TC-001.01";


//       Passing values as parameters
//
//       String param[] = args[0].split("\\,");
//               String url = param[0];
//               String title_expected = param[1];

        String url = "http://learn2test.net";
        String title_expected = "learn2test.net";

        driver.get(url);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String title_actual = driver.getTitle();

        if (title_expected.equals(title_actual)) {
            System.out.println("Test Case ID: \t\t" + test_case_id);
            System.out.println("URL: \t\t" + url);
            System.out.println("Title Expected: \t\t" + title_expected);
            System.out.println("Test Case Result: \t\t" + "PASSED");
        } else {
            System.out.println("Test Case ID: \t\t" + test_case_id);
            System.out.println("URL: \t\t" + url);
            System.out.println("Title Expected: \t\t" + title_expected);
            System.out.println("Test Case Result: \t\t" + "FAILED");
        }
        driver.quit();
    }
}