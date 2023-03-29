package test_cases;

import base_test.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import page_objects.SubscriptionPage;

import static utils.XMLReader.getXMLData;

public class PackagesTest extends BaseTest {

    @Test(description = "verify egypt packages,price & currency")
    public void verifyPackagesEG() throws InterruptedException {
        SubscriptionPage subscriptionPage=new SubscriptionPage(driver);
        subscriptionPage.clickCurrentCountryBtn();
        subscriptionPage.clickSelectCountry("eg");
        Thread.sleep(5000);

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(getXMLData("eg"),subscriptionPage.getCurrency().getText());
        softAssert.assertEquals(subscriptionPage.getNameLite().getText(),getXMLData("package1"));
        softAssert.assertEquals(subscriptionPage.getNameClassic().getText(),getXMLData("package2"));
        softAssert.assertEquals(subscriptionPage.getNamePremium().getText(),getXMLData("package3"));
        softAssert.assertAll();
    }

    @Test(description = "verify ae packages,price & currency")
    public void verifyPackagesAE() throws InterruptedException {
        SubscriptionPage subscriptionPage=new SubscriptionPage(driver);
        subscriptionPage.clickCurrentCountryBtn();
        subscriptionPage.clickSelectCountry("ae");
        Thread.sleep(5000);

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(getXMLData("ae"),subscriptionPage.getCurrency().getText());
        softAssert.assertEquals(subscriptionPage.getNameLite().getText(),getXMLData("package1"));
        softAssert.assertEquals(subscriptionPage.getNameClassic().getText(),getXMLData("package2"));
        softAssert.assertEquals(subscriptionPage.getNamePremium().getText(),getXMLData("package3"));
        softAssert.assertAll();
    }
}
