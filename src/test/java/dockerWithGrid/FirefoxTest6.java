package dockerWithGrid;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class FirefoxTest6 {

    @Test
    public void test5() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();

        URL url = new URL("http://localhost:4444/wd/hub");

        RemoteWebDriver driver = new RemoteWebDriver(url, desiredCapabilities);

        driver.get("https://amazon.com/");

        System.out.println("Title 4: " + driver.getTitle());

        driver.quit();
    }
}
