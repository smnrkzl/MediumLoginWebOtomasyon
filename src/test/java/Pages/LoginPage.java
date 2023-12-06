package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import static java.time.Duration.ofSeconds;

public class LoginPage {
    WebDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);}


    By mailBox = By.xpath("//div/input[@id='login-email']");
    By passwordBox = By.xpath("//div/input[@id='login-password-input']");
    By signupButton = By.xpath("//div//button[@type='submit']");

    public void userAtRegisterPage() {
        driver.get("https://www.trendyol.com/giris?cb=%2F%3Fysclid%3Dlpqjzw47g9526432461");
    }

    public void enterEmailField(String mail) {
        elementHelper.click(mailBox);
        elementHelper.sendKey(mailBox,"examplemail@gmail.com");
    }

    public void enterPasswordField(String password) {
        elementHelper.click(passwordBox);
        elementHelper.sendKey(passwordBox,"password123456");
    }

    public void clickOnTheSignUp() {
        elementHelper.click(signupButton);
    }




}
