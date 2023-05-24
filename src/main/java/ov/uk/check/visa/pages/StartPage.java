package ov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import ov.uk.check.visa.customlisteners.CustomListeners;
import ov.uk.check.visa.utility.Utility;

public class StartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startNowButton;

    public void clickStartNow(){
        Reporter.log("Click On Start Now Button "+ startNowButton.toString());
        CustomListeners.test.log(Status.PASS,"Click On Start Now Button "+ startNowButton);
        clickOnElement(startNowButton);
    }
}
