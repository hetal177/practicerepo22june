package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.Utility.Utility;
import uk.co.library.customlisteners.CustomListeners;

public class ResultPage extends Utility {
    @CacheLookup
    @FindBy(xpath="//h2[@class='job__title']//a[@title='Automation Tester']//span[contains(text(),'Automation')]" )
    WebElement resultText;

public String getTextFromResultText() {

  String resultTest1 = getTextFromElement(resultText);
    Reporter.log(" verify Results Test  " + resultText.toString() + "<br");
    CustomListeners.test.log(Status.PASS,"verification of final result Test: ");
   return resultTest1;

}
}

