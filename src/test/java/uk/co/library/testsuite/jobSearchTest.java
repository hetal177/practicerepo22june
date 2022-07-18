package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;
import uk.co.library.Utility.Utility;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;

public class jobSearchTest extends TestBase {

    HomePage homepage;
    ResultPage resultPage;
    Utility uti;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homepage = new HomePage();
        resultPage = new ResultPage();
        uti = new Utility();
    }

    @Test(dataProvider = "JobSearchData", dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location,
                                                           String distance) { //String salaryMin, String salaryMax, String salaryType, String jobType, String result) {
        SoftAssert softAssert = new SoftAssert();

        homepage.setAcceptCookiesFromIFrameById();
        homepage.enterJobTitle(jobTitle);
        homepage.enterLocation(location);

        homepage.clickonDistanceDropDown();
        homepage.selectvalueFromDropDown(distance);
        Thread.sleep(5000);
        homepage.clickOnMoreSearchOptionLink();
        /*homepage.enterMinSalary(salaryMin);
        homepage.enterMAxSalary(salaryMax);
        homepage.selectSalaryType(salaryType);
        homepage.selectJobType(jobType);
        homepage.clickOnFindJobsButton();
        softAssert.assertEquals("Results Per Page:", resultPage.getTextFromResultText(), "Verification failed : Results Per Page:");
        softAssert.assertAll();
*/

    }
}


