package org.amex.assignment.pages;

import org.amex.assignment.objects.User;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class UserDeatilsPage extends BasePage {
	private final By title = By.id("MR");
    private final By firstnameFld = By.id("fieldControl-input-firstName");
    private final By lastNameFld = By.id("fieldControl-input-lastName");
    private final By dateOfBirthFld = By.id("fieldControl-input-dateOfBirth");
    private final By phoneNumberFld = By.id("fieldControl-input-mobilePhoneNumber");
    private final By emailFld = By.id("fieldControl-input-email");
    private final By saveBtn = By.xpath("//button[text()='Sauvegarder et Continuer']");
 


    private final By overlay = By.cssSelector(".blockUI.blockOverlay");


    public UserDeatilsPage(WebDriver driver) {
        super(driver);
    }

  

    public UserDeatilsPage enterFirstName(String firstName){
        WebElement e = waiter.until(ExpectedConditions.visibilityOfElementLocated(firstnameFld));
        e.clear();
        e.sendKeys(firstName);
        return this;
    }

    public UserDeatilsPage enterLastName(String lastName){
        WebElement e = waiter.until(ExpectedConditions.visibilityOfElementLocated(lastNameFld));
        e.clear();
        e.sendKeys(lastName);
        return this;
    }

//    public UserDeatilsPage selectCountry(String countryName) {

//        select.selectByVisibleText(countryName);*/
//        wait.until(ExpectedConditions.elementToBeClickable(alternateCountryDropDown)).click();
//        WebElement e = wait.until(ExpectedConditions.elementToBeClickable(
//                By.xpath("//li[text()='" + countryName + "']")));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e);
//        e.click();
//        return this;
//    }

    public UserDeatilsPage enterDateOfBirth(String dateOfBirth){
        WebElement e = waiter.until(ExpectedConditions.visibilityOfElementLocated(dateOfBirthFld));
        e.clear();
        e.sendKeys(dateOfBirth);
        return this;
    }

    public UserDeatilsPage enterphoneNumber(String phoneNumber){
        WebElement e = waiter.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberFld));
        e.clear();
        e.sendKeys(phoneNumber);
        return this;
    }
    
    public UserDeatilsPage enterEmail(String email){
        WebElement e = waiter.until(ExpectedConditions.visibilityOfElementLocated(emailFld));
        e.clear();
        e.sendKeys(email);
        return this;
    }

//    public UserDeatilsPage selectState(String stateName){

//        select.selectByVisibleText(stateName);*/
//        wait.until(ExpectedConditions.elementToBeClickable(alternateStateDropDown)).click();
//        WebElement e = wait.until(ExpectedConditions.elementToBeClickable(
//                By.xpath("//li[text()='" + stateName + "']")));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e);
//        e.click();
//        return this;
//    }

  

   

    public UserDeatilsPage setUserDetails(User user) throws InterruptedException {
        return enterFirstName(user.getFirstName()).
                enterLastName(user.getLastName()).
                enterDateOfBirth(user.getdateOfBirth()).
                enterphoneNumber(user.getphoneNumber()).
                enterEmail(user.getEmail());
               
    }

    public UserDeatilsPage clickTitle(){
      //  waitForOverlaysToDisappear(overlay);
        driver.findElement(title).click();
        return this;
    }






    public UserDeatilsPage clickSaveBtn(){
        waiter.until(ExpectedConditions.elementToBeClickable(saveBtn)).click();
        return this;
    }

//    private UserDeatilsPage waitForLoginBtnToDisappear(){
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(loginBtn));
//        return this;
//    }



//    public String getProductName() throws Exception {
//        int i = 5;
//        while(i > 0){
//            try {
//                return wait.until(ExpectedConditions.visibilityOfElementLocated(productName)).getText();
//            }catch (StaleElementReferenceException e){
//                System.out.println("NOT FOUND. TRYING AGAIN" + e);
//            }
//            Thread.sleep(5000);
//            i--;
//        }
//        throw new Exception("Element not found");

}