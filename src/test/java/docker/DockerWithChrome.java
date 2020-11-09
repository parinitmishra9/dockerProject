package docker;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DockerWithChrome {

    public static void main(String[] args) throws MalformedURLException {

//        DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
        DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();

        URL url = new URL("http://localhost:4444/wd/hub");

        RemoteWebDriver driver = new RemoteWebDriver(url, desiredCapabilities);

        driver.get("https://opensource-demo.orangehrmlive.com/");

        System.out.println("Title: " + driver.getTitle());

        driver.quit();

    }

}
