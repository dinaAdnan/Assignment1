package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscriptionPage {

    public SubscriptionPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "country-btn")
    private WebElement currentCountryBtn;

    @FindBy(id = "eg")
    private WebElement egypt;
    @FindBy(id = "ae")
    private WebElement ae;

    @FindBy(id = "name-lite")
    private WebElement nameLite;

    @FindBy(id = "name-classic")
    private WebElement nameClassic;

    @FindBy(id = "name-premium")
    private WebElement namePremium;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div[3]/div[1]")
    private WebElement currency;

    public void clickCurrentCountryBtn() {
        this.currentCountryBtn.click();
    }

    public void clickSelectCountry(String country) {
        switch (country) {
            case "eg":
                egypt.click();
                break;
            case "ae":
                ae.click();
                break;
        }
    }

    public WebElement getNameLite() {
        return nameLite;
    }

    public WebElement getNameClassic() {
        return nameClassic;
    }

    public WebElement getNamePremium() {
        return namePremium;
    }

    public WebElement getCurrency() {
        return currency;
    }

}
