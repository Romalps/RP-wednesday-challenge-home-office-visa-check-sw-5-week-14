package ov.uk.check.visa.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ov.uk.check.visa.propertyreader.PropertyReader;
import ov.uk.check.visa.utility.Utility;

public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        closeBrowser();
    }

}
