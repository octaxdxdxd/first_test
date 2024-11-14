package org.example.demoqa;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormaPage {

    public  static WebDriver driver;

    @FindBy(id="firstName")
    private WebElement firstNameEl;

    @FindBy(id="lastName")
    private WebElement lastNameEl;

    @FindBy(id="userEmail")
    private WebElement userEmailEl;

    @FindBy(id="gender-radio-1")
    private WebElement genderEl;

    @FindBy(id="state")
    private WebElement stateEl;
    private JavascriptExecutor executor;

    public FormaPage(WebDriver driver){
        FormaPage.driver = driver;
        executor = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }

    public void setFirstNameEl(String firstNameParam) {
        firstNameEl.sendKeys(firstNameParam);
    }

    public void setLastNameEl(String lastNameParam) {
        lastNameEl.sendKeys(lastNameParam);
    }

    public void setUserEmailEl(String userEmailParam) {
        userEmailEl.sendKeys(userEmailParam);
    }

    public void setMailGender(){
        genderEl.sendKeys(" ");
    }

    public void setState(String stateParam){
        executor.executeScript("arguments[0].scrollIntoView(true);", stateEl);
        stateEl.click();
    }
}
