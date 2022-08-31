package utilities;


import com.github.javafaker.Faker;



import pojos.Registrant;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.Registration;
import pojos.Registrant;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.apache.commons.lang3.time.DateUtils.addDays;

public class YeniKullaniciOlusturma {
    public static void yeniKayitOlusturma() {
        String login;//username
        String firstName;
        String lastName;
        String email;
        String password;
        String ssn;
        Faker faker = new Faker();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        Actions actions = new Actions(Driver.getDriver());
        Registrant registrant = new Registrant();//pojo
        Registration registerPage = new Registration();//page
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        registerPage.profilSimgesi.click();
        registerPage.register.click();
        //ssn
        ssn = faker.idNumber().ssnValid();
        registrant.setSsn(ssn);
        registerPage.ssn.click();
        registerPage.ssn.sendKeys(ssn);
        //firstName
        firstName = faker.name().firstName();
        registrant.setFirstName(firstName);
        registerPage.firstName.sendKeys(firstName);
        //lastName
        lastName = faker.name().lastName();
        registrant.setLastName(lastName);
        registerPage.lastName.sendKeys(lastName);
        //userName
        login = registrant.getFirstName() + registrant.getLastName();
        registrant.setLogin(login);
        registerPage.userName.sendKeys(login);
        //email
        email = faker.internet().emailAddress();
        registrant.setEmail(email);
        registerPage.email.sendKeys(email);
        //password
        password = faker.internet().password(8, 20, true, true);
        registrant.setPassword(password);
        registerPage.password.sendKeys(password);
        Driver.waitAndSendText(registerPage.confirmPassword, password);

        js.executeScript("arguments[0].click();", registerPage.registerButton);
        ReusableMethods.waitFor(3);
        Assert.assertTrue(registerPage.successMessageRegistrationSaved.isDisplayed());

    }
}