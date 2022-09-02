package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.us_pages.US027_AdMesPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class US027_AdminMessagesStep {

    US027_AdMesPage admes=new US027_AdMesPage();

    @Given("Admin Medunna Url'ine navigate yapar")
    public void admin_medunna_url_ine_navigate_yapar() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }

    @When("Admin User Icona tıklar")
    public void admin_user_ıcona_tıklar() {
       admes.userIcon.click();
       Driver.wait(2);

    }

    @When("Admin SignIn seceneğine tıklar")
    public void admin_sign_in_seceneğine_tıklar() {
        admes.signIn.click();
        Driver.wait(2);

    }

    @When("Admin geçerli username olarak {string} girer")
    public void admin_gecerli_username_olarak_girer(String username) {
        admes.usernameTextbox.sendKeys(username);

    }

    @When("Admin geçerli password olarak {string} girer")
    public void admin_geçerli_password_olarak_girer(String password) {
        admes.passwordTextbox.sendKeys(password);

    }

    @When("Admin signIn butonuna tıklar")
    public void admin_sign_ın_butonuna_tıklar() {
        admes.signInButton.submit();

    }

    @Then("Admin Administration sayfasında olduğunu doğrular")
    public void admin_administration_sayfasında_olduğunu_doğrular() {
        Assert.assertTrue(admes.administrationDropdown.isDisplayed());

    }

    @Then("Admin items and titles dropdownuna tıklar")
    public void admin_items_and_titles_dropdownuna_tıklar() {
      admes.ıtemsAndTitlesDropDown.click();
      Driver.wait(1);
    }

    @Then("Admin messages butonuna tıklar")
    public void admin_messages_butonuna_tıklar() {
        admes.ıtemsAndTitlesDropdownMessagesButton.click();
        Driver.wait(2);
    }

    @Then("Admin messages sayfasının görüntülendiğini doğrular")
    public void admin_messages_sayfasının_görüntülendiğini_doğrular() {
        Driver.wait(1);
        Assert.assertTrue(admes.messagePageMessagesText.isDisplayed());
    }
    @Then("Admin tüm isimlerin, maillerin ve mesajların görüntülendiğini doğrular")
    public void admin_tüm_isimlerin_maillerin_ve_mesajların_görüntülendiğini_doğrular() {
        int msjSize=admes.allMessages.size();
        System.out.println("size"+ msjSize);
        List<WebElement> allTable=admes.allMessages;
        List<String> arrData=new ArrayList<>();
        int cellNum=1;
        List<WebElement> allRows=Driver.getDriver().findElements(By.xpath("//table//tbody//tr"));

        for (WebElement allTableData: allRows) {
            arrData.add(allTableData.getText());

            System.out.println(cellNum+":" + allTableData.getText().replace("View\n" +
                    "Edit\n" +
                    "Delete",""));
            cellNum++;

        }
       List<WebElement> idList=admes.messagesIdColumn;
       int idSize=idList.size();
       List<String> arrIdList=new ArrayList<>();
        for (WebElement eachidCell:idList) {
            arrIdList.add(eachidCell.getText());

        }
        System.out.println("arrIdList:" + arrIdList);

        List<WebElement> nameList=admes.messagesNameColumn;
        int nameSize=nameList.size();
        List<String> arrNameList=new ArrayList<>();
        for (WebElement eachNameCell:nameList) {
            arrNameList.add(eachNameCell.getText());
        }
        System.out.println("arrNameList : " +arrNameList);

        List<WebElement> mailList=admes.messagesEmailColumn;
        int emailSize=mailList.size();
        List<String> arrMailList=new ArrayList<>();
        for (WebElement eachEmailCell:mailList) {
            arrMailList.add(eachEmailCell.getText());
        }
        System.out.println("arrMailList: " +arrMailList);

        List<WebElement> subjectList=admes.messagesSubjectColumn;
        int subjectSize=subjectList.size();
        List<String> arrSubjectList=new ArrayList<>();
        for (WebElement eachSubjectCell:subjectList) {
            arrSubjectList.add(eachSubjectCell.getText());
        }
        System.out.println("arrSubjectList: " + arrSubjectList);

        List<WebElement> messageList=admes.messagesMessageColumn;
        int messageSize=messageList.size();
        List<String> arrMessageList=new ArrayList<>();
        for (WebElement eachMessageCell:messageList) {
            arrMessageList.add(eachMessageCell.getText());
        }
        System.out.println("arrMessageList :" +arrMessageList);

    }
    @Then("Admin sayfayı kapatır")
    public void admin_sayfayı_kapatır() {
       Driver.closeDriver();
    }

    @Then("Admin Create a new Message butonuna tıklar")
    public void admin_create_a_new_message_butonuna_tıklar() {
        Driver.waitAndClick(admes.createANewMessage);
    }

    @Then("Admin Create or edit a message sayfasının görüntülendiğini doğrular")
    public void admin_create_or_edit_a_message_sayfasının_görüntülendiğini_doğrular() {
        Assert.assertTrue(admes.createOrEditAMessagePageText.isDisplayed());
    }

    @Then("Admin name tex box'ına {string} girer")
    public void admin_name_tex_box_ına_girer(String Name) {
       admes.messageNameTextBox.sendKeys(Name);
    }

    @Then("Admin email tex box'ına {string} girer")
    public void admin_email_tex_box_ına_girer(String Email) {
        admes.messageEmailTextBox.sendKeys(Email);
    }

    @Then("Admin subject tex box'ına {string} girer")
    public void admin_subject_tex_box_ına_girer(String Subject) {
        admes.messageSubjectTextBox.sendKeys(Subject);
    }

    @Then("Admin message tex box'ına {string} girer")
    public void admin_message_tex_box_ına_girer(String Message) {
        admes.messageMessageTextBox.sendKeys(Message);
    }

    @Then("Admin save butonuna tıklar message olustur yada düzenle sayfasında")
    public void admin_save_butonuna_tıklar_message_olustur_yada_düzenle_sayfasında() {
        Driver.waitAndClick(admes.createOrEditAMessageSaveButton);

    }

    @Then("Admin message oluşturma işleminin başarıyla tamamlandığını doğrular")
    public void admin_message_oluşturma_işleminin_başarıyla_tamamlandığını_doğrular() {
        Driver.wait(2);
        Assert.assertTrue(admes.successfullyCreatedANewMessageText.isDisplayed());
    }

    @Then("Admin messages sayfasında edit butonuna tıklar")
    public void admin_messages_sayfasında_edit_butonuna_tıklar() {
       Driver.waitAndClick(admes.messagePageFirstEditButton);
    }

    @Then("Admin yeni name olarak {string} girer")
    public void admin_yeni_name_olarak_girer(String Name) {
        Driver.wait(2);
        admes.messageNameTextBox.clear();
        Driver.waitAndSendText(admes.messageNameTextBox,Name,1);
    }

    @Then("Admin yeni email olarak {string} girer")
    public void admin_yeni_email_olarak_girer(String Email) {
        admes.messageEmailTextBox.clear();
        Driver.waitAndSendText(admes.messageEmailTextBox,Email,1);
    }

    @And("Admin yeni subject olarak {string} girer")
    public void adminYeniSubjectOlarakGirer(String Subject) {
        admes.messageSubjectTextBox.clear();
        Driver.waitAndSendText(admes.messageSubjectTextBox,Subject,1);
    }

    @Then("Admin yeni message olarak {string} girer")
    public void admin_yeni_message_olarak_girer(String Message) {
        admes.messageMessageTextBox.clear();
        Driver.waitAndSendText(admes.messageMessageTextBox,Message,1);
    }

    @Then("Admin mesajı değişikliği işleminin başarılı olduğunu görüntüler")
    public void admin_mesajı_değişikliği_işleminin_başarılı_olduğunu_görüntüler() {
         Driver.wait(2);
         Assert.assertTrue(admes.succesfullyUpdatedMessageText.isDisplayed());
    }

    @Then("Admin messages sayfasındaki delete butonuna tıklar")
    public void admin_messages_sayfasındaki_delete_butonuna_tıklar() {
        Driver.waitAndClick(admes.messagePageFirstDeleteButton);
    }

    @Then("Admin delete confirmation text'inin görüntülendiğini doğrular")
    public void admin_delete_confirmation_text_inin_görüntülendiğini_doğrular() {
         Driver.wait(2);
         Assert.assertTrue(admes.deleteConfirmationText.isDisplayed());
    }

    @Then("Admin delete confirmation box'ındaki delete butonuna tıklar")
    public void admin_delete_confirmation_box_ındaki_delete_butonuna_tıklar() {
        Driver.waitAndClick(admes.deleteConfirmationBoxDeleteButton);
    }

    @Then("Admin silme işleminin başarılı olduğunu görüntüler")
    public void admin_silme_işleminin_başarılı_olduğunu_görüntüler() {
        Driver.wait(2);
        Assert.assertTrue(admes.succesfullyDeletedMessageText.isDisplayed());

    }


}
