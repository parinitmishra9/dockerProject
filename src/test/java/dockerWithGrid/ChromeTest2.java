package dockerWithGrid;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeTest2 {

    @Test
    public void test2() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();

        URL url = new URL("http://localhost:4444/wd/hub");

        RemoteWebDriver driver = new RemoteWebDriver(url, desiredCapabilities);

        driver.get("https://google.com/");

        System.out.println("Title 2: " + driver.getTitle());

        driver.quit();
    }
}
