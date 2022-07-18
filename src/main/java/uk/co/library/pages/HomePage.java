package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.Utility.Utility;
import uk.co.library.customlisteners.CustomListeners;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;
    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;
    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    @CacheLookup
    @FindBy(xpath = "//span//div//span[normalize-space()='Accept All']")
    WebElement acceptCookies;
    @CacheLookup
    @FindBy(id ="gdpr-consent-notice")
    WebElement iframe;


    public void setAcceptCookiesFromIFrameById(){
        switchToIframe(iframe);
        clickOnElement(acceptCookies);
        driver.switchTo().defaultContent();
    }
    public void enterJobTitle(String job) {

        sendTextToElement(jobTitle, job);
     //   CustomListeners.node.log(Status.PASS, "Enter JobTitle '" + job + "' to JobTitle field : "
       //         + jobTitle.getText());
        Reporter.log("Enter JobTitle" + job + " to email JobTitle " + jobTitle.getText() + "<br>");
    }


    public void enterLocation(String location1) {

        sendTextToElement(location, location1);

      //  CustomListeners.node.log(Status.PASS, "Enter JobTitle '" + location1 + "' to JobTitle field : "
       //         + jobTitle.getText());
        Reporter.log("Enter JobTitle" + location1 + " to  JobTitle " + location.getText() + "<br>");

    }
    public void selectDistance(String distance) {
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
         //   CustomListeners.node.log(Status.PASS, "Enter distance '" + distance + "' to distance field : "
        //            + jobTitle.getText());
            Reporter.log("Enter distance" + distance + " to distance " + distanceDropDown.getText() + "<br>");

    }
    public void clickonDistanceDropDown(){
        clickOnElement(distanceDropDown);
    }
    public void selectvalueFromDropDown(String value){
        selectByValueFromDropDown(distanceDropDown,value);
    }

    public void clickOnMoreSearchOptionLink() {
        clickOnElement(moreSearchOptionsLink);

        Reporter.log(" click on MoreSearch  " + moreSearchOptionsLink.toString() + "<br");
         CustomListeners.test.log(Status.PASS,"Click on more search options");
    }

    public void enterMinSalary(String minSalary) {
        selectByVisibleTextFromDropDown(salaryMin, minSalary);
        Reporter.log(" minsalary " +minSalary+ "to min salary field" +salaryMin.toString() + "<br>");
        CustomListeners.test.log(Status.PASS,"Enter min salary " + minSalary);

    }

    public void enterMAxSalary(String maxSalary) {
        selectByVisibleTextFromDropDown(salaryMax, maxSalary);

        Reporter.log(" maxsalary " +maxSalary+ "to max salary field" +salaryMax.toString() + "<br>");
        CustomListeners.test.log(Status.PASS,"Enter max salary " + maxSalary);

    }

    public void selectSalaryType(String sType) {
        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType);
        Reporter.log(" salary  " +sType+ "to salary field" +salaryTypeDropDown.toString() + "<br>");
        CustomListeners.test.log(Status.PASS,"Enter salary Type " + sType);
    }

    public void selectJobType(String jobType) {
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
        Reporter.log(" job Type  " +jobType+ "to job Type field" + jobTypeDropDown.toString() + "<br>");
        CustomListeners.test.log(Status.PASS,"Enter salary Type " + jobType);

    }

    public void clickOnFindJobsButton() {
        findJobsBtn.click();
        Reporter.log(" click on Find Jobs button  " + findJobsBtn.toString() + "<br");
        CustomListeners.test.log(Status.PASS,"Click on more search options");
    }



    }




