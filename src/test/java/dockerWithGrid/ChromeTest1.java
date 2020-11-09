package dockerWithGrid;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeTest1 {

    @Test
    public void test1() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();

        URL url = new URL("http://localhost:4444/wd/hub");

        RemoteWebDriver driver = new RemoteWebDriver(url, desiredCapabilities);

        driver.get("https://opensource-demo.orangehrmlive.com/");

        System.out.println("Title 1: " + driver.getTitle());

        driver.quit();
    }
}
